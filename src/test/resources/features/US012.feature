@us12
Feature: US012 Doktor hastalardan test isteyebilmeli

  Background:
    Given kullanici "medunna" sayfasina gider
    Then kullanici Sign in butonuna tiklar
    And Username ve Password girer
    And kullanici doktor hesabi ile giris yapar

  Scenario: TC001 Doctor test isteyebilmeli Request A Test
    Then kullanici atanan hastalari goruntuler
    And kullanici hasta duzenleye tiklar
    And kullanici 2 saniye bekler
    And kullanici request a test botununa tiklar
    And kullanici 3 saniye bekler
    And kullanici sayfayi kapatir

  Scenario: TC002 test icerigi secenekleri
    Then kullanici atanan hastalari goruntuler
    And kullanici hasta duzenleye tiklar
    And kullanici 2 saniye bekler
    And kullanici request a test botununa tiklar
    And kullanici 5 saniye bekler
    And kullanici testleri goruntuler
    And kullanici sayfayi kapatir


