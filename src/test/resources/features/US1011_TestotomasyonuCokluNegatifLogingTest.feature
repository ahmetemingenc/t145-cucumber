Feature: US1011 Kullanici yanlis bilgiler kullandiginda giris yapamaz


  Scenario Outline: TC01 yanlis kullanici bilgileri ile giris yapilamamali

    Given kullanici "toUrl" sayfasina gider
    Then account linkine tiklar
    When email olarak direkt kullanilacak "<givenEmail>" girer
    And password olarak direkt kullanilacak "<givenPassword>" girer
    Then login butonuna basar
    And giris yapilamadigini test eder
    And 1 saniye bekler


    Examples:
      | givenEmail       | givenPassword |
      | esra@fmail.com   | 1234555       |
      | gamze@gmail.com  | mesela123     |
      | zehra@zmail.com  | asdf4321      |
      | ayca@amail.com   | 6543241tre65  |
      | gulnur@gmail.com | 123ert678     |