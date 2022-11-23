@us12
Feature: US012 Doktor hastalardan test isteyebilmeli

  Background:
    Given kullanici "medunna" sayfasina gider
    Then kullanici Sign in butonuna tiklar
    And Username ve Password girer
    And kullanici doktor hesabi ile giris yapar

  Scenario: US012 TC001 Doctor test isteyebilmeli Request A Test
    Then kullanici atanan hastalari goruntuler
    And kullanici hasta duzenleye tiklar
    And kullanici 2 saniye bekler
    And kullanici request a test botununa tiklar
    And kullanici 3 saniye bekler
    And kullanici sayfayi kapatir

  Scenario: US012 TC002 test icerigi secenekleri
    Then kullanici atanan hastalari goruntuler
    And kullanici hasta duzenleye tiklar
    And kullanici 2 saniye bekler
    And kullanici request a test botununa tiklar
    And kullanici 5 saniye bekler
    And kullanici testleri goruntuler
    And kullanici sayfayi kapatir

  Scenario: US013 TC001 doktor test sonuc bilgilerini gorebilmeli
    Then kullanici randevulu hastalari goruntuler
    And kullanici hasta duzenleye tiklar
    And kullanici 3 saniye bekler
    And kullanici test sonuclarini goruntuler
    And kullanici test sonucunu gorur
    And kullanici sayfayi kapatir

  Scenario: US013 TC002 doktor yatili tedavi isteginde bulunabilmeli
    Then kullanici randevulu hastalari goruntuler
    And kullanici hasta duzenleye tiklar
    And kullanici 3 saniye bekler
    And kullanici hastaya yatis talep eder
    And kullanici sayfayi kapatir

  Scenario: US014 TC001 Doktor yatili hasta işlemleri yapabilmeli
    Then kullanici yatan hasalari tiklar
    And kullanici yatan hasta duzenleye tiklar
    And kullanici 2 saniye bekler
    And kullanici hasta olustur ve duzenle bilgilerini goruntuler
    And kullanici sayfayi kapatir

    Scenario: US014 TC002 doktor status bilgilerini guncelleyebilmeli
      Then kullanici yatan hasalari tiklar
      And kullanici yatan hasta duzenleye tiklar
      And kullanici 2 saniye bekler
      And kullanici statusu UNAPPROVED secer


