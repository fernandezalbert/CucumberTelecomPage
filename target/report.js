$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Cucumberfrst/AddCustomer.feature");
formatter.feature({
  "name": "To test add cucstomer functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "To test customer id generation",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@us1"
    },
    {
      "name": "@sprint1"
    }
  ]
});
formatter.step({
  "name": "the user is in add customer page",
  "keyword": "Given "
});
formatter.match({
  "location": "AddCustomerPage.the_user_is_in_add_customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user fill in valid customer details",
  "rows": [
    {
      "cells": [
        "Albert",
        "Fernandez",
        "albert@gmail.com",
        "Chennai",
        "8508676566"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerPage.the_user_fill_in_valid_customer_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user click the submit button",
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerPage.the_user_click_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the customer id generated",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomerPage.the_user_should_see_the_customer_id_generated()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To test customer id generation",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@us2"
    },
    {
      "name": "@sprint1"
    }
  ]
});
formatter.step({
  "name": "the user is in add customer page",
  "keyword": "Given "
});
formatter.match({
  "location": "AddCustomerPage.the_user_is_in_add_customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user fill in valid customer details",
  "rows": [
    {
      "cells": [
        "Hello",
        "Fernandez",
        "albert@gmail.com",
        "Chennai",
        "8508676566"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerPage.the_user_fill_in_valid_customer_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user click the submit button",
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerPage.the_user_click_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the customer id generated",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomerPage.the_user_should_see_the_customer_id_generated()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To test customer id generation",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@us2"
    },
    {
      "name": "@sprint3"
    }
  ]
});
formatter.step({
  "name": "the user is in add customer page",
  "keyword": "Given "
});
formatter.match({
  "location": "AddCustomerPage.the_user_is_in_add_customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user fill in valid customer details",
  "rows": [
    {
      "cells": [
        "Christopher",
        "Fernandez",
        "albert@gmail.com",
        "Chennai",
        "8508676566"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerPage.the_user_fill_in_valid_customer_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user click the submit button",
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerPage.the_user_click_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the customer id generated",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomerPage.the_user_should_see_the_customer_id_generated()"
});
formatter.result({
  "status": "passed"
});
});