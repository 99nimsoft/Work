cd C:\Users\IBM_ADMIN\sahi_pro\userdata\scripts\RO_Automation\tools\Pscp
pscp.exe  -scp -pw Sanovi123$ -r C:\Users\IBM_ADMIN\sahi_pro\userdata\MSSQL\MSSQLLogPFR/ sanovi@192.168.2.142:/tmp 
echo EXIT CODE : %errorlevel% > PscpCopyExitCode.txt
