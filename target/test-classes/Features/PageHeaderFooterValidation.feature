Feature:  Header and Footer Validation
  To verify all the details in the header and footer of the page which si constant during the page navigation

  Scenario: Layer 1 : Amazon  india Page Header Validation
    Given User verified the Amazon Logo
    And Verify the GeoLocationSelection Link
    And Verify the List and Accounts Link
    And verify the Return and Orders Link
    And Verify the Cart Link

 Scenario Outline: Layer 2 : Amazon  india Page Header Language Validation
    Given User verified the Amazon Logo
    And Select the Language from Menu Bar "<Language>"
   Examples:
     | Language |
     |English - EN|

  Scenario: Layer 3 : Amazon  india Page Header Validation
    Given User selected the All Categories Dropdown for Verify
    |All Categories|
    |Deals|
    |Alexa Skills|
    |Amazon Devices|
    |Amazon Fashion|
    |Amazon Pantry|
    |Appliances|
    |Apps & Games|
    |Baby|
    |Beauty|
    |Books |
    And All CategoriesDropdown Validated successfully
    And Hamburger Menu Validated
    And Progressive Menu Validated
    |Best Sellers|
    |Mobiles|
    |Fashion|
    |Electronics|
    |New Releases|
    |Customer Service|
    |Amazon Pay|
    |Computers|




