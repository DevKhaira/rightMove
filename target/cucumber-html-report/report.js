$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/seleniumframework.feature");
formatter.feature({
  "line": 1,
  "name": "Get a newly listed property",
  "description": "Use selenium java with cucumber-jvm and navigate to website",
  "id": "get-a-newly-listed-property",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "check for sale works",
  "description": "",
  "id": "get-a-newly-listed-property;check-for-sale-works",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I open rightmove website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I search for \u003csearchName\u003e with property type \u003ctype\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I select \u003csort\u003e in sort",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should be able to click the first non-featured property",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "get-a-newly-listed-property;check-for-sale-works;",
  "rows": [
    {
      "cells": [
        "searchName",
        "type",
        "sort"
      ],
      "line": 11,
      "id": "get-a-newly-listed-property;check-for-sale-works;;1"
    },
    {
      "cells": [
        "Isleworth, Middlesex",
        "Houses",
        "Newest Listed"
      ],
      "line": 12,
      "id": "get-a-newly-listed-property;check-for-sale-works;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4660977914,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "check for sale works",
  "description": "",
  "id": "get-a-newly-listed-property;check-for-sale-works;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I open rightmove website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I search for Isleworth, Middlesex with property type Houses",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I select Newest Listed in sort",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should be able to click the first non-featured property",
  "keyword": "Then "
});
formatter.match({
  "location": "BlankStepDefs.i_open_rightmove_website()"
});
formatter.result({
  "duration": 4436883367,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Isleworth, Middlesex",
      "offset": 13
    },
    {
      "val": "Houses",
      "offset": 53
    }
  ],
  "location": "BlankStepDefs.searchForProperty(String,String)"
});
formatter.result({
  "duration": 7789727449,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Newest Listed",
      "offset": 9
    }
  ],
  "location": "BlankStepDefs.sortSearch(String)"
});
formatter.result({
  "duration": 284225103,
  "status": "passed"
});
formatter.match({
  "location": "BlankStepDefs.clickNonFeatured()"
});
formatter.result({
  "duration": 3230055873,
  "status": "passed"
});
formatter.after({
  "duration": 1095612324,
  "status": "passed"
});
});