
@ftag1
Feature: UK Test Ticket 
  I want to use this template for my feature file

  @tag1
  Scenario: Paying for NHS costs online service.1
	Given I am a citizen of the UK
	When I put my circumstances into the Checker tool
	Then I should get a result of whether I will get help or not
