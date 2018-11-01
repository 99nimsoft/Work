
public class BkEnd {

	public static void main(String[] args) {
		
		/********************Fire command from windows machine to windows VM************************************/
		// in order to fire commands from windows machine to windows vm we can use Psexec
		// more details are available at https://docs.microsoft.com/en-us/sysinternals/downloads/psexec
		//or u can search google for psexec tutorial
		/*******************************************************************************************************/
		
		/********************Fire command from Linux machine to Windows VM************************************/ 
		// u can use winexe to fire commands from windows machine to linux VM
		/*****************************************************************************************************/
		
		/*********************Copy files from Windows machine to another windows machine**********************/
		// one way to do this is to create a bat file with commands like below
		net use "\\192.168.3.42\c$" Sanovi123 /user:Administrator"         

		// in above command net use is a Command Prompt command that's used to connect to, remove, and configure connections to shared resources, 
		//like mapped drives and network printers. The net use command is one of many net commands like net send, net time, net user, net view, etc.
		//192.168.3.42 is IP of VM Sanovi123 is password and Administrator is user name
		
		xcopy C:\Users\IBM_ADMIN\sahi_pro\userdata\scripts\RO_Automation\utility\Sfr \\192.168.3.42\c$\Sfr /s /i /Y

		// in above command xcopy is the command to copy files from one location to another location 
		// first location is the source and second location is destination and then the /s /i /Y are switches
		
		echo EXIT CODE : %errorlevel% > SfrCopyExitCode.txt
		
		// above line is going to create a text file at source with the commands exit code
		
		net use "\\192.168.3.42\c$"  /delete
		
		// once our work is done we delete the connection created 
		
		
		/********************Copy files from Windows machine to Linux machine********************************/
		//to do this we can use pscp tool to transfer file from windows to linux or from linux to windows
		//create a bat file with commands like below
		
		cd C:\Users\IBM_ADMIN\sahi_pro\userdata\scripts\RO_Automation\tools\Pscp
		// first cd the path where Pscp tool is kept
		pscp.exe  -scp -pw Sanovi123$ -r sanovi@192.168.2.142:/opt/panaces_JY_Auto/workflows/MSSQL/MSSQLLogPFR/ C:\Users\IBM_ADMIN\sahi_pro\userdata\MSSQL\MSSQLLogPFR/
		//sanovi is the user name of linux VM and Sanovi123$ is the password , -r is the switch for recursion
		//     /opt/panaces_JY_Auto/workflows/MSSQL/MSSQLLogPFR/  is the source path from where to copy the files
		//   C:\Users\IBM_ADMIN\sahi_pro\userdata\MSSQL\MSSQLLogPFR/   is the destination path 
		
		// so it is going to copy files from linux to your local windows machine,
		// suppose u want to copy files from windows to linux then just reverse the source and destination path
		echo EXIT CODE : %errorlevel% > PscpCopyExitCode.txt



		
		
		
		

	}

}
