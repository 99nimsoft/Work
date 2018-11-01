cd C:\Users\IBM_ADMIN\sahi_pro\userdata\scripts\RO_Automation\tools\Pscp
pscp.exe  -scp -pw Sanovi123$ -r sanovi@192.168.20.30:/opt/panaces_aaa/workflows/Oracle/OracleArLogDG/ C:\Users\IBM_ADMIN\sahi_pro\userdata\Oracle\OracleArLogDG/
echo EXIT CODE : %errorlevel% > PscpCopyExitCode.txt
