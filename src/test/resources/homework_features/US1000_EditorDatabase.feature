

  Feature: US1000 kullanici girdigi isim ile yaptigi aramayi test eder
  @wip
  Scenario Outline: TC15 kullanici girdigi isim bilgilerini gorebilmeli

    Given kullanici "dataTablesUrl" anasayfaya gider
  Then new butonuna basar
  And listedeki "<istenenBilgiler>" tum bilgileri girer
  And Create tusuna basar
  When kullanici ilk isim ile arama yapar
  Then isim bolumunde isminin oldugunu dogrular
    Examples:
      | istenenBilgiler|
      | istenenBilgiler|
      | istenenBilgiler|
      | istenenBilgiler|
      | istenenBilgiler|
      | istenenBilgiler|
