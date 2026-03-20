package Parcheggio;

public class Parking {
    private int slots;
    private final int maxSlot;

    public Parking(int initialSlots, int maxSlot){
        this.slots=initialSlots;
        this.maxSlot=maxSlot;
    }

    public synchronized void enter(Auto auto) throws InterruptedException{
        while (slots<=0){
            System.out.println(auto.getName() + " in attesa - parcheggio pieno");
            wait();
        }
        slots--;
        System.out.println(auto.getName() + " entrata. Posti disponibili: " + slots);
    }

    public synchronized  void exit(Auto auto){
        slots++;
        System.out.println(auto.getName() + " uscita. Posti disponibili: " + slots);
        notifyAll();
    }
}
