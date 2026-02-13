package EsIntro;

import java.util.concurrent.Semaphore;

public class AdderThread extends Thread{
    static Counter counter = new Counter();
    //per creare dei "semafori" per i thread
    static final Semaphore sem = new Semaphore(1);

    public void run(){
        //Somma 1 al contatore
        for (int i = 0; i < 10000; i++){
            try { //per il semafero che potrebbe interrompere il thread
                sem.acquire();
                counter.add(1);
                sem.release();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}