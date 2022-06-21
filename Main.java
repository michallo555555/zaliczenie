import java.util.Scanner;

class Main {
  public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Podaj liczbe:");
int liczba = scanner.nextInt();
int silnia=1;
int i;

  for (i=1;i<=liczba;i++)
  {

    silnia=silnia*i;
  }

    System.out.println("Silnia liczby "+liczba+" to: "+silnia);



  }
}