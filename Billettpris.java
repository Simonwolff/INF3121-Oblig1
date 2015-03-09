import java.util.Scanner;

class billettpris{
      public static void main(String[] args){
	  int alder;
	  System.out.println("Skriv inn din alder");
	  Scanner inn;
	  inn = new Scanner(System.in);
	  alder = inn.nextInt();

	  if(alder < 12 || alder > 67){
	      System.out.println("Billettprisen for din alder er 25kr");
	  }else{
	      System.out.println("Billettprisen for din alder er 50kr");
	  }

      }     
}