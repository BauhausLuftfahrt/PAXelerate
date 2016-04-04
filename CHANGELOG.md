# Changelog #

## PAXelerate - Version Alpha 0.6 / 2016-03-31 ##

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


