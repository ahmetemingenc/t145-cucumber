Feature:

  @parallel1
  Scenario:
    Given kullanici "sauceUrl" sayfasina gider
    And 2 saniye bekler
    Then saucedemo username kutusuna "standard_user" yazar
    And saucedemo password kutusuna "secret_sauce" yazar
    And 2 saniye bekler
    Then saucedemo login tusuna basar
    And ilk urunun ismini kaydeder ve bu urunun sayfasina gider
    When saucedemo add to Cart butonuna basar
    Then saucedemo alisveris sepetine tiklar
    And 2 saniye bekler
    And sectigi urunun basarili olarak sepete eklendigini test eder
    And 2 saniye bekler
