Feature: US1006 Dinamik URL Kullanimi


  Scenario: TC01 kullanici url'i dinamik olarak girebilmeli
    Given kullanici "toFormUrl" sayfasina gider
    Then dogum tarihi ay acilir menuden "Haziran" secer
    And secilen ayin "Haziran" oldugunu test eder
    When acilir menude toplam 13 option oldugunu test eder
    And 2 saniye bekler
    And sayfayi kapatir