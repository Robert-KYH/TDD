
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//  Minst 10 tecken
//  Endast bokstäverna A-Z, siffrorna 0-9, samt - + _ är tillåtna
//  Minst en versal, en gemen, och en siffra


class Enhetstest {

  @Test void storLängd()   {  assertTrue(Main.verifieraLösen("1234567890abcdefghijklmno"));  }
  @Test void exaktLängd()  {  assertTrue(Main.verifieraLösen("1234567890"));  }
  @Test void kortLängd()   {  assertFalse(Main.verifieraLösen("1234"));  }
  @Test void ingetLösen()  {  assertFalse(Main.verifieraLösen(""));  }

}
