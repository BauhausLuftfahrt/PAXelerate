# CPACS Toolspecific node

The CPACS toolspecific node for PAXelerate looks like the following:

```xml
<toolspecific>
    <tool>
        <name>PAXelerate Boarding Simulation</name>
        <version>1.0</version>
        <input>
            <studies>
                <study uID="study_name">      
                    <loadFactor>1.0</loadFactor>
                    <activeDoorUIDs>door_id_1;door_id_2</activeDoorUIDs>
                    <iterations>1</iterations> 
                    <simulationType>BOARDING</simulationType> 
                    <displaySimulation>True</displaySimulation>
                    <seatType>DEFAULT</seatType>
                    <simulationGridResolution>0.1</simulationGridResolution>
                    <simulationSpeedFactor>1</simulationSpeedFactor>
                    <passengerSortingScheme>RANDOM</passengerSortingScheme>
                    <doorSelection>CLOSEST</doorSelection>
                    <percentageOfPassengersWithJackets>25</percentageOfPassengersWithJackets>
                    <percentageOfPassengersWithSmallBags>25</percentageOfPassengersWithSmallBags>
                    <percentageOfPassengersWithMediumBags>25</percentageOfPassengersWithMediumBags>   
                    <percentageOfPassengersWithLargeBags>25</percentageOfPassengersWithLargeBags> 
                </study>
            </studies>
        </input>
    </tool>
</toolspecific>
```
## Study node

Check out the following table for a detailed view of all input parameters for a study and their meaning.

Parameter                           |   Description                                 |   Type    |   Allowed values
---                                 |   ---                                         |   ---     |   ---
loadFactor                          |   Share of occupied seats                     |   double  |   0.0 - 1.0
activeDoorUIDs                      |   uIDs of boarding doors                      |   string  |   minimum 1 door     
iterations                          |   Number of boarding iterations               |   int     |   > 1
simulationType                      |   Type of the simulated scenario              |   enum    |   BOARDING, DEBOARDING or EMERGENCY 
displaySimulation                   |   Show simulation UI or not                   |   boolean |   -
seatType (**non-functional!**)      |   Seat type used                              |   enum    |   DEFAULT, SIDEWAYS_FOLDABLE, LIFTING_SEAT_PAN or BRING_YOUR_OWN 
simulationGridResolution            |   Grid resolution in x by x meters per node   |   double  |   > 0.1m 
simulationSpeedFactor               |   Simulation speed factor (1.0 is realtime)   |   double  |   > 0.0
passengerSortingScheme (*see below*)|   Sorted boarding order                       |   enum    |   RANDOM, RTF, FTR, WTA, WTA_RTF, WTA_FTR, BLOCK, BOARDING_CLASS_RANDOM, STEFFEN, MILNE_KELLY, BIG_BAGS_AFT, BIG_BAGS_FRONT, MAX_BAGS_AFT or MAX_BAGS_FRONT
doorSelection                       |   Door assignment for passengers              |   enum    |   CLOSEST, CLOSEST_BEHIND, CLOSEST_FRONT or RANDOM
percentageOfPassengersWithJackets   |   Share of passengers with jackets only       |   double  |   % from 0 - 100 (total < 100, 100 - total = noLuggage) 
percentageOfPassengersWithSmallBags |   Share of passengers with small luggage only |   double  |   % from 0 - 100 (total < 100, 100 - total = noLuggage) 
percentageOfPassengersWithMediumBags|   Share of passengers with medium luggage only|   double  |   % from 0 - 100 (total < 100, 100 - total = noLuggage) 
percentageOfPassengersWithLargeBags |   Share of passengers with big luggage only   |   double  |   % from 0 - 100 (total < 100, 100 - total = noLuggage) 

## Boarding sequence sorting options

Parameter               |   Description
---                     |   ---
RANDOM                  |   Boarding in random order
RTF                     |   Boarding from **r**ear **t**o **f**ront, with sequence within row being random
FTR                     |   Boarding from **f**ront **t**o **r**ear, with sequence within row being random
WTA                     |   Boarding from **w**indow **t**o **a**isle, with sequence of rows being random
WTA_RTF                 |   Boarding from window to aisle combined with rear to front 
WTA_FTR                 |   Boarding from window to aisle combined with front to rear
BLOCK                   |   Boarding in blocks, with number of blocks is defined in the simulation settings
BOARDING_CLASS_RANDOM   |   Boarding by class with a random order within
STEFFEN                 |   Boarding according to the custom sequence invented by Steffen
MILNE_KELLY             |   Boarding according to the custom sequence invented by Milne and Kelly
BIG_BAGS_AFT            |   Boarding with a ascending luggage volume towards the rear
BIG_BAGS_FRONT          |   Boarding with a descending luggage volume towards the rear
MAX_BAGS_AFT            |   Boarding with a ascending luggage count towards the rear
MAX_BAGS_FRONT          |   Boarding with a descending luggage count towards the rear