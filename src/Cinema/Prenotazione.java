package Cinema;

public class Prenotazione {
    private int posto;
    private String telefono;

    public Prenotazione(int posto, String telefono) throws TelefonoNonValidoException{
        this.posto=posto;
        this.telefono=telefono;

        if (telefono.length()!=10)
            throw new TelefonoNonValidoException("ERRORE: Il numero di telefono non contiene 10 cifre");
    }
}
