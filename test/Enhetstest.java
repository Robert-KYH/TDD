
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//  Minst 10 tecken
//  Endast bokstäverna A-Z, siffrorna 0-9, samt - + _ är tillåtna
//  Minst en versal, en gemen, och en siffra


class Enhetstest {

  @Test void storLängd()   {  assertTrue(Main.verifieraLösen("1234567890abcdeFghijklmno"));  }
  @Test void exaktLängd()  {  assertTrue(Main.verifieraLösen("12345678aA"));  }
  @Test void kortLängd()   {  assertFalse(Main.verifieraLösen("12uU"));  }
  @Test void ingetLösen()  {  assertFalse(Main.verifieraLösen(""));  }

  @Test void allaGiltigaTecken()   {  assertTrue(Main.verifieraLösen("1234567890-abcdefghijklmnopqrstuvwxyz_ABCDEFGHIJKLMNOPQRSTUVWXYZ+"));  }
  @Test void ettOgiltigtTecken()   {  assertFalse(Main.verifieraLösen("12345(67890aA+-_"));  }
  @Test void baraOgiltigaTecken()  {  assertFalse(Main.verifieraLösen("åäö()  *.,;  ÅÄÖ===[]"));  }

}
