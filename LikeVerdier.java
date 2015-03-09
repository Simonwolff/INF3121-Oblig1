import java.util.Scanner;

class likeVerdier{
      public static void main(String[] args){
	  int c, d;
	  c = 4;
	  d = 6;
	  Scanner inn;
	  inn = new Scanner(System.in);
	  System.out.println("Skriv inn et tall");
	  c = inn.nextInt();
	  System.out.println("Skriv inn enda et tall");
	  d = inn.nextInt();
	  
	  if(c == d){
	      System.out.println("c og d er like");
	  }else{
	      System.out.println("c og d er ikke like");
	  }
      }     
}