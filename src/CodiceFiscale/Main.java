package CodiceFiscale;

public class Main {
    public static void main(String[] args) /* throws CodiceFiscale.CodFiscaleFake --> si potrebbe mettere ma non la stai gestendo -- male. */ {
        try {
            CodFiscale cf = new CodFiscale("ddd4dddddddddddD");
            System.out.println(cf + ": VALIDO");
        }catch (CodFiscaleFake e){ //In questo modo potrai gestirla meglio -- bene.
            System.out.println(e.getMessage());
        }
    }
}