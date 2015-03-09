import java.util.Scanner;

// Lag et program som faar brukeren til å skrive inn to tall.
// Faa brukeren til aa gjette summen av disse to tallene.
// Skriv ut om brukeren har rett eller ikke.

class minOppgave1{
      public static void main(String[] args){
	  System.out.println("Skriv inn et tall");
	  Scanner inn;
	  int tall1, tall2, sum, svar;
	  inn = new Scanner(System.in);
	  tall1 = inn.nextInt();
	  System.out.println("Skriv inn et tall du vil addere med det forste tallet");
	  tall2 = inn.nextInt();
	  sum = tall1 + tall2;
	  System.out.println("Hva tror du at summen av det forste og andre tallet blir?");
	  svar = inn.nextInt();
	  if(svar == sum){
	      System.out.println("Det er korrekt, summen er: " + sum);
	  }else{
	      System.out.println("Det er feil, summen er: " + sum);
	  }
      }
}