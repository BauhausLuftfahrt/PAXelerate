# Developer Guide #

First, get started with the [Git repository handling and Jira integration](#git)

Use the code snippets to get the implementation of a desired aspect started. 
 
* [Aircraft cabin generation using the construction library](#construction-library)
* [Using the Gaussian Distribution](#gaussian)
* [Exception handling](#java-exception)

## Eclipse and OpenCDT related ##
* [Creating a user input dialog](#input-dialog)
* [Creating a new popup window](#help-window)
* [How to add a new right click command to OpenCDT](#opencdt-right-click-command)
* [Usage of EMF Forms and customisation](#emf-forms)
* [Eclipse product and application deployment](http://www.vogella.com/tutorials/EclipseProductDeployment/article.html#deployment_deltapack)

For further information regarding OpenCDT please refer to the [wiki](http://bitbucket.org/opencdt/opencdt/wiki/Home) or to these [useful links](#useful-links)

## Troubleshooting
* [Framework errors during launch](#error-framework)


# Git Workflow #
#git

* **Commit**: versionises the changes files and saves all changes on your local hard drive
* **Push**: uploading of changes to the bitbucket Git repository

## Processing JIRA issues with commit messages ##
* Jira Ticket number: PXE-000
* *#close* - closes the issue
* *#resolve* - resolves the issue
* *#comment* - records a comment against an issue

example:
```
#!html
PXE-090 #close Fixed this today

or

PXE-123 PXE-234 PXE-345 #resolve
```
refer to [Jira documentation](https://confluence.atlassian.com/display/BITBUCKET/Processing+JIRA+issues+with+commit+messages) for more info

# How to use the construction library class for cabin generation purposes #
#construction-library
##1. Create the object##
Create and initialize a object:
```java
Cabin cabin = CabinFactory.eINSTANCE.createCabin();
ConstructionLibrary constructor = new ConstructionLibrary(cabin);
```
The cabin element is a pre-exsiting cabin that is pushed over to the constructor.  
If you wish, you can clear the cabin by using the following command:
```java
constructor.clearCabin();
```
##2. Create cabin elements##
* Emergency Exits must be generated at first.  
* Only create one main door.  
* Create all other objects in the order they appear within the cabin (from front to rear).  
###Create a passenger class###
```java
constructor.createClass(passengerClass);
```
The *passengerClass* can be one of the following:
```java
FirstClass.class, BusinessClass.class, PremiumEconomyClass.class, EconomyClass.class
```
###Create a door###
```java
boolean onBothSides = true;
int id = 0;
int yDimension = 0;
constructor.createDoor(doorType, onBothSides, id, yDimension);
```
The *doorType* element is one of the following:
```java
MainDoor.class, StandardDoor.class, EmergencyExit.class
```
###Create a galley / lavatory###
```java
int yDimension = 0;
constructor.createGalley(yDimension);
```

##3. return the modified cabin element##
```java
cabin = constructor.getCabin();
```






