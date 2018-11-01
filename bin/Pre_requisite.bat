:: This file is been used for running all the pre-requisities required for running Sahi Pro
:: as it helps to run SahiPro perfectly without doing any changes in the file manually
:: /Y tells XCOPY to overwrite files without asking for confirmation
:: @author - Anantha sakthi

:: This file is being copied to help the user to set the logs path, no of threads, run multiple/single session in testrunner.bat file as testrunner is been used to run Sahi scripts and suite 0
XCOPY  ..\utility\testrunner.bat ..\..\..\bin\testrunner.bat /Y

:: This file is being copied to help the user ignored the vstruts page to run Sahi scripts.
XCOPY  ..\utility\exclude_inject.txt ..\..\..\config\exclude_inject.txt /Y

:: This file is being copied to help the user ignored the vstruts page to run Sahi scripts.
//XCOPY  ..\utility\actions.js ..\..\..\..\htdocs\spr\actions.js /Y

:: This jar file is being copied to establish ojdbc connection with the DB that will fetch the data from DB and provide those data in GUI
XCOPY ..\utility\Drivers ..\..\..\..\extlib\Drivers /D /E /C /R /I /K /Y

:: This file is being copied to set driver path in the Sahi Pro to establish database connection & SSH connection
XCOPY ..\utility\start_dashboard.bat ..\..\..\bin\start_dashboard.bat /Y

:: This command is to create the folder for workflow
mkdir ..\..\..\Oracle

:: This command is to create the folder for workflow
mkdir ..\..\..\MSSQL

:: This command is to create the folder for workflow
mkdir ..\..\..\samples\Sybase

:: This command is to create the folder for workflow
mkdir ..\..\..\MySQL



:: This command is to accept the license for pstool
cd ..\tools\PsExec\
PsExec.exe \\127.0.0.1 /accepteula cmd /c call cd 
PsKill.exe \\127.0.0.1 /accepteula cmd
