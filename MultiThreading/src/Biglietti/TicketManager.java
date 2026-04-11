package Biglietti;

public class TicketManager {
    private final int numtot;
    private int ticketPresi;

    public TicketManager(int numtot){
        this.numtot = numtot;
        ticketPresi = 0;
    }
    public synchronized void sellTicket(Buyer buyer) throws InterruptedException {
        if (ticketPresi >= numtot) {
            System.out.println(buyer.getName() + " si è interrotto");
            buyer.interrupt();
        }
        else {
            ticketPresi++;
            System.out.println(Thread.currentThread().getName() + " ha acquistato il biglietto - Biglietti rimanenti: " + (numtot - ticketPresi));
        }
    }
}
