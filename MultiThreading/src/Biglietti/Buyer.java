package Biglietti;

public class Buyer extends Thread {
    private TicketManager ticketManager;
    private int nThread = 20;

    public void run(){
        try {
            for (int i = 0; i < nThread; i++) {
                ticketManager.sellTicket();
            }
        }catch (InterruptedException e){
            System.out.println("BIGLIETTI ESAURITI!");
        }
    }
}
//fori per Xvolte
//chiamosell()