package CodiceFiscale;

public class CodFiscale {
    private final int maxChar = 16;
    private String cf;
    //Per avere un segnale -- per dire che ci potrebbe essere un errore -- sopratutto in una cosa controllata --> throws
    public CodFiscale(String cf) throws CodFiscaleFake{
        this.cf = cf;
        //Se la lunghezza del codice fiscale non è lunga 16 caratteri
        if (cf.length() != maxChar){
            //Per lanciare un messaggio --> throw
            throw new CodFiscaleFake("CODICE FISCALE NON VALIDO: Lunghezza non rispettata");
        }

        for (int i = 0; i < maxChar; i++){
            //Se non è una lettera o un numero
            if (!isLetter(cf.charAt(i)) && !Character.isDigit(cf.charAt(i))){
                throw new CodFiscaleFake("CODICE FISCALE NON VALIDO: Non alfanumerico");
            }
        }

        if (!Character.isUpperCase(cf.charAt(maxChar-1)))
            throw new CodFiscaleFake("CODICE FISCALE NON VALIDO: L'ultima lettera non è maiuscola");
    }

    @Override
    public String toString() {
        return cf;
    }

    public boolean isLetter (char let){
        //Numeri della tabella ascii
        return (let >= 65 && let <= 90) || (let >= 97 && let <= 122);
    }
}