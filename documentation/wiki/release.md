# Release Guidelines

A summary of all necessary website and repository updates prior to a new release.


## General branch workflow

* master: is the main branch including mayor releases and bug fixes, the HEAD version should reflect a production-ready state 
* developer: for milestones where the HEAD always reflects a state with the latest delivered development changes for the next release, named `develop`
* release candidate (RC): some days prior to releases for testing and bug fixing, such as `release-0.X`

When the source code in the `develop` branch reaches a stable point and is ready to be released, all of the changes should be merged back into `master` somehow and then tagged with a release number. 

See [a successful Git branching model](http://nvie.com/posts/a-successful-git-branching-model/) for further information on branching.

	
## Pre-release tasks
A release candidate branch `release-0.X` will be produced for testing and bug fixing. Tests should comprise at least the following tasks. Bit by bit this will be transfered to automatic tests.

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
		* Generation in first, business, premium economy and economy
		* Passenger sorting
	* Simulation
	
Basic information about the operating environment should be noted

* OS
* Eclipse
* ECP
* OpenCDT

The wiki should be updated, if new features and functions as well as mayor UI changes are included in the release.

	
## Release day
After a successful test of the release candidate, updates of the code, repository and website are necessary

* Code
	* Update legal and copyright info with current year
	* Change release number in `MANIFEST.MF` to `0.X.0.qualifier` of all plug-ins and update minimum version in _Dependencies_
* Repository
	* Branch
		* Merge `release-0.X` with `master` branch
		* Release tag
			* Included material in zip file: updated wiki, change log
			* Release notes: description, bugs, improvement
		* Merge `release-0.X` with `develop` branch
		* Delete `release-0.X` branch
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




