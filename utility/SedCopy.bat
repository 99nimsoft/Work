net use "\\192.168.3.35\c$" Sanovi123 /user:Administrator"

xcopy C:\Users\IBM_ADMIN\sahi_pro\userdata\scripts\RO_Automation\\tools\sed \\192.168.3.35\c$\sed\ /s /i /Y

net use "\\192.168.3.35\c$"  /delete

net use "\\192.168.3.35\IPc$"  /delete

