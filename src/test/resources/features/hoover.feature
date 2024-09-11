Feature: Hoover navigation and cleaning

  @smoke
  Scenario: Clean dirt patches and reach the final position
    Given the room dimensions are (5, 5)
    When the hoover starts at coordinates (1, 2)
    And there are dirt patches at the following coordinates:
      | 1 | 0 |
      | 2 | 2 |
      | 2 | 3 |
    When the hoover receives the instructions "NNESEESWNWW"
    Then the hoover should be at coordinates (1, 3)
    And the hoover should have cleaned 1 patches of dirt

  @smoke
  Scenario: Hoover moves within bounds and doesn't clean any patches
    Given the room dimensions are (3, 3)
    When the hoover starts at coordinates (1, 1)
    And there are dirt patches at the following coordinates:
      | 0 | 0 |
      | 2 | 2 |
    When the hoover receives the instructions "NNSS"
    Then the hoover should be at coordinates (1, 0)
    And the hoover should have cleaned 1 patches of dirt

  @smoke
  Scenario: Hoover moves within bounds and clean all patches
    Given the room dimensions are (3, 3)
    When the hoover starts at coordinates (0, 0)
    And there are dirt patches at the following coordinates:
      | 0 | 0 |
      | 1 | 0 |
      | 2 | 0 |
      | 0 | 1 |
      | 1 | 1 |
      | 2 | 1 |
      | 0 | 2 |
      | 1 | 2 |
      | 2 | 2 |
    When the hoover receives the instructions "EENWWNEE"

  @smoke
  Scenario: Hoover moves within bounds and clean one patches
    Given the room dimensions are (3, 3)
    When the hoover starts at coordinates (0, 0)
    And there are dirt patches at the following coordinates:
      | 0 | 0 |
    When the hoover receives the instructions "NN"
