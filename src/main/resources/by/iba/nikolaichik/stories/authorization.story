Scenario: User authorization
Given user is opening browser
When user is opening site http:\\ebay.com
And user is closing popup
And user is opening login page
And user is entering atest.test1@mail.ru and a12345678
Then user cabinet is opened, title is Мой eBay Краткий обзор