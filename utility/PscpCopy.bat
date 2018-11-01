cd C:\Users\IBM_ADMIN\sahi_pro\userdata\scripts\RO_Automation\tools\Pscp
pscp.exe  -scp -pw Sanovi123$ -r sanovi@192.168.2.142:/opt/panaces_JY_Auto/workflows/MSSQL/MSSQLLogPFR/ C:\Users\IBM_ADMIN\sahi_pro\userdata\MSSQL\MSSQLLogPFR/
echo EXIT CODE : %errorlevel% > PscpCopyExitCode.txt
