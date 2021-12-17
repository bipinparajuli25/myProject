@sprint
Feature: get employees info service

  Scenario: validate get call employee info
    When make a get call to the dummy employee

Scenario: validate post all employee info
  When make a post call to the dummy employee



   Scenario Outline: validate put all employee info
      When make a put call to dummy employee "<name>", "<salary>", "<age>"
     Examples:
     |name     | salary | age|
     |Sachin   | 90000  | 43|
     |kohli    | 85000  | 36|
     |ramesh   | 75000  | 42|

  Scenario Outline: validate get call by each employee info
    When make a get call to the dummy employee by "<id>"
    Examples:
    |id  |
    | 19  |
    | 4  |
    |16  |


    Scenario Outline: Validate delete call by each employee info
      When make a delete call to dummy employee by "<name>", "<salary>", "<age>"

      Examples:
      |   name   |     salary    |    age    |
      |  Tiger    |      32800    |     61    |
      |  Airi     |     162700    |     33    |

      Scenario Outline: Validate delete call by each employee
        When make a delete call by "<id>"
        Examples:
        | id |
        | 8  |


        Scenario Outline: Validate get for of each actor
          When make a get call of each actor by "<id>"
          Examples:
            | id |
            | 9 |




