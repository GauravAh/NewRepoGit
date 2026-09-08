Feature: Search and Place order for products

  @Smoke
  Scenario: Search Experience for product search in both home and offers page
    Given User should be on GreenCart Landing page
    When User search with shortname "Tom" and extracted the actual name of product
    Then User search for the same shortname "Tom" in offers page to check if product exist
