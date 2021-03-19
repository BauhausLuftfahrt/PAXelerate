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

Parameter                           |   Description                     |   Input type
---                                 |   ---                             |   ---
loadFactor                          |   Share of occupied seats         |   double from 0.0 - 1.0
activeDoorUIDs                      |   uIDs of boarding doors          |   string        
iterations                          |   Number of boarding iterations   |   int
simulationType                      |   Type of the simulated scenario  |   BOARDING, DEBOARDING or EMERGENCY 
displaySimulation                   |   Show simulation UI or not       |   boolean
seatType (**non-functional!**)      |   Seat type used                  |   DEFAULT, SIDEWAYS_FOLDABLE, LIFTING_SEAT_PAN or BRING_YOUR_OWN 
simulationGridResolution            |   Cabin grid resolution           |   double, resolution in x by x meters per node
simulationSpeedFactor               |   Simulation speed factor         |   double, 1 is real time, 2 is double speed etc.
passengerSortingScheme (*see below*)|   Sorted boarding order           |   RANDOM, RTF, FTR, WTA, WTA_RTF, WTA_FTR, BLOCK, BOARDING_CLASS_RANDOM, STEFFEN, MILNE_KELLY, BIG_BAGS_AFT, BIG_BAGS_FRONT, MAX_BAGS_AFT or MAX_BAGS_FRONT
doorSelection                       |   Door assignment for passengers  |   CLOSEST, CLOSEST_BEHIND, CLOSEST_FRONT or RANDOM
percentageOfPassengersWithJackets   |   Share of pax with luggage type  |   double in % from 0 - 100 (*total rest is pax with no luggage!*)
percentageOfPassengersWithSmallBags |   Share of pax with luggage type  |   double in % from 0 - 100 (*total rest is pax with no luggage!*)
percentageOfPassengersWithMediumBags|   Share of pax with luggage type  |   double in % from 0 - 100 (*total rest is pax with no luggage!*)
percentageOfPassengersWithLargeBags |   Share of pax with luggage type  |   double in % from 0 - 100 (*total rest is pax with no luggage!*)

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