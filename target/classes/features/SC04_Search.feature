@smoke

Feature: SC4 users could search for products by name and sku

  Scenario Outline: user could search using product name


    When user clicks on search field
    And user search "<productname>"
    Then user find "<productname>"

    Examples:
      |productname|
      |book|
      |laptop|
      |nike|

  Scenario Outline: user could search for product using sku
    When user clicks on search field
    And user search "<sku>"
    Then user find sku product "<sku>"

    Examples:
      |sku|
      |SCI_FAITH|
      |APPLE_CAM|
      |SF_PRO_11|