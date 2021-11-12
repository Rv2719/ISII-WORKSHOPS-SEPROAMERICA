@tag
Feature: Calculate the insurance prime for a customer

 
      
      
 @tag5
  Scenario: The customer don’t have license
    Given the age is 21 
    And the gender is 'M'
    And is his status is 'not married'
    And he 'not have' license
    When calculate the insurance    
    Then show -1

  @tag6
  Scenario Outline: Is the calculated insurance -1?
 	  Given the age is <age> 
    And the gender is <gender>
    And is his status is <status>
    And he <license> license
    When calculate the insurance    
    Then show <returned> 

    Examples: 
      | age  |gender | status        |license     | returned |
      | 21   |   "M" | 'not married' |' not have' | -1			|
      | 50   |   "F" | "married"     |'have'      | 200			|