Feature: randevu

  @randevu

  Scenario Outline: hasta girişi yapmadan randevu alma
    Given hasta "medunna" sayfasina gider
    And randevu al bolumune gider
    And isim "<First Name>" girer
    And soyisim "<Last Name>" girer
    And SSN "<SSN>" girer
    And Email "<Email>" girer
    And Phone "<Phone>" girer
    And Appointment DateTime "<Appointment DateTime>" girer
    Then hasta rendevu al butonuna tiklar
    And  randevu olusturuldugunu dogrular
    And  hasts sayfayi kapatir

    Examples:
    |First Name|Last Name|SSN|Email|Phone|Appointment DateTime|
    |Muhammet|DOGANCI|547-85-1632|qazwxxcd@gmail.com|5555555555|01.02.2023|



