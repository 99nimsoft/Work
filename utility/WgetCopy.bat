cd C:\Users\IBM_ADMIN\sahi_pro\userdata\scripts\RO_Automation\tools\Wget
wget -r -nd -P C:\Users\IBM_ADMIN\sahi_pro\userdata\scripts\RO_Automation\utility\Sfr http://192.168.1.201:8080/jenkins/job/Onyx_7_3/ws/Onyx_7_3_45050/panacesDVDVOnyx_7_3_45050//SanoviDRM/AgentNode/Windows/VM/SiteController.exe
echo EXIT CODE : %errorlevel% > WgetCopyExitCode.txt
