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
###################################
set cmd {}
append cmd "exec "
append cmd " showrcopy groups "
append cmd $GroupName
$logger print "Executing: $cmd \n"
set ex [ drmcatch $cmd cmd_out ]
$logger print "EX: $ex \n"
$PANACES_CLI_RETVAL setArgs "TCL_OUTPUT" "$cmd_out"
$logger print "CmdOut: $cmd_out\n"
setKeyValue "STATUS" "ACTIVE"
#set rep_state [ getRepState $cmd_out ]
set rep_state "ACTIVE"
$logger print "REP_STATE: $rep_state \n"
setKeyValue "STATUS" $rep_state
