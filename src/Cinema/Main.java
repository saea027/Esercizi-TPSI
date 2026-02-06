package Cinema;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try {
            Sala sala = new Sala(10);
            Scanner in = new Scanner(System.in);

            System.out.println("Posto che vuoi prenotare: ");
            int posto = in.nextInt();
            sala.prenotaPosto(posto);
        }catch (PostoGiaOccupatoException | PostoNonEsistenteException | TelefonoNonValidoException e) {
            System.out.println(e.getMessage());
        }
    }
}