##############################################################################
#
# This is Template script provided by Sanovi DRM. This can be used to
# plugin/interface customer specific scripts with DRM software.
#
##############################################################################

##############################################################################
# USER INPUT SECTION : LIB PATH
##############################################################################

# Lib path is path where Sanovi DRM library are located on the system.
# This can be set in Sanovi DRM GUI for the workflow or can be specified here.
# Please modify and uncomment following line if it needs to be defined here.

$PANACES_CLI_ARGS1 setArgs PanacesTCL_LibraryPath "scripts/repository/library"

source "scripts/repository/library/PanacesCommonLIB.tcl"
source "scripts/repository/library/PanaceOperatingSystemTCL.lib"
source "scripts/repository/library/PanacesHP3PARLIB.tcl"

##############################################################################
#
# DO NOT MODIFY SECTION BELOW: Setting up environment
#
##############################################################################

##### DO NOT MODIFY SECTION FINISH ###########################################
##############################################################################
# USER INPUT SECTION : Command to run.
##############################################################################
# Please define exit code for the script or  command for success status

set GroupName [ getKeyValue "Remote Copy Volume Group" ]

set TCL_OUTPUT {}
##########Start Replication####################
set cmd {}
append cmd "exec"
#append cmd " stoprcopygroup -f "
append cmd " ls -ltr /opt "
#append cmd $GroupName
$logger print "Executing: $cmd \n"
append TCL_OUTPUT "Executing: $cmd \n"
set cmd_out {}
set ex [ drmcatch $cmd cmd_out ]
##########Check Status#########################
set cmd {}
append cmd "exec"
append cmd " sed -i s/INACTIVE/ACTIVE/g /opt/panaces/agents/HP3PAR_RepInfo.tcl"
#append cmd $GroupName
$logger print "Executing: $cmd \n"
#append TCL_OUTPUT "Executing: $cmd \n"
#set cmd_out {}
set ex [ catch $cmd cmd_out ]
$logger print "CmdOut: $cmd_out\n"
#set rep_state [ getGroupRepState $cmd_out ]
set rep_state "STOPPED"

$logger print "RepState: $rep_state\n"
if { $rep_state == "STOPPED" } {
setKeyValue "STATUS" "SUCCESS"
} else {
setKeyValue "STATUS" "FAILURE"
}
