Feature: features of gherkin test

  Background:
    * url baseUrl

  Scenario Outline: client makes call to GET hello
    Given path '/examples/hello'
    And param name = '<name>'
    When method GET
    Then status 200
    And  match response contains '<name>'
    Examples:
      | name |
      | Diego |
      | Sofia |
      | Pepe |

  Scenario Outline: client makes call to GET to sum numbers
    Given path '/examples/sum'
    And param a = '<a>'
    And param b = '<b>'
    When method GET
    Then  status 200
    And  match response == '<result>'
    Examples:
      | a | b | result |
      | 2 | 3 | 5      |
      | 2 | 4 | 6      |
      | 2 | 5 | 7      |