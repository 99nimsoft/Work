cd C:\Users\IBM_ADMIN\sahi_pro\userdata\scripts\RO_Automation\\tools\PsExec
PsExec.exe \\192.168.2.120 -u Administrator -p Sanovi123 cmd /c call fsutil volume diskfree c: >diskspace.txt