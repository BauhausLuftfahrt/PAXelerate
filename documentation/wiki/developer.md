# Developer Guide #

Based on PAXelerate release: Alpha 0.7 (07/01/2016)

First, get started with the [Git repository and issues handling](#git-workflow)

Use the code snippets to get the implementation of a desired aspect started. 
 
* [Aircraft cabin generation using the construction library](#how-to-use-the-construction-library-class-for-cabin-generation-purposes)
* [Using the Gaussian Distribution](#gaussian-distribution)
* [Exception handling](#exception-handling-procedures)

## Eclipse and OpenCDT related ##
* [Creating a user input dialog](#how-to-create-a-new-input-dialog)
* [Creating a new popup window](#how-to-create-a-new-help-window-popup)
* [How to add a new right click command to OpenCDT](#how-to-add-a-new-right-click-command-to-opencdt)
* [Usage of EMF Forms and customisation](#usage-of-emf-forms)
* [Eclipse product and application deployment](http://www.vogella.com/tutorials/EclipseProductDeployment/article.html#deployment_deltapack)

For further information regarding OpenCDT please refer to the [wiki](http://bitbucket.org/opencdt/opencdt/wiki/Home) or to these [useful links](useful-links.md)

## Troubleshooting
* [Framework errors during launch](#framework-errors-during-launch)

---

# Git Workflow

* **Commit**: versionises the changes files and saves all changes on your local hard drive
* **Push**: uploading of changes to the bitbucket Git repository

## Processing issues with commit messages 
* Fix #10

The following keywords will close an issue via commit message:
* close
* closes
* closed
* fix
* fixes
* fixed
* resolve
* resolves
* resolved

refer to [documentation](https://help.github.com/articles/closing-issues-via-commit-messages/) for more info

---

# How to use the construction library class for cabin generation purposes 

## 1. Create the object
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
## 2. Create cabin elements
* Emergency Exits must be generated at first.  
* Only create one main door.  
* Create all other objects in the order they appear within the cabin (from front to rear).  

### Create a passenger class
```java
constructor.createClass(passengerClass);
```
The *passengerClass* can be one of the following:
```java
FirstClass.class, BusinessClass.class, PremiumEconomyClass.class, EconomyClass.class
```
### Create a door
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
### Create a galley / lavatory
```java
int yDimension = 0;
constructor.createGalley(yDimension);
```

## 3. Return the modified cabin element
```java
cabin = constructor.getCabin();
```
---

# Gaussian Distribution 

In order to use the gaussian distribution, simply call the following method:


```java
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

```java
FuncLib.gaussianRandom(100, GaussOptions.PERCENT_95, 10);
```

---

# Exception Handling Procedures 

Exeptions are handled within PAXelerate by preventing any exeptions from happening. Source code containing a possible exception is surrounded by a try / catch phrase and the error is then printed inside the console without interfering with the source code execution. 

Within the catch phrase, a possible solution for the occured error must be implemented in order for the code to run even without the faulty parts.

```java

Object object; // create the object beforehand

try {

object = SomeHelper.retrieveObject(); // try to get the information

} catch(Exception e) {

object = new Object("emptyPlaceHolder"); /* if it does not work, initialize it anyway in order for the source code to work properly. */

System.out.println("Exeption e! Please change object.");

}

object.continueDoingSomeCoolStuff();

```

---

# How to create a new input dialog
## 1. Create and initialize a new instance:
Using the following code fragment, you can create and initialize a new input dialog:   
```java
GetInput newInput= new GetInput(windowType, descriptionString, descriptionType);
```   
The *descriptionString* is a String containing more information about the value you want the user to input.  
The *windowType* is defined as follows. You can choose on of the defined values in order to get different input dialog layouts.
```java
public enum WindowType {
		INFORMATION, GET_STRING, GET_INTEGER, GET_VECTOR, WARNING, OPTIONS
	}
```
The thrid parameter *descriptionType* is the type of the description you want to use. This alters the image shown next to the description label.  
```java
public enum IMessageProvider{
		NONE, INFORMATION, WARNING, ERROR
	}
```
## 2. Retrieve information
After having initialized the input dialog, the dialog will open and close automatically. The entered values are stored within the *GetInput* object. To retrieve the stored information, use one of the following commands.
```java
int integerValue = newInput.getIntegerValue();
Vector integerValue = newInput.getVectorValue();
String stringValue = newInput.getString();
```

---

# How to create a new help window popup
## 1. Create and initialize View
At first, the view needs to be created and initialized. This is done in the class that should launch the new window.  
```java
private static JFrame frame;
javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				frame = new JFrame("New Window");
				frame.setContentPane(new HelpView());
				frame.pack();
				frame.setVisible(true);
			}
		});
```
Do not forget to import the required files.
```java
import javax.swing.JFrame;
```
## 2. The HelpView
Create a new class that represents a view. In here, you can modify the view as you wish.
```java
package net.bhl.cdt.paxelerate.ui;
import javax.swing.*;

public class HelpView extends JPanel {
	public HelpView() {
		this.setPreferredSize(new Dimension(800,600));
		Thread newThread = new Thread() {
			public void run() {
				while (true) {
					try {
                        //Do anything in here.
							repaint();
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		gameThread.start(); 
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
              //Modify the user interface in here.
		g.drawString("Hello World!",0,0);
		}
	}
}
```

---

# How to add a new right click command to openCDT 
                                                                                    
## 1. Create a new *newCommand.java* in *net.bhl.cdt.paxelerate.model.commands* 
* Best practice: copy an existing command.                                       
* Be sure to not modify the constructor, *this.cabin = cabin* should stay intact 
                                                                                     
## 2. Create a new *newCommandHandler.java* in *net.bhl.cdt.paxelerate.model.handlers* 
* Best practice: copy an existing handler file.                        		    
* Tip: Do not modify this file, only check for correct naming         			
                        															 
## 3. Open *plugin.xml* and go to *org.eclipse.ui.commands* 
* Create a new command by right-clicking.                                       
* Fill in the id, name and default handler. (Caution: case sensitive!)           
                                                        								
## 4. Go to *org.eclipse.ui.menus* in *plugin.xml* 
* Expand the *popup:org.eclipse.(...)* entry                                  
* Add a new command by right-clicking                                           
* Fill in the correct commandID and your desired label name                   
* Add a new parameter by right-clicking                                       
* Set the parameter to *false (visible when)*							 
* Add a parameter within called *iterate*
* Add a parameter within called *instanceOf* and choose *cabin* 	

---

# Usage of EMF Forms 

PAXelerate is build upon the latest version of the EMF platform 1.7.x

* Create new view with *New --> EMF Model --> View Model* and select *Browse Workspace*, from the package *net.bhl.cdt.paxelerate.model* use the *cabin.ecore* in the *model* folder and select the desired *EClass*
* All views can be found under *net.bhl.cdt.paxelerate.model.viewmodel* 

Further information can be obtained on the [EMF Forms Website](http://www.eclipse.org/ecp/emfforms/)		     
                         
                         
---

# Framework errors during launch 

1. Check if all required plug-ins are added in the run configurations with validate plug-ins
2. Add each plug-in creating an framework error manually in the run configurations
3. Clean the project
4. Delete the folder .cdt under C:\user\username\

The following plug-ins are required:

```
net.bhl.cdt.client
net.bhl.cdt.model
net.bhl.cdt.model.edit
net.bhl.cdt.ui
net.bhl.cdt.paxelerate.core
net.bhl.cdt.paxelerate.model
net.bhl.cdt.paxelerate.model.edit
net.bhl.cdt.paxelerate.model.viewmodel
net.bhl.cdt.paxelerate.ui
net.bhl.cdt.paxelerate.util
```               											










