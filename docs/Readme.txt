		**********************************************************************
                                    		README
		***********************************************************************
   (C) Copyright © 2012-2013 Sanovi Technologies Private Limited. All Rights Reserved.


Product Details
==========================

	Product Name    : DRM_Automation

ReadMe.txt serves as the guide for personnel installation of this software and testing purposes. By following the steps in this document, the installation should be successful and the product should be operational.


The readme contains the following main sections:

1. Packing List/Release contents
================================
	1. DRM_Automation.zip contains

		DRM_Automation: This Folder contains DRM Test Automation.
		
		i. bin:  It contains the "Prerequisite.bat" file for doing all configuration changes in SAHI for DRM_Automation.
		ii. conf:  It contains all the configuration files for all the solution.
	   	iii. docs:  It contains Readme and Sahi installation document.
		iv. lib:  It contains all the library function for all the solution.
		V. scripts: It contains all the test cases and test suite file for execution.
	   	vi. utility: It contains the Framework utility files and drivers.
	
2. System Requirements
================================
Hardware: 
	Quad core single CPU 2 GB RAM
	4x146 GB HDD
	Dual NIC
	Dual power supply
    
Software: 
	Windows OS 
	Sahi Pro Test Automation Tool (To install Sahi refer the Sahi_Installation.doc)
	
3. Dependencies
================================
	i. User should accept the Putty security alert for DRM Server.
	ii. Sahi Pro tool should be installed

4. Installation & Execution Procedure
================================
Please follow the steps to deployed and execute the test cases.

	Step 1: Deployed the DRM_Automation package into userdata\script\ folder on sahi.
	Step 2: Goto DRM_Automation\bin folder and double click on the "Pre_requisite.bat" file.
	Step 3: Restart the Sahi tool.
	Step 4: Goto Sahi Dashboard, click on the 'bin' link. Command prompts will popup.
	Step 5: Enter the command "testrunner DRM_Automation/'fileName.sah/fileName.suite' <URL> <browser name>".
			(OR)
			You can also run file by following below:
			Go to dashboard. Click on ‘Web’ link. Enter browser type, URL, 
			and click on the play button icon to run the script/suite file.

5. Results/Logs
=================================	
 To see the report/logs of the execution:
 
	i. go to dashboard, click on ‘Logs’ link and you can see the reports.
	ii. If you click on the executed file in the reports, it will show you details of executed scripts and test cases along with the graphical representation.
	iii. You can also run the script with different environment and compare the results by clicking on ‘Compare button’.
6. Precaution
=================================
Please take back up the DRM server database.

Technical Support Contact Details
=================================
In case you are unable to install successfully after complying with the above steps/information, please contact:

Anantha Sakthi T (anantha.sakthi@sanovi.com) Mob - 9886788603

***********************************************************************
