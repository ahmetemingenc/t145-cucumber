Feature: US1002 Bastaki Tekrarlari Background ile Yapma

  Background: sayfaya gitme
    Given kullanici testotomasyonu ana sayfaya gider

  Scenario: TC04 kullanıcı phone arattığında ürün bulabilmeli
    Then arama kutusuna phone yazip aratir
    And arama sonucunda urun bulunabildigini test eder
    And sayfayi kapatir

  @firstTry
  Scenario: TC05 kullanici dress arattiginda urun bulabilmeli
    Then arama kutusuna dress yazip aratir
    When arama sonucunda urun bulunabildigini test eder
    And sayfayi kapatir


  Scenario: TC06 kullanici baby arattiginde urun bulabilmeli
    When arama kutusuna baby yazip aratir
    Then arama sonucunda urun bulunabildigini test eder
    And sayfayi kapatir