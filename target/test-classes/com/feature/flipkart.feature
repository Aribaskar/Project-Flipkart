Feature: Search for mobile phone under 20000 on Flipkart

Scenario: User searches for mobile under 20000
		  Given I am on the Flipkart homepage
		  When I search for "mobile"
		  And I filter the price to "under 20000"
		  Then I should see mobiles prices under 20000