public class Firma
  {
   public static void main(String args[])
  {
   Pracownik pracownik1 = new Pracownik();
   Pracownik pracownik2 = new Pracownik();

  pracownik1.imie = "Marian";
  pracownik1.nazwisko = "Biskupiec";
  pracownik1.wiek = 35;

  pracownik2.imie = "Maciej";
  pracownik2.nazwisko = "Cichociemny";
  pracownik2.wiek = 29;

  System.out.println("Pracownicy firmy: ");
  System.out.println(pracownik1.imie + "" +pracownik1.nazwisko+""+pracownik1.wiek+" lat");
  System.out.println(pracownik2.imie + "" +pracownik2.nazwisko+""+pracownik2.wiek+" lat"); 
    
  }
  }