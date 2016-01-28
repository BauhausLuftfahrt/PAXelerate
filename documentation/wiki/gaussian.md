# Gaussian Distribution #

In order to use the gaussian distribution, simply call the following method:


```
#!java
FuncLib.gaussianRandom(double average, GaussOptions option, double deviation);
```
The average value is the peak value of the gaussian distribution.

The option is one of the following values:

* 50%
* 90%
* 95%
* 99%

Choosing one of this options will calculate the sigma correctly.

The deviation is the range in which e.g. 95% of the generated numbers will be.

So let's say you want to generate a value out of the normal distribution with the peak at 100.
Then you would define that 95% of the values should be within the range of +/- 10, so within 90 and 110.

Then your function would look like this:

```
#!java
FuncLib.gaussianRandom(100, GaussOptions.PERCENT_95, 10);
```