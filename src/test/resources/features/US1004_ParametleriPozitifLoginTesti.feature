Feature: US1004 Kullanici gecerli bilgilerle giris yapar

  Scenario: TC01 kullanici gecerli bilgilerle giris yapabilmeli
    Given kullanici testotomasyonu ana sayfaya gider
    Then account linkine tiklar
    When email olarak "toValidEmail" girer
    And password olarak "toValidPassword" girer
    And login butonuna basar
    Then basarili olarak giris yapilabildigini test eder
    And logout butonuna basar
