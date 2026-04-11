package BarrieraSyncro;

public class BarrieraSyncro extends Thread{
    private BarrierThread barrierThread;

    public BarrieraSyncro(String name, BarrierThread barrierThread){
        this.barrierThread = barrierThread;
        setName(name);
    }

    @Override
    public void run() {
        try {
            int random = (int) (3000 * Math.random() + 2000);
            System.out.println(getName() + " lavora per " + random + " secondi.");
            sleep(random);
            barrierThread.barr(this);
            System.out.println(getName() + " riprende a lavorare ...");
        }catch (InterruptedException e){
            System.out.println(getName() + " è stato interrotto.");
            return;
        }
    }
}
