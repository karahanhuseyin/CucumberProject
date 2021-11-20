
@background
Feature: US1002 amazon background ile arama

  Background: amazon sayfasina gitme
   When kullanici amazon sayfasina gider



  Scenario: TC04 amazon nutella arama
    And  nutella icin arama yapara
    Then sonucun nutella icerdigini test eder
    And  sayfayi kapatir



  Scenario: TC05 amazon java arama
    And  java icin arama yapara
    Then sonucun java icerdigini test eder
    And  sayfayi kapatir



  Scenario: TC06 amazon ipad  arama
    And  ipad icin arama yapara
    Then sonucun ipad icerdigini test eder
    And  sayfayi kapatir