
Feature: US1011 Saucedemo alisveris testi

  @wip
  Scenario: TC15 Saucedemo sitesinden alisveris yapilabilmeli

    Given kullanici "sauceDemoUrl" anasayfaya gider
    Then Username kutusuna "standard_user" yazar
    And Password kutusuna "secret_sauce" yazar
    And Login tusuna basar
    When Ilk urunun ismini kaydeder ve bu urunun sayfasina gider
    And Add to Cart butonuna basar
    Then Alisveris sepetine tiklar
    And Sectigi urunun basarili olarak sepete eklendigini kontrol eder
    Then sayfayi kapatir