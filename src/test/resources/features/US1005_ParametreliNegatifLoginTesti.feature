Feature: US1005 Gecersiz bilgilerle giris yapilamaz

  Scenario: TC01 gecersiz email ile giris yapilamamali
    Given kullanici testotomasyonu ana sayfaya gider
    Then account linkine tiklar
    When email olarak "toInvalidEmail" girer
    And password olarak "toValidPassword" girer
    Then login butonuna basar
    And giris yapilamadigini test eder
    And 2 saniye bekler
    And sayfayi kapatir