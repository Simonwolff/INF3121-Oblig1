import java.util.Scanner;

class beslutninger{
      public static void main(String[] args){
	  int tall1;
	  tall1 = 5;

	  Scanner inn;
	  inn = new Scanner(System.in);
	  
	  System.out.println("Skriv inn din alder");
	  tall1 = inn.nextInt();
	  
	  if(tall1 >= 18){
	      System.out.println("Du er myndig");
	  }else{
	      System.out.println("Du er ikke myndig");
	  }

      }     
}