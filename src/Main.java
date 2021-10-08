
import java.util.Scanner;


class Main {

  public static void main(String[] args) {
    print("* Minst 10 tecken");
    print("* Endast bokstäverna A-Z, siffrorna 0-9, samt - + _ är tillåtna");
    print("* Minst en versal, en gemen, och en siffra\n");

    String lösen;
    do {
      System.out.print("Välj ett lösenord: ");
      lösen = new Scanner(System.in).nextLine();
    } while (!verifieraLösen(lösen));

    print("OK");
  }


  static boolean verifieraLösen(String lösen) {

    //  [\w+-]{10,}  texten består av 10 eller fler tecken innehållande endast A-Z a-z 0-9 _ + -
    //  (?=.*[A-Z])  (minst) en bokstav A-Z någonstans i texten

    return lösen.matches("(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[\\w+-]{10,}");
  }


  static void print(String s)  {  System.out.println(s);  }
}
