INIT_FILE=/opt/panaces/panaces_env
if [ -f $INIT_FILE ];then
. $INIT_FILE
fi
no_msg_file="Error:Message file not found or cannot read the file"
lang=${LANG=en_US.UTF-8}
case ${lang} in
en*) script_messages=license_messages.en;;
ja*) script_messages=license_messages.ja;;
*) script_messages=license_messages.en;;
esac
if [ -f ${script_messages} -a -r ${script_messages} -a -x ${script_messages} ];
then
        . ${script_messages}
else
        echo ${no_msg_file}
        exit 2
fi

RUNTIME=$JAVA_HOME/bin/java
CLASS_NAME=panaces.cli.commands.container.LicenseGen
CLASSPATH=./lib/commons-cli-1.2.jar:./lib/jibx-run.jar:./lib/log4j.jar:./lib/xpp3.jar:./lib/LicenseGen.jar:./lib/PanacesServer.jar:.
if [ "$1"  =  "" ] ; then
        # Interactive Mode
        $RUNTIME -classpath $CLASSPATH $CLASS_NAME
else
        # Batch Mode
        if [ $1 != --batchfile ] ; then
                # Incorrect command line option specified for Batch mode
                echo "${errorInvalidoptionsspecifiedforLicenseGenutility}"
                echo "${invokingtheLicenseGenutilityininteractivemode}"
                echo "${invokingtheLicenseGenutilityinbatchmode}"
        else
				if [ "$2" = "" ]; then
		                # Incorrect command line option specified for Batch mode
		                echo "${errorInvalidoptionsspecifiedforLicenseGenutility}"
		                echo "${filenameContainingLicenseCommandsNotSpecified}"
				else 
	                	if [ -f $2 ] ; then
	                        	$RUNTIME -classpath $CLASSPATH $CLASS_NAME $1 $2
	                	else
	                        	echo "${fileNotAvailableInvokingLicenseGenInteractiveMode}"
	                        	$RUNTIME -classpath $CLASSPATH $CLASS_NAME
	                	fi
				fi
        fi
fi
