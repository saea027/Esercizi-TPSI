package BarrieraSyncro;

public class BarrierThread {
    private int numThreadAttesa, valMaxThread;

    public BarrierThread(int valMaxThread){
        this.valMaxThread = valMaxThread;
        this.numThreadAttesa = 0;
    }

    public synchronized void barr(BarrieraSyncro barriera) throws InterruptedException{
        numThreadAttesa++;
        if (numThreadAttesa <= valMaxThread ) {
            System.out.println(barriera.getName() + " ha raggiunto la barriera.");
            wait();
        }else {
            System.out.println("Soglia barriera raggiunta - I thread ripartono - Reset barriera.");
            notifyAll();
            numThreadAttesa=0;
        }
    }
}
