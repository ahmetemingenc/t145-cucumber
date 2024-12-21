Feature: US1007 Facebook kayit olma


  Scenario: TC01 kullanici faker degeleri ile kayit olabilmeli
    Given kullanici "facebookUrl" sayfasina gider
    Then facebook'da yeni hesap olustur butonuna basar
    And 1 saniye bekler
    When Faker class'indan bilgilerle facebook kayit formunu doldurur
    Then 2 saniye bekler
    And facebook kayit ol tusuna basar
    Then 2 saniye bekler
    And sayfayi kapatir