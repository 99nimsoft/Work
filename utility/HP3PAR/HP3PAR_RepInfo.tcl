package require java
java::import panaces.common.utils.logger
java::import panaces.common.utils.InstallUtil
java::import panaces.agents.generic.GenericKVPvtConfig

$PANACES_CLI_ARGS1 setArgs PanacesTCL_LibraryPath "scripts/repository/library"

source "scripts/repository/library/PanacesCommonLIB.tcl"
source "scripts/repository/library/PanaceOperatingSystemTCL.lib"
source "scripts/repository/library/PanacesHP3PARLIB.tcl"

# Get the service object from functional group
set config1 [ java::cast panaces.agents.generic.GenericKVPvtConfig \
        [$PANACES_CLI_ARGS1 getParamValue "PRIMARY_SERVICE_CONFIG_1" "" ]]

set GroupName [ $config1 get "Remote Copy Volume Group" ]

proc getDataLagReport { vol_names tot_lag } {

        upvar $tot_lag totLag
        set Report "\n"
        append Report "VVName   Size (MB)     DataLag (MB)\n"
        append Report "=======================================\n"

        set totLag 0
        foreach elem $vol_names {
                set vnamelst [ split $elem ":"]
                set vname [lindex $vnamelst 0]
                set syncp [lindex $vnamelst 1]
                set vsize [ getVSize $vname]
                set dataLag 0
                if { $syncp != "" } {
                        #pending sync - calculate datalag
                        set dataLag [expr $vsize * (100 - $syncp)/100  ]
 		}
                set size [ getVSize $elem ]
                set totLag [expr $totLag + $dataLag]
                append Report "$vname   $vsize  $dataLag\n"

        }
        append Report "=======================================\n"
        append Report "Total Data Lag = $totLag MB \n"
        append Report "=======================================\n"
        return $Report

}

proc getVSize { vname } {
        set cmd {}
        append cmd "exec showvv -showcols Usr_Rsvd_MB "
        append cmd $vname
        #$logger print "Executing: $cmd \n"
        set ex [ drmcatch $cmd cmd_out ]
        #$logger print "CmdOut: $cmd_out\n"
        set out_list [ split $cmd_out "\n" ]
        return [lindex $out_list 3]

}
set successExitCode 0
set ex 0
###################################
set cmd {}
append cmd "exec showrcopy groups "
append cmd $GroupName
set cmd_out {}
#$logger print "Executing: $cmd \n"
#set ex [ drmcatch $cmd cmd_out ]
#$logger print "CmdOut: $cmd_out\n"
setKeyValue "REPLICATION_STATUS" "ACTIVE"
#set rep_state UNKNOWN
set rep_state UNKNOWN
setKeyValue "REPLICATION_STATUS" $rep_state
#set vol_names [ getVolNamesWithSyncPercent $cmd_out ]
#set ReplicationPage [ getDataLagReport $vol_names tot_lag ]
set ReplicationPage "Replication Page-----\n HP3PAR INFO: Status test\n Group Name: $GroupName"
###################################

$PANACES_CLI_RETVAL setArgs "REPLICATION_DETAILS_DATALAG" "0"
$PANACES_CLI_RETVAL setArgs "REPLICATION_DETAILS_DATALAG_UNIT" "MB"
$PANACES_CLI_RETVAL setArgs "REPLICATION_DETAILS_EXIT_STATUS"     "0"
$PANACES_CLI_RETVAL setArgs "REPLICATION_DETAILS_OUTPUT" "$ReplicationPage"
$PANACES_CLI_RETVAL setArgs "REPLICATION_DETAILS_OUTPUT_TYPE" "Text"

reportResult $successExitCode $ex $ReplicationPage
