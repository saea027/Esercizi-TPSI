package CodiceFiscale;

//per averla controllata --> extends Exception
//Per non averla controllata --> extends RuntimeException
public class CodFiscaleFake extends Exception {
  public CodFiscaleFake(String mes){
    super(mes);
  }
}