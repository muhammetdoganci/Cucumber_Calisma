Feature: Amazon search

  Scenario: TC001 kullanici amazon sayfasinda Nutella aratir.
    Given kullanici amazon sayfasina gider
    When kullanici Nutella icin arama yapar
    Then sonuclarin Nutella icerdigini test eder
    And sayfayi kapatir
