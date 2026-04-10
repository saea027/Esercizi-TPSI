package Biglietti;

public class TicketManager {
    private final int numtot = 10;
    private int ticketPresi = 0;
    private int slot=0;

    public synchronized void sellTicket() throws InterruptedException {
        if (ticketPresi >= numtot) Thread.currentThread().interrupt();
        else {
            System.out.println("");
        }
    }
}
