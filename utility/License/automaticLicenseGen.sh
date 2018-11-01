zipPath=$1
EAMSROOT=$2/cli
cd $zipPath
unzip -o $zipPath/LicenseGen.zip -d $zipPath

chmod 777 $zipPath/LicenseGen.sh $zipPath/license_messages.en $zipPath/license_messages.ja $zipPath/xsd $zipPath/lib


echo $EAMSROOT

export JAVA_HOME=/usr

$zipPath/LicenseGen.sh << EOF
create Licensekey -x $zipPath/license.xml
exit
EOF

echo "Automation License Generated Succesfully"


$EAMSROOT/DRMlicense.sh  << EOF

upload licensekey -l $zipPath/license.xml 

exit 
EOF

echo "Automation License Uploades Succesfully"

mysql -u root <<EOF
use panaces;

update user_preferences set up_varcharRes2='HomePage:6,SubPage:,Email:false,Mobile:false,Phone:false,Pager:false' where up_id='1';

EOF



mysql -u root <<EOF
use panaces;

update user_preferences set up_varcharRes2='HomePage:6,SubPage:,Email:false,Mobile:false,Phone:false,Pager:false' where up_id='1';

exit
EOF



