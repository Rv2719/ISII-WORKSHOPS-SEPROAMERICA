Feature: Calculate the insurance prime for a customer
 Scenario: The customer is a woman, who is 21 years old and is married
 Given the customer is a woman
 And is 21 years old
 And is married
 When I calculated the insurance
 Then show 300
 
 Scenario: The customer is a man,  single and id 21 years old
 Given the customer is a man
 And is 21 years old
 And is single
 When I calculated the insurance
 Then show 2000
 
 Scenario Outline: The customer don’t have license
 Given the customer don have license
 When I calculated the insurance
 Then I show -1
 
 Examples:
 | gender | age | married | license | show |
 | woman |  21 |     yes |     yes |  300 |
 |   man |  21 |     no  |     yes | 2000 |
 | man   |  21 |     yes |     no  |   -1 |
