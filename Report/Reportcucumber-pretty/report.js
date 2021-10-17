$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "LoginTest",
  "description": "",
  "id": "logintest",
  "keyword": "Feature"
});
formatter.background({
  "line": 4,
  "name": "user is login",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I open browser and enter url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter valid credential",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on login",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I redirect to Home page of application",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.i_open_browser_and_enter_url()"
});
formatter.result({
  "duration": 9705133700,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.i_enter_valid_credential()"
});
formatter.result({
  "duration": 747667300,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.i_click_on_login()"
});
formatter.result({
  "duration": 7254080300,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.i_redirect_to_Home_page_of_application()"
});
formatter.result({
  "duration": 310815600,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Verify AssignLeave Validation",
  "description": "",
  "id": "logintest;verify-assignleave-validation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I click on assign leave",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I click on assign button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "It shows the validation error",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.i_click_on_assign_leave()"
});
formatter.result({
  "duration": 168700,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.i_click_on_assign_button()"
});
formatter.result({
  "duration": 22800,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.it_shows_the_validation_error()"
});
formatter.result({
  "duration": 74900,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "user is login",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I open browser and enter url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter valid credential",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on login",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I redirect to Home page of application",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.i_open_browser_and_enter_url()"
});
formatter.result({
  "duration": 10736470100,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.i_enter_valid_credential()"
});
formatter.result({
  "duration": 173537100,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.i_click_on_login()"
});
formatter.result({
  "duration": 9660960500,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.i_redirect_to_Home_page_of_application()"
});
formatter.result({
  "duration": 108740300,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Verify AssignLeave added successfully",
  "description": "",
  "id": "logintest;verify-assignleave-added-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "I click on assign leave and fill detail",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I click assign button",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "It shows the success message",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.i_click_on_assign_leave_and_fill_detail()"
});
formatter.result({
  "duration": 101000,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_click_assign_button()"
});
formatter.result({
  "duration": 30100,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.It_shows_the_success_message()"
});
formatter.result({
  "duration": 90900,
  "status": "passed"
});
});