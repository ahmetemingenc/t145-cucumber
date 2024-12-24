Feature: US1013 WebDriverUniversity negatif login testi

  @wip
  Scenario: TC01 fake degerler ile giris yapilamamli
    Given kullanici "webUniUrl" sayfasina gider
    When login Portal'a kadar asagi iner
    And 2 saniye bekler
    And login Portal'a tiklar
    Then acilan diger windowa gecer
    And username ve password kutularina fake degerler yazdirir
    And webDriverUniversity login butonuna basar
    Then popup'ta cikan yazinin "validation failed" oldugunu test eder
    And Ok diyerek Popup'i kapatir
    When ilk window'a geri doner
    Then ilk window'a donuldugunu test eder
    And sayfayi kapatir