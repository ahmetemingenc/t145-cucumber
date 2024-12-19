Feature: US1001 Arama Testi

  Scenario: TC01 kullanıcı phone arattığında ürün bulabilmeli

    Given kullanici testotomasyonu ana sayfaya gider
    Then arama kutusuna phone yazip aratir
    And arama sonucunda urun bulunabildigini test eder
    And sayfayi kapatir


  Scenario: TC02 kullanici dress arattiginda urun bulabilmeli
    Given kullanici testotomasyonu ana sayfaya gider
    Then arama kutusuna dress yazip aratir
    When arama sonucunda urun bulunabildigini test eder
    And sayfayi kapatir


  Scenario: TC03 kullanici baby arattiginde urun bulabilmeli
    Given kullanici testotomasyonu ana sayfaya gider
    When arama kutusuna baby yazip aratir
    Then arama sonucunda urun bulunabildigini test eder
    And sayfayi kapatir