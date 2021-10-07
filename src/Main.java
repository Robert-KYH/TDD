
import java.util.Scanner;
import java.util.regex.*;


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


  static boolean verifieraLösen(String lösen) {

    //  minst 10 tecken
    if (lösen.length() < 10)  return false;

    //  bara giltiga tecken
    Pattern p = Pattern.compile("[^\\w+-]");
    Matcher m = p.matcher(lösen);
    if (m.find())  return false;

    //  minst en versal, en gemen, och en siffra
    p = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])");
    m = p.matcher(lösen);
    if (!m.find())  return false;

    return true;
  }


  static void print(String s)  {  System.out.println(s);  }
}
