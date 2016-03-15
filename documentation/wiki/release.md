# Release Guidelines

A summary of all necessary website and repository updates prior to a new release.


## General branch workflow

* Master: should always be working and reflects mayor releases and bug fixes
* Developer: for milestones, such as `dev-0.6`
* Release candidates: some days prior to releases for testing and bug fixing, such as `dev-0.6-RC1`
	
## Pre-release tasks
A release candiate (RC1) branch will be produced for testing and bug fixing. Tests should comprise at least the following tasks. Bit by bit this will be transfered to automatic tests.

* OpenCDT
	* Project generation, import, export
	* Child: export, import
* PAXelerate
	* Cabin models
		* Automatic cabin generation
		* From scratch with row cloning function
		* A320 model
		* Refresh function
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

The wiki should be updated, if new features and functions as well as mayor UI changes are included in the release.

	
## Release day
After a successful test of the release candiate (RC1) updates of the code, repository and website are necessary

* Code
	* Update legal and copyright info with current year
* Repository
	* Branch
		* Merge RC1 with master branch
		* Release tag
			* Included material in zip file: updated wiki, change log
		* new development branch for next milestone `dev-0.7`
	* `readme.md` and `home.md`
		* Eclipse, ECP, OpenCDT and PAXelerate version 
		* Year
	* Wiki
		* Refer to release version for each file in header
		* Check compatibility with current release (screenshots)
	* Issue tracker
		* Mark milestone as released
* Website
	* Blog post: change log and main features
	* Links to current release 




