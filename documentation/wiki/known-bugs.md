# Known Bugs #

Based on PAXelerate release: Alpha 0.6 (04/01/2016)

The current releases of PAXelerate are still pre-releases and can contain bugs. If you face any further difficulties, please attach the log file stored in `workspace/.metadata/` to your bug report. 

## Project import and export in Model Explorer ##

Based on issue #96

**Bug**
Since the release Alpha 0.5 some major modifications to the Ecore meta model structure occurred. That means, current `*.xmi` templates are not compatible with earlier versions. The project and child import/export function of the Eclipse workbench is currently still defined as _experimental_. Temporary project data is saved in `.cdt`; however, the import does not work so far (#67). Unfortunately, we won't focus on the enhancement, since these functionalities are provided by the EMF framework.

**Workaround**
Adding or saving a child is the current option to store generated cabins if the Ecore version is equivalent. With the release Alpha-0.6 by the end of this week, the `.xmi` templates will be migrated to the updated Ecore version as well.

**Outlook**
We are currently working on an integrated migration of Ecore meta models (#9) and a further integration of the EMFstore (#94 and #50) will enable to put them under version control.



