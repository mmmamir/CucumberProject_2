Feature: Open Accounts

  @account
 Scenario Outline: open the Accounts
    Given the user navigate the "https://demo.espocrm.com/? lang=en_US#"
    When the user open the Accounts
    Then the user clicks the Create Account button
    And the user create new account "<name>", "<website>", "<email>", "<phone>", "<country>", "<postalCode>", "<state>", "<city>","<street>" "<type>", "<industry>", "<description>"
    And the user validate the new users is created "<name>", "<website>", "<email>", "<phone>", "<country>", "<postalCode>", "<state>", "<city>","<street>" "<type>", "<industry>", "<description>"
    Examples:
    | name   | website        | email            | phone      | country | postalCode | state | city           | street           | type     | industry  | description |
    | Ahmed  | www.google.com | ahmed@gmail.com  | 8768765656 | USA     | 60065      | IL    | Chicago        | 234 W Oakton St  | Customer | Defense   | Thank you   |
    | Ramis  | www.google.com | ramis@gmail.com  | 5645645454 | USA     | 65550      | IL    | Mount Prospect | 6547 E Devon Ave | Investor | Computer  | Thank you   |
    | Serhat | www.google.com | serhat@gmail.com | 4324324343 | USA     | 30007      | IL    | Chicago        | 32 N Wille Rd    | Partner  | Education | Thank you   |
    | Amir   | www.google.com | amir@gmail.com   | 4563457878 | USA     | 45453      | IL    | Des Peline     | 4356 Dover Dr    | Reseller | Energy    | Thank you   |
