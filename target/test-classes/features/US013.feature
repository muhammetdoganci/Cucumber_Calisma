@us13
Feature: US013 kullanici test results islemleri yapabilmeli

  Background:
    Given kullanici "medunna" sayfasina gider
    When kullanici Sign in butonuna tiklar
    And Username ve Password girer
    And kullanici doktor hesabi ile giris yapar

  Scenario: TC001 kullanici test sonuc bilgilerini gorebilmeli
    Then kullanici randevulu hastalari goruntuler
    And kullanici hasta düzenleye tiklar
    And kullanici 3 saniye bekler
    And kullanici test sonuclarini goruntuler
    And kullanici test sonucunu gorur


