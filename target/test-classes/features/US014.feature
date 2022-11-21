@us14
Feature: US014 kullanici yatan hasta islemleri yapabilmeli

  Background:
    Given kullanici "medunna" sayfasina gider
    When kullanici Sign in butonuna tiklar
    And Username ve Password girer
    And kullanici doktor hesabi ile giris yapar

    Scenario: TC001 Doktor yatili hasta işlemleri yapabilmeli
      Then kullanici yatan hasalari tiklar
      And kullanici yatan hasta duzenleye tiklar
      And kullanici hasta olustur ve duzenle bilgilerini goruntuler
      And kullanici sayfayi kapatir