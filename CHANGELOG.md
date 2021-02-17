# Changelog

## PAXelerate - Rework in progress

Recent Changes

Due to the reworking of the entire project, there is currently no client version available. Feel free to check out the source code and discover all the changes of the latest release:

* Removal of all openCDT dependencies
* Removal of custom EMF aircraft model library
* Introduction of CPACS as input data structure
* Focus on boarding simulation, hence removal of UI and cabin configuration options for now

## PAXelerate - Version Alpha 0.7 / 2016-07-01

This release focused on stability and performance issues, especially in terms of batch simulation capabilities. Improvements on the thread handling allows to run multiple iterations with the SDK version. 

**Fixed bugs**
- #140 Error in CreatePassengers
- #119 Passenger sorting options do not work
- #141 Walking speed correcting

**UI improvements**
- #80 UI viewmodel descriptions and repositioning
- #49 Enforce threading for UI & pathfinding calculations
- #124 When refreshing the cabin, the delays for the passengers are not recalculated 
- #69 Detect overlap of objects 
- #122 Implement Load Factor as Double Value

**Model improvements**
- #87 Merge different TravelClasses and Doors into on single Class
- #77 Simultaneous door entry with multiple doors 
- #5 Refine potential generation around obstacle 
- #48 Pathfinding with more than one aisle
- #72 Merge Obstacle Map and AreaMap
- #86 Evaluate agent behaviour and tasks
- #120 Remove Static Potential Gradient in Aisle and Door Area to support multiple aisles and unconventional cabin layouts 
- #123 When making way for a passenger boarding from the rear entrance, the blocking line blocks the passenger itself
- #125 Calculate agent waiting time 
- #127 Way making procedure for more then one passenger sitting
- #132 checkPassengerAssignments: recalculate the delay
- Agent behaviour for foldable seats (SDK version)

**Misc improvements**
- #26 Create JavaDoc
- #28 Ensure compatibility with MacOS
- #1 Terminate threads after simulation to reduce CPU load
- #142 Implementation of data export functionalities
- Batch simulation capabilities (SDK version)
- Result data mining during simulation
- Introduces developer mode with enhanced functions and output


We are happy to receive your feedback. If you discover any bugs, please attach the log file stored in `workspace/.metadata/` to your [bug report](https://github.com/BauhausLuftfahrt/PAXelerate/issues/new).

---


## PAXelerate - Version Alpha 0.6 / 2016-03-31

This release focused on additional functionalities as well as more stability. The passenger generation and simulation views are now unsynced from the main GUI which prohibits the GUI from freezing during calculations. Enhancements can be found in the UI and workflow.

**Fixed bugs**

- #105 GeneratePassengers without door causes error 
- #101 Scaling of lavatory and galley icon 
- #84 Right Click menu with "generate pax" & "simulate" is shown on every element and folder
- #83 On first startup, model elements are not listed
- #82 Exception is thrown when launching PAXelerate for the first time
- #75 Simulation: pathfinding cannot be initiated
- #71 Performance Issues During Simulation
- #23 Check monument dimensions != 0
- #21 Simulation view and cabin view are mirror-inverted
- #17 Scale aircraft image according to view width
- #16 Fixed diagonal walking of agents
- #8 Switch all x and y assignments for the vector class

**UI improvements**
- #104 Provide more information in dialog CloneObject
- #81 Added menu to add views 
- #78 Prohibit selection of top level meta model elements in model explorer
- #64 Change description and output of ConsoleView
- #47 Harmonize icons design
- #36 Reorganize simulation properties
- #32 WelcomePage: Additional Info to Get Started
- #15 Reorder parameter for re-positioning
- #14 Row cloning function
- #12 Create keyboard shortcuts for context menus
- #7 Show Units for each variable in the Model Explorer

**Model improvements**
- #103 GeneratePassengers class dramatically improved & shortened
- #102 Passenger sorting: decouple from cabin view refresh and enhance input window
- #76 Define aircraft load factor as parameter
- #24 Redefine seat pitch as distance between seat back rests
- #20 Variation of luggage stowing row
- #19 Differentiation between stowing tasks
- #3 Check time of seat interference task

**Misc improvements**

- #97 Generate Cabin loops unnecessarily over redraw (instead of once at the end)
- #93 Refresh Passenger Properties after agents are created
- #89 Clean up descriptions in plugin.properties
- #74 Store cabin model during runtime 
- #65 Performance of cabin view re-sizing function
- #25 Rename MoveRow to MoveObject
- #6 Compatibility with Eclipse Mars.2 (4.5.2)

---

## PAXelerate - Version Alpha 0.5 / 2016-02-15 ##

The version Alpha 0.5 marks the half way to the Beta status and focused on re-structuring of the packages and bug-fixing.

**Bugs**

- Restore OpenCDT Menu
- Right Click Commands are no longer visible
- Clicking import child in paxelerate.product causes NullPointerException
- Array out of bound in ObstacleMap.getValueAtPoint

**Improvement**

- Move AStar classes to separate plug-in
- Restructuring of packages
- Switch x and y coordinates
- Cut decimal places with point instead of comma (English convention)
- Preselect PAXelerate models under Project > Right click > New Model element
- Auto-show Cabin Layout View (when starting PAX 1st time)
- Define required plug-ins in paxelerate.product
- Change naming of predefined cabin layouts to regional, narrow-body and wide-body


