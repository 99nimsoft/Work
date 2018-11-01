$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/IBM_ADMIN/GAURAV/Workspace/CucumberPOM/src/main/java/com/qa/features/freecrm.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Application Test",
  "description": "",
  "id": "free-crm-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate Free CRM HomePage Test",
  "description": "",
  "id": "free-crm-application-test;validate-free-crm-homepage-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is on login page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "validate home page title",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "validate logged in username",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.user_opens_browser()"
});
formatter.result({
  "duration": 10123625625,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_is_on_login_page()"
});
formatter.result({
  "duration": 58903302,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_enters_username_and_password()"
});
formatter.result({
  "duration": 5013289590,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.validate_home_page_title()"
});
formatter.result({
  "duration": 7715110,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.validate_logged_in_username()"
});
formatter.result({
  "duration": 70060,
  "status": "passed"
});
});