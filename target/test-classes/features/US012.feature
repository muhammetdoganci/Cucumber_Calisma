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
    And kullanici 5 saniye bekler
    And kullanici "Glucose, Urea, Creatinine, Sodium, Potassium, Total protein, Albumin, Hemoglobin" testlerini secer
    And kullanici sayfayi kapatir

  Scenario: US012 TC002 test icerigi secenekleri
    Then kullanici atanan hastalari goruntuler
    And kullanici hasta duzenleye tiklar
    And kullanici 2 saniye bekler
    And kullanici request a test botununa tiklar
    And kullanici 3 saniye bekler
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
    And kullanici 2 saniye bekler
    And kullanici yatan hasta bilgilerini dogrular
    And kullanici 2 saniye bekler
    And kullanici sayfayi kapatir

    Scenario: US014 TC002 doktor status bilgilerini guncelleyebilmeli
      Then kullanici yatan hasalari tiklar
      And kullanici yatan hasta duzenleye tiklar
      And kullanici 2 saniye bekler
      And kullanici statusu UNAPPROVED secer
      And kullanici kaydede tiklar

  Scenario: US014 TC003 doktor status bilgilerini guncelleyebilmeli
    Then kullanici yatan hasalari tiklar
    And kullanici yatan hasta duzenleye tiklar
    And kullanici 2 saniye bekler
    And kullanici statusu STAYING secer
    And kullanici kaydede tiklar

    @us12tc004
  Scenario: US014 TC004 doktor status bilgilerini guncelleyebilmeli
    Then kullanici yatan hasalari tiklar
    And kullanici yatan hasta duzenleye tiklar
    And kullanici 2 saniye bekler
    And kullanici statusu DISCHARGED secer
    And kullanici kaydede tiklar

  @us12tc005
  Scenario: US014 TC005 doktor status bilgilerini guncelleyebilmeli
    Then kullanici yatan hasalari tiklar
    And kullanici yatan hasta duzenleye tiklar
    And kullanici 2 saniye bekler
    And kullanici statusu CANCELLED secer
    And kullanici kaydede tiklar

  @us12tc006
  Scenario: US014 TC006 doktor status bilgilerini guncelleyebilmeli
    Then kullanici yatan hasalari tiklar
    And kullanici yeni yatan hasta duzenleye tiklar
    And kullanici 2 saniye bekler
    And kullanici oda secer
    And kullanici kaydede tiklar
    And kullanici odanin onaylandigini dogrular




