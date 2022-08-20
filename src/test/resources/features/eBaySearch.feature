Feature: eBay search, verify and navigate functionality
Background:
  Given I navigate to www.ebay.co.uk
  And I am a non-registered customer
  When I search for an "iphone"
  Then I get a list of matching results

  @wip
  Scenario:Search and verify results
    And the resulting items cards show: postage price, No of bids, price or show BuyItNow tag
    When I sort the results by Lowest Price
    Then the results are listed in ascending order
    When I sort the results by Highest Price
    Then the results are listed in descending order

  @wip
  Scenario: Search and navigate through results pages
    And the results show more than one page
    And the user can navigate through the pages to continue looking at the items


