@tag
Feature: Calculate the insurance prime for a customer

  @tag1
  Scenario: The customer age is older than 80
    Given The age is '85' 
    And the gender is 'F'
    And is his status is 'married'
    And he 'have' license
    When calculate the insurance    
    Then show -1

  @tag2
  Scenario Outline: Is the calculated insurance -1?
 	  Given The age is <age> 
    And the gender is <gender>
    And is his status is <status>
    And he <have> license
    When calculate the insurance    
    Then show <returned> 

    Examples: 
      | age  |gender | status    |license| returned |
      | 85   |   "F" | 'married' |'have' | -1				|
      | 50   |   "F" | "married" |'have' | 200			|
      
  @tag3
  Scenario: The customer will receive the maximum car insurance
    Given The age is '21' 
    And the gender is 'M'
    And is his status is 'not married'
    And he 'have' license
    When calculate the insurance    
    Then show 2000

  @tag4
  Scenario Outline: Is the calculated insurance 2000?
 	  Given The age is <age> 
    And the gender is <gender>
    And is his status is <status>
    And he <have> license
    When calculate the insurance    
    Then show <returned> 

    Examples: 
      | age  |gender | status        |license| returned |
      | 21   |   "M" | 'not married' |'have' | 2000			|
      | 50   |   "F" | "married"     |'have' | 200			|
      
      
 @tag5
  Scenario: The customer don’t have license
    Given The age is '21' 
    And the gender is 'M'
    And is his status is 'not married'
    And he 'not have' license
    When calculate the insurance    
    Then show 2000

  @tag6
  Scenario Outline: Is the calculated insurance -1?
 	  Given The age is <age> 
    And the gender is <gender>
    And is his status is <status>
    And he <have> license
    When calculate the insurance    
    Then show <returned> 

    Examples: 
      | age  |gender | status        |license     | returned |
      | 21   |   "M" | 'not married' |' not have' | -1			|
      | 50   |   "F" | "married"     |'have'      | 200			|