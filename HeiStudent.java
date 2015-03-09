import java.util.Scanner;

class heiStudent{
      public static void main(String[] args){
	  System.out.println("Hei Student!");

	  String navn;
	  navn = "Soheil";
	  System.out.println("Hei " + navn);
	  
	  Scanner inn;
	  String innNavn;
	  inn = new Scanner(System.in);
	  System.out.println("Hva er navnet ditt?");
	  innNavn = inn.nextLine();
	  System.out.println("Hello " + innNavn);
	  
	  int tall1, tall2, sum1;
	  tall1 = 3;
	  tall2 = 4;
	  sum1 = tall1 + tall2;
	  System.out.println(sum1);

	  int tall3, tall4, sum2;	  
	  System.out.println("Skriv inn et tall ");
	  tall3 = inn.nextInt();
	  System.out.println("Skriv inn enda et tall");
	  tall4 = inn.nextInt();
	  sum2 = tall3 + tall4;
	  System.out.println("Summen av de to tallene er " + sum2);

      }     
}