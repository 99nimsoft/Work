path=%path%;c:\sed\bin

sed -i "s/MSSQL_AGENT_WINDOWS_CHK=.*/MSSQL_AGENT_WINDOWS_CHK=1/g"  "C:\Users\Administrator\Desktop\PanacesAgentsInstaller.properties"

sed -i "s/PFR_AGENT_CHK=.*/PFR_AGENT_CHK=1/g" "C:\Users\Administrator\Desktop\PanacesAgentsInstaller.properties"

sed -i "s/USER_INSTALL_DIR=.*/USER_INSTALL_DIR=C:\\PFR/g" "C:\Users\Administrator\Desktop\PanacesAgentsInstaller.properties"

sed -i "s/USER_INPUT_RESULT_JAR_MSSQL=.*/USER_INPUT_RESULT_JAR_MSSQL=C:\\Program Files\\Microsoft SQL Server JDBC Driver 2.0\\sqljdbc_2.0\\enu/g" "C:\Users\Administrator\Desktop\PanacesAgentsInstaller.properties"

sed -i "s/USER_INPUT_RESULT_PRIMARY_PANACES_SERVER_IP=.*/USER_INPUT_RESULT_PRIMARY_PANACES_SERVER_IP=192.168.20.176/g" "C:\Users\Administrator\Desktop\PanacesAgentsInstaller.properties"

sed -i "s/USER_INPUT_RESULT_SECONDARY_PANACES_SERVER_IP=.*/USER_INPUT_RESULT_SECONDARY_PANACES_SERVER_IP=192.168.20.176/g" "C:\Users\Administrator\Desktop\PanacesAgentsInstaller.properties"

sed -i "s/PANACES_AGENT_NODE_ADDRESS=.*/PANACES_AGENT_NODE_ADDRESS=172.168.20.50/g" "C:\Users\Administrator\Desktop\PanacesAgentsInstaller.properties"

sed -i "s/AGENTS_START_YES=.*/AGENTS_START_YES=1/g" "C:\Users\Administrator\Desktop\PanacesAgentsInstaller.properties"

