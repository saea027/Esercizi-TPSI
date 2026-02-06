package Cinema;

import java.util.ArrayList;
import java.util.Scanner;

public class Sala {
    //true = occupato -- false = libero
    private ArrayList<Boolean> busy;
    private int postiTot;

    public Sala(int postiTot){
        this.postiTot=postiTot;
        busy = new ArrayList<>(postiTot);
    }

    public void prenotaPosto(int posto) throws PostoNonEsistenteException, PostoGiaOccupatoException{
        Scanner in = new Scanner(System.in);
        if (posto > postiTot)
            throw new PostoNonEsistenteException("ERRORE: Il posto inserito non è presente in sala");
        else if (busy.get(posto) == true)
            throw new PostoGiaOccupatoException("ERRORE: Il posto inserito è già stato occupato");
        else {
            busy.add(posto, true);
            System.out.println("Inserire numero di telefono: ");
            String telefono = in.nextLine();
            Prenotazione prenotazione = new Prenotazione(posto, telefono);
        }
    }
}