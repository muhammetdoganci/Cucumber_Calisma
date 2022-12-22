Feature: Amazonda arama yapma

  @amazon

 Scenario Outline: Verilen listeyi amazonda arama yapma

    Given kullanici "amazonUrl" web sayfasina gider
    Then kullanici "<arananUrun>" icin arama yaapr
    And kullanici sonuc yazisini yazdirir
    And sonucun "<arananUrun>" icerdigini test eder
    Then kullanici sayfayi kapatir

    Examples:
    |arananUrun|
    |school|
    |pencil|
    |biskrem|
    |nutella|




