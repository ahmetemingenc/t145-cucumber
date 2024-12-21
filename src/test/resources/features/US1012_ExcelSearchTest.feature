Feature: US1012 Excel'de toplu arama

  @wip
  Scenario Outline: TC01 arama sonucunda excelde verilen minimum sonucdan fazla urun bulunabilmeli
    Given kullanici "toUrl" sayfasina gider
    Then urun excelindeki "<istenenSatir>" daki urunun min. miktarini ve urunismini kaydeder
    And urun ismini testotomasyonu sayfasinda aratir ve bulunan sonuc sayisini kaydeder
    And bulunan sonuc sayisinin "<istenenSatir>" da verilen min. miktara esit veya daha fazla oldugunu test eder
    And sayfayi kapatir


    Examples:
      | istenenSatir |
      | 2            |
      | 3            |
      | 4            |
      | 5            |
      | 6            |
      | 7            |
      | 8            |
      | 9            |