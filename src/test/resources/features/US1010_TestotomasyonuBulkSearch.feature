Feature: US1010 Kullanici verilen listedeki tum urunler icin arama testi yapar


  Scenario Outline: TC01 liste olarak verilen urunler icin arama yapilabilmeli
    Given kullanici "toUrl" sayfasina gider
    Then arama kutusuna "<wordsToSearch>" yazip aratir
    And arama sonucunda urun bulunabildigini test eder
    Then 1 saniye bekler
    And sayfayi kapatir


    Examples:
      | wordsToSearch |
      | phone         |
      | java          |
      | dress         |
      | nutella       |
      | baby          |
      | apple         |
      | samsung       |

    # arama testini verilen tum kelimeler icin ayri ayri yapin
    # phone, java, dress, nutella, baby, apple, samsung