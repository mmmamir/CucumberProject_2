Feature: EspoCRM Functionality

  @espocrm
  Scenario: EspoCRM
    Given the user navigate the https "https://demo.espocrm.com/? lang=en_US#"
    When the user opens the home page
    Then the user should see the function names
      | Home |
      | Accounts |
      | Contacts |
      | Leads |
      | Opportunities |
      | Reports |
      | Quotes |
      | Sales Orders |
      | Invoices |
      | Products |
      | Emails |
      | Cases |
      | Calender |
      | Tasks |