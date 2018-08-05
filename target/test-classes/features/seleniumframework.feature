Feature: Get a newly listed property
  Use selenium java with cucumber-jvm and navigate to website

  Scenario Outline: check for sale works
    Given I open rightmove website
    When I search for <searchName> with property type <type>
    And I select <sort> in sort
    Then I should be able to click the first non-featured property

    Examples:
    |searchName           | type   | sort               |
    |Isleworth, Middlesex | Houses | Newest Listed      |