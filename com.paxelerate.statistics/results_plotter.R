# Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
# materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
# and is available at https://www.gnu.org/licenses/gpl-3.0.html.en 

# Author: Marc Engelmann
# Date: 29.07.2021

# Libraries

library(magrittr) 
library(ggplot2)

library(tidyverse)
library(hrbrthemes)
library(viridis)

# create a dataset
x = c(10.18791905,10.03692284,9.863538217,9.466769709,9.832905618,10.05520766,10.30696814,10.19111265,10.25718884,9.72524742,10.70155832,9.592854889,10.65460761,9.017076404,10.95822993,10.34052909,9.806069448,9.837891391,10.77020375,9.846959568,9.834255069,10.66859957,10.48931013,10.89957405,9.941588095,10.04978007,10.02034063,10.53940297,10.53560262,9.762955207,10.40028448,10.02884562,9.742391642,10.12051474,10.37768119,10.01365436,10.40575332,10.08975132,9.5077075,10.33851169,10.15738629,10.3391985,9.458152964,10.103645,10.11009146,10.41407726,9.503858999,9.829726525,10.45576331,10.4268259)

data_title = "Average duration of contacts"
data_content = "Average duration"
data_unit = "s"

bhl_blue = "#6ab9ec"
bhl_orange = "#d7801c"

data <- data.frame(
  name=c(rep("",length(x))),value=c(x))

# Normality test: if p > 0.05 then normal distribution can be assumed

# Test normality of x
p <- shapiro.test(x)$p.value

# Test normality of y
#shapiro.test(y)

# Test difference in variance
# if p > 0.05, then there is no difference in the variance
#var.test(x, y, alternative = "two.sided")

# Test if results are significantly different
# if p > 0.05, the result differences are insignificant.
#t.test(x,y)
#wilcox.test(x, y)


# Create a box plot
data %>%
  ggplot( aes(x=name, y=value, fill=name)) +
  geom_boxplot() +
  #scale_fill_viridis(discrete = TRUE, alpha=0.5) +
  scale_fill_manual(values=c(bhl_orange,bhl_blue)) +
  geom_jitter(color="black", size=1.5, alpha=1) +
  theme_ipsum() +
  theme(
    legend.position="none",
    plot.title = element_text(size=11,hjust = 0.5),
    text = element_text(family = "Palatino Lino", color = "black"),
  ) +
  labs(caption = sprintf("mean = %.3f, p-value = %.5f (normality%s confirmed)",mean(x),p , (if (p < 0.05) " not" else ""))) +
  ggtitle(sprintf("%s (n=%i)",data_title,length(x))) +
  xlab("")+ylab(sprintf("%s [ %s ]", data_content,data_unit)) +theme(axis.title.y=element_text(size = 12, hjust=0.5, vjust = 5))

# Create a histogram
h<-hist(x, col=bhl_blue, main =sprintf("%s (n=%i)",data_title,length(x)), ylab = "Frequency",xlab=sprintf("%s [ %s ]", data_content,data_unit), sub=sprintf("mean = %.3f, p-value = %.3f (normality%s confirmed)",mean(x), p , (if (p < 0.05) " not" else "")),cex.sub = 0.7, cex.main = 1) #,ylim = c(0,13))

# Add a normal distribution line to the box plot if the data is normally distributed
if (p > 0.05) {
  xfit<-seq(min(x),max(x),length=length(x))
  yfit<-dnorm(xfit,mean=mean(x),sd=sd(x))
  yfit <- yfit*diff(h$mids[1:2])*length(x)
  lines(xfit, yfit, col=bhl_orange, lwd=4) 
  abline(v=mean(x),col="red",lwd = 2, lty = "dashed")
}
