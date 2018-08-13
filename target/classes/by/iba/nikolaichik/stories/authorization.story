Scenario: User authorization

Given open site http:\\ebay.com
When site is opened, title is Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay
And close popup
And open login page
And enter login atest.test1@mail.ru and password a12345678
Then user cabinet is opened, title is Мой eBay Краткий обзор