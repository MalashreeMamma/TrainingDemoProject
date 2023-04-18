$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/Loginpractice.feature");
formatter.feature({
  "name": "For tetsing purpose",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "For the login page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.step({
  "name": "\u003cUsername\u003e and \u003cPassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "Click on login button",
  "keyword": "And "
});
formatter.step({
  "name": "Login page should be opened",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "Admin",
        "admin123"
      ]
    }
  ],
  "tags": [
    {
      "name": "@Valid"
    }
  ]
});
formatter.scenario({
  "name": "For the login page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@Valid"
    }
  ]
});
formatter.step({
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Loginpractice1.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Admin and admin123",
  "keyword": "When "
});
formatter.match({
  "location": "Loginpractice1.username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "Loginpractice1.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login page should be opened",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginpractice1.login_page_should_be_opened()"
});
formatter.result({
  "status": "passed"
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "Admin123",
        "Abc123"
      ]
    }
  ],
  "tags": [
    {
      "name": "@Invalid"
    }
  ]
});
formatter.scenario({
  "name": "For the login page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@Invalid"
    }
  ]
});
formatter.step({
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Loginpractice1.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Admin123 and Abc123",
  "keyword": "When "
});
formatter.match({
  "location": "Loginpractice1.username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "Loginpractice1.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login page should be opened",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginpractice1.login_page_should_be_opened()"
});
formatter.result({
  "status": "passed"
});
});