# PAXelerate Boarding Simulation

Welcome to the repository of [PAXelerate](http://www.paxelerate.com) - an open source passenger flow simulation framework for advanced aircraft cabin layouts! 

## Recent Changes

Due to the reworking of the entire project, there is currently no client version available. Feel free to check out the source code and discover all the changes of the latest release:

* Removal of all openCDT dependencies
* Removal of custom EMF aircraft model library
* Introduction of CPACS as input data structure
* Focus on boarding simulation, hence removal of UI and cabin configuration options for now

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
	* *toolspecific node*: In this node, all properties which are required for the simulation can be found ([details](schema/documentation.md)).
3. Run `StartPAXelerate.java` in the `com.paxelerate.execution` package under execution -> main.
4. Select the CPACS cabin file you want to simulate and run it.
5. Wait for the simulation to complete.
6. Take a look at the data output under your personal documents folder at `<user-path>/documents/paxelerate/`.

## Contributors 

Marc Engelmann, Tim Kleinheinz, Michael Schmidt, Raoul Rothfeld, Michael Shamiyeh , Martin Glas, Tobias Brügge-Zobel, Stefan Weber, Pedro Martinez and Philipp Osterrieder. *(listed in order of activity)*

## About

Copyright (c) 2014-2021 [Bauhaus Luftfahrt e.V.](http://www.bauhaus-luftfahrt.net/?set_language=en) All rights reserved. [PAXelerate](http://www.paxelerate.com) and the accompanying materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution, and is available at https://www.gnu.org/licenses/gpl-3.0.html.en.
