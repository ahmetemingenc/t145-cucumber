Feature: US1003 Kullanici parametre olarak yazdigi kelimeyi aratir

  Scenario: TC01 kullanici istedigi kelimeyi aratabilmeli
    Given kullanici testotomasyonu ana sayfaya gider
    When arama kutusuna "samsung" yazip aratir
    Then arama sonucunda urun bulunabildigini test eder
    And 2 saniye bekler
