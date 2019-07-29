

Feature: Teste de api rest CRM



@tag1
Scenario: Teste de Activity
Given url "https://swapi.co/api/films/"
When method GET
And match response contains {director : 'George Lucas' }
Then status 200

 
