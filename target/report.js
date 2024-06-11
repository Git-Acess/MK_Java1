$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:FeaturesFile/DTwithHeader.feature");
formatter.feature({
  "name": "This is the login feature with providing DT head",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "This is login Scenario in orange with DT head",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "visiting to orange site",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefenition.DataTableWithHeader.visiting_to_orange_site()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "executing with values",
  "rows": [
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "stepDefenition.DataTableWithHeader.executing_with_values(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click submitButton at end",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefenition.DataTableWithHeader.click_submitButton_at_end()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:FeaturesFile/DataTableWithoutHeader.feature");
formatter.feature({
  "name": "This is the login feature with without header",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "This is login Scenario in orangeHRM without dataheader",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "navigating to OrangeHRM site",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefenition.DataTwithoutHead.navigating_to_OrangeHRM_site()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the below credential",
  "rows": [
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "stepDefenition.DataTwithoutHead.enter_the_below_credential(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "error_message": "io.cucumber.datatable.UndefinedDataTableTypeException: Can\u0027t convert DataTable to List\u003cjava.lang.String\u003e.\nPlease review these problems:\n\n - There was a table cell transformer for java.lang.String but the table was too wide to use it.\n   Please reduce the table width to use this converter.\n\n - There was no table entry or table row transformer registered for java.lang.String.\n   Please consider registering a table entry or row transformer.\n\nNote: Usually solving one is enough\r\n\tat io.cucumber.datatable.UndefinedDataTableTypeException.listNoConverterDefined(UndefinedDataTableTypeException.java:110)\r\n\tat io.cucumber.datatable.DataTableTypeRegistryTableConverter.toList(DataTableTypeRegistryTableConverter.java:136)\r\n\tat io.cucumber.datatable.DataTable.asList(DataTable.java:181)\r\n\tat stepDefenition.DataTwithoutHead.enter_the_below_credential(DataTwithoutHead.java:33)\r\n\tat ✽.enter the below credential(file:///C:/Users/pravi/eclipse-workspace/MukeshCucu/MavenwithCucumber/FeaturesFile/DataTableWithoutHeader.feature:4)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "click submit button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefenition.DataTwithoutHead.click_submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("file:FeaturesFile/GFeature.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I want to write a step with precondition",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefenition.GoogleSteps.i_want_to_write_a_step_with_precondition()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I complete action",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefenition.GoogleSteps.i_complete_action()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "some other action",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefenition.GoogleSteps.some_other_action()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the out",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("file:FeaturesFile/Google.feature");
formatter.feature({
  "name": "This is to check google search operation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Google search scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is enteing the url \"http://www.google.co.in\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefenition.GoogleSearch.user_is_enteing_the_url(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is providing the search \"Mukesh\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefenition.GoogleSearch.user_is_providing_the_search(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "search result are visible to user",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefenition.GoogleSearch.search_result_are_visible_to_user()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "taking the screenshot of the search result",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefenition.GoogleSearch.taking_the_screenshot_of_the_search_result()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:FeaturesFile/LoginOrangeHRM.feature");
formatter.feature({
  "name": "This is the login feature with data",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "This is login Scenario in orangeHRM with data",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "navigating to OrangeHRM",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefenition.LoginOrangeWithData.navigating_to_OrangeHRM()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "providing the credintails \"Admin\" and \"admin123\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefenition.LoginOrangeWithData.providing_the_credintails_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicking the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefenition.LoginOrangeWithData.clicking_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verifying the login page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefenition.LoginOrangeWithData.verifying_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:FeaturesFile/Orange.feature");
formatter.feature({
  "name": "This is the login feature for OrangeHRM",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "This is the login scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefenition.LoginHRM.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enter the login certindial username and password",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefenition.LoginHRM.The_user_enter_the_login_certindial_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click login Button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefenition.LoginHRM.click_login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should navigate to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefenition.LoginHRM.user_should_navigate_to_home_page()"
});
formatter.result({
  "status": "passed"
});
});