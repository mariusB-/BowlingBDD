Feature: Bowling Game

  Background:
    Given a player starts a new bowling game

  Scenario: Two simple throws
      When he throws the following pins
        | pins  |
        | 5		|
        | 4		|
      Then his total score should be 9
      
  @Skip
  Scenario: Four simple throws
      When he throws the following pins
        | pins  |
        | 5		|
        | 4		|
        | 7		|
        | 2		|       
      Then his total score should be 18
      And the score for frame 1 should be 9
      And the score for frame 2 should be 18  

  @Skip      
  Scenario: One simple spare
      When he throws the following pins
        | pins  |
        | 3		|
        | 7		|
        | 3		|
      Then the score for frame 1 should be 13

  @Skip      
  Scenario: Simple frame after spare
      When he throws the following pins
        | pins	|
        | 3		|
        | 7		|
        | 3		|
        | 2		|
      Then the score for frame 1 should be 13  
      And the score for frame 2 should be 18
      And his total score should be 18

  @Skip      
  Scenario: Two five pin throws that are no spare
      When he throws the following pins
        | pins  |
        | 3   	| 
        | 5   	|  
        | 5   	|  
        | 2   	|     
      Then his total score should be 15
      Then the score for frame 1 should be 8
      And the score for frame 2 should be 15

  @Skip      
  Scenario: One simple strike
      When he throws the following pins
        | pins  |
        | 10  	|
        | 3   	|
        | 6   	|
      Then the score for frame 1 should be 19
      And his total score should be 28

  @Skip      
  Scenario: A perfect game
      When he throws 10 pins 12 times
      Then his total score should be 300

  @Skip      
  Scenario: Spare in last frame
      When he throws 0 pins 18 times
      And he throws the following pins
        | pins  |
        | 2   	|
        | 8   	|
        | 10   	|      
      Then his total score should be 20

  @Skip      
  Scenario: Sample game
      When he throws the following pins
        | pins  |
        | 1   	|
        | 4   	|
        | 4   	|
        | 5   	|
        | 6   	|
        | 4   	|
        | 5   	|
        | 5   	|
        | 10   	|
        | 0  	|
        | 1   	|
        | 7   	|
        | 3   	|
        | 6   	|
        | 4   	|
        | 10   	|
        | 2  	|
        | 8   	|        
        | 6   	|            
      Then his total score should be 133

  @Skip
  Scenario: Heartbreak
      When he throws 10 pins 11 times
      And he throws the following pins
        | pins  |
        | 9   	|    
      Then his total score should be 299              