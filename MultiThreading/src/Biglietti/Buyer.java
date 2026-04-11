package Biglietti;

public class Buyer extends Thread {
    private TicketManager ticketManager;

    public  Buyer(String nome, TicketManager ticketManager){
        setName(nome);
        this.ticketManager = ticketManager;
    }
    public void run(){
        try {
            ticketManager.sellTicket(this);
        }catch (InterruptedException e){
            System.out.println("BIGLIETTI ESAURITI!");
        }
    }
}
//fori per Xvolte
//chiamosell()