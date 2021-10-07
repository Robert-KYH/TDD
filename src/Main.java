
import java.util.Scanner;


class Main {

  public static void main(String[] args) {
    print("* Minst 10 tecken");
    print("* Endast bokstäverna A-Z, siffrorna 0-9, samt - + _ är tillåtna");
    print("* Minst en versal, en gemen, och en siffra\n");

    String lösen;
    while (true) {
      System.out.print("Välj ett lösenord: ");
      lösen = new Scanner(System.in).nextLine();
      if (verifieraLösen(lösen))  break;
      else                        print("!!! Lösenordet är ej giltigt");
    }

    print(lösen+" - OK");
  }


  static boolean verifieraLösen(String s) {
    return true;
  }


  static void print(String s)  {  System.out.println(s);  }

}
