$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login Feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 249896,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Background Example",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Statement background",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.Statement_background()"
});
formatter.result({
  "duration": 218937520,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Run smoke",
  "description": "",
  "id": "free-crm-login-feature;run-smoke",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "Run Smoke",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.run_Smoke()"
});
formatter.result({
  "duration": 96835,
  "status": "passed"
});
formatter.uri("src/main/java/Features/login2.feature");
formatter.feature({
  "line": 1,
  "name": "Testing multiple feature file execution",
  "description": "",
  "id": "testing-multiple-feature-file-execution",
  "keyword": "Feature"
});
formatter.before({
  "duration": 175820,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Temp 1 scenario",
  "description": "",
  "id": "testing-multiple-feature-file-execution;temp-1-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@temp"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "temp one given",
  "keyword": "Given "
});
formatter.match({
  "location": "tempStepDefnitions.temp_one_given()"
});
formatter.result({
  "duration": 253467,
  "status": "passed"
});
});