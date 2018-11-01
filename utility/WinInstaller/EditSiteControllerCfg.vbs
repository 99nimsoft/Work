Const ForReading = 1
Const ForWriting = 2

Set objFSO = CreateObject("Scripting.FileSystemObject")
Set objFile = objFSO.OpenTextFile("SITE_CONTROLLER_CFG_PATH", ForReading)

strText = objFile.ReadAll
objFile.Close

Set regEx = CreateObject("VBScript.RegExp")
regEx.Pattern = "panaces.acp.keystore.*"
strText = regEx.Replace(strText,"panaces.acp.keystore=C:\\SiteController\\installconfig\\keystore\\panacesACP.keystore" & vbCrLf)

regEx.Pattern = "panaces.acp.keystorePassword.*"
strText = regEx.Replace(strText,"panaces.acp.keystorePassword=Hl&4gBc5ty6b20k9*+=sfpQI5#JeQq6&kdoeGwWd75#60dmfjuHgfu39&&9ndkdi%jdJGF09dgdhjdp86" & vbCrLf)

regEx.Pattern = "panaces.acp.truststore.*"
strText = regEx.Replace(strText,"panaces.acp.truststore=C:\\SiteController\\installconfig\\keystore\\panacesACP.truststore" & vbCrLf)


regEx.Pattern = "panaces.acp.truststorePassword.*"
strText = regEx.Replace(strText,"panaces.acp.truststorePassword=uyts637KHDS337$%" & vbCrLf)


Set objFile = objFSO.OpenTextFile("SITE_CONTROLLER_CFG_PATH", ForWriting)

objFile.WriteLine strText

objFile.Close

