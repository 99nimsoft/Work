net use "\\192.168.3.42\c$" Sanovi123 /user:Administrator"

xcopy C:\Users\IBM_ADMIN\sahi_pro\userdata\scripts\RO_Automation\utility\Sfr \\192.168.3.42\c$\Sfr /s /i /Y

echo EXIT CODE : %errorlevel% > SfrCopyExitCode.txt
net use "\\192.168.3.42\c$"  /delete


net use "\\192.168.3.42\IPc$"  /delete

