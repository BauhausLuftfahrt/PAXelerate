# PAXelerate Boarding Simulation

Welcome to the repository of [PAXelerate](http://www.paxelerate.com) - an open source passenger flow simulation framework for advanced aircraft cabin layouts! 

## Recent Changes

Due to the reworking of the entire project, there is currently no client version available. Feel free to check out the source code and discover all the changes of the latest release:

* Removal of all openCDT dependencies
* Removal of custom EMF aircraft model library
* Introduction of CPACS as input data structure
* Focus on boarding simulation, hence removal of UI and cabin configuration options for now
* Introduction of COVID-19 exposure tracking
* Transition to CPACS 3.4

## Installation

1. Install the latest version of the [Eclipse modelling tools](http://www.eclipse.org/downloads/) and Java JDK 8 or later.
2. Checkout [PAXelerate](http://github.com/BauhausLuftfahrt/PAXelerate) from the main branch
3. Checkout [Java CPACS Parser](https://github.com/BauhausLuftfahrt/Java-CPACS-Parser) from the main branch
4. Checkout [Java Toolbox](https://github.com/BauhausLuftfahrt/BHLJavaToolbox) from the main branch
5. Launch `StartPAXelerate.java` in `com.paxelerate.execution` -> `main`

## Usage

1. Be sure to make yourself familiar with CPACS and the "deck" and "toolspecific" node.
2. Take a look at the `example.xml` file in the example folder. You will find the
	* *deck node*: In this node, all cabin definition is done. Manipulate this node to change the cabin layout itself.
	* *toolspecific node*: In this node, all properties which are required for the simulation can be found ([details](cpacs_schema/documentation.md)). Also take a look into the .xsd file for possible input restrictions.
3. Run `StartPAXelerate.java` in the `com.paxelerate.execution` package under execution -> main.
4. Select the CPACS cabin file you want to simulate and run it.
5. Wait for the simulation to complete.
6. Take a look at the data output under your personal documents folder at `<user-path>/documents/paxelerate/`.

## Contributors 

Marc Engelmann, Tim Kleinheinz, Michael Schmidt, Raoul Rothfeld, Michael Shamiyeh, Martin Glas, Tobias Brügge-Zobel, Stefan Weber, Pedro Martinez and Philipp Osterrieder. *(listed in order of activity)*

## About

Copyright (c) since 2014 [Bauhaus Luftfahrt e.V.](http://www.bauhaus-luftfahrt.net/?set_language=en) All rights reserved. [PAXelerate](http://www.paxelerate.com) and the accompanying materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution, and is available at https://www.gnu.org/licenses/gpl-3.0.html.en.

## Publications
Following is a list of research publications related to PAXelerate. An overview of the PAXelerate research project progess can be found on [ResearchGate](https://www.researchgate.net/project/PAXelerate-An-open-source-passenger-flow-simulation-framework-for-advanced-aircraft-cabin-layouts).

### 2021
* Engelmann, M.; Hornung, M. (2021): [Boarding Assessment and COVID-19 Considerations for the AVACON Aircraft Cabin Concepts](https://publikationen.dglr.de/?tx_dglrpublications_pi1%5bdocument_id%5d=550012). Deutsche Gesellschaft für Luft- und Raumfahrt - Lilienthal-Oberth e.V.. (Text). https://doi.org/10.25967/550012

### 2020

* M. Engelmann, T. Kleinheinz, and M. Hornung, [Advanced Passenger Movement Model Depending On the Aircraft Cabin Geometry](https://www.mdpi.com/2226-4310/7/12/182), Aerospace, vol. 7, no. 12, p. 182, Dec. 2020.

* Engelmann, M.; Drust, D.; Hornung, M. (2020): [Automated 3D cabin generation with PAXelerate and Blender using the CPACS file format.](https://publikationen.dglr.de/?tx_dglrpublications_pi1%5bdocument_id%5d=530014) Deutsche Gesellschaft fürLuft- und Raumfahrt - Lilienthal-Oberth e.V.. (Text). https://doi.org/10.25967/530014.

### 2019

* Engelmann, M.; Hornung, M. (2019): [Boarding Process Assessment of the AVACON Research Baseline Aircraft](https://publikationen.dglr.de/?tx_dglrpublications_pi1%5bdocument_id%5d=490049) Deutsche Gesellschaft für Luft- und Raumfahrt - Lilienthal-Oberth e.V.. (Text). https://doi.org/10.25967/490049.

### 2018

* Schmidt, M.: [Ground-Operational Assessment of Novel Aircraft Cabin Configurations](https://mediatum.ub.tum.de/?id=1381821), Dissertation, Technical University of Munich, 2018.

* Schultz, M. and Schmidt, M.: Advancements in passenger processes at airports – An aircraft perspective, Transportation Research Arena (TRA), Vienna, Austria, 2018.

* Yildiz, B., Förster, P., Feuerle, T., Hecker, P., Bugow, S., and Helber, S.: [A Generic Approach to Analyze the Impact of a Future Aircraft Design on the Boarding Process](http://www.mdpi.com/1996-1073/11/2/303), Energies, vol. 11, 2018, p. 303.

### 2017

* Schmidt, M.: [A review of aircraft turnaround operations and simulations](http://www.sciencedirect.com/science/article/pii/S0376042117300039), Progress in Aerospace Sciences, Volume 92, July 2017,
Pages 25-38. doi: 10.1016/j.paerosci.2017.05.002

* Schmidt, M. and Heinemann, P.: [Improving the Boarding Performance of Regional Aircraft](https://arc.aiaa.org/doi/abs/10.2514/6.2017-3424), AIAA Aviation, American Institute of Aeronautics and Astronautics Denver, Colorado, USA, 2017.

* Schmidt, M., Heinemann, P. and Hornung, M.: [Boarding and Turnaround Process Assessment of Single- and Twin-Aisle Aircraft](https://arc.aiaa.org/doi/abs/10.251 /6.2017-1856), 55th AIAA Aerospace Sciences Meeting, American Institute of Aeronautics and Astronautics, Grapevine, Texas, USA, 2017. doi:10.2514/6.2017-1856

### 2016

* Schmidt, M., Engelmann, M., Rothfeld, R. and Hornung, M.: [Boarding Process Assessment of Novel Aircraft Cabin Concepts](http://www.icas.org/ICAS_ARCHIVE/ICAS2016/data/papers/2016_0218_paper.pdf), 30th International Congress of the Aeronautical Sciences (ICAS), Daejeon, South Korea, 2016.

* Schmidt, M., Engelmann, M., Brügge-Zobel, T., Hornung, M., and Glas, M.:
[PAXelerate - An Open Source Passenger Flow Simulation Framework for Advanced Aircraft Cabin Layouts](https://arc.aiaa.org/doi/abs/10.2514/6.2016-1284), 54th AIAA Aerospace Sciences Meeting, American Institute of Aeronautics and Astronautics, San Diego, California, USA, 2016. doi:10.2514/6.2016-1284

