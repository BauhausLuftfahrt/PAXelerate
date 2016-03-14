# Release Guidelines

A summary of all necessary website and repository updates prior to a new release.


## General branch workflow

* Master: should always be working and reflects mayor releases and bug fixes
* Developer: for milestones, such as `dev-0.6`
* Release candidates: prior to releases for testing, such as `0.6-RC1`
	
## Pre-release tasks
Tests should comprise at least the following tasks:

* OpenCDT
	* project generation, import, export
	* child: export, import
* PAXelerate
	* Cabin models
		* Automatic cabin generation
		* From scratch with row cloning function
		* A320 model
	* Model modifications
		* Editing of model element values
		* Repositioning of elements
	* Passenger 
		* Generation in first, business, premium eco and eco
		* Passenger sorting
	* Simulation
	
Basic information about the operating environment should be noted

* OS
* Eclipse
* ECP
* OpenCDT
	
## Release day
After a successful test of the release candiate (RC1) updates of the code, repository and website are necessary

* CodeS
	* Update legal and copyright info with current year
* Repository
	* `readme.md` and `home.md`
		* Eclipse, ECP, OpenCDT and PAXelerate version 
		* Year
	* Wiki
		* Refer to release version for each file in header
		* Check compatibility with current release (screenshots)
	* Issue tracker
		* Mark milestone as released
	* Release tag
		* Included material in zip file: updated wiki, change log
* Website
	* Blog post: change log and main features
	* Links to current release 




