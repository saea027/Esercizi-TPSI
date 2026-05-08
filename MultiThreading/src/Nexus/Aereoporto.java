package Nexus;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Aereoporto {

    private int gateNazionaliTotali;
    private int gateInternazionaliTotali;

    //look - lucchetto
    private final ReentrantLock look;
    private final Condition waitNaz;
    private int gateNazionaliLiberi;
    private int gateInternazionaliLiberi;

    public Aereoporto(int gateInternazionaliTotali, int gateNazionaliTotali){
        this.gateInternazionaliTotali=gateInternazionaliTotali;
        this.gateNazionaliTotali=gateNazionaliTotali;
        gateNazionaliLiberi = gateNazionaliTotali;
        gateInternazionaliLiberi = gateInternazionaliTotali;
        this.look = new ReentrantLock();
        this.waitNaz = look.newCondition();
    }

    /// Chiudere un metodo : CTRL -
    /// Fare un ciclo in un blocco : section CTRL Alt T
    /// Mettere attributi nel costruttore : Alt Invio
    /// Suggerimenti : Alt Invio

    //Metodi
    public void getGateNaz(Volo v) throws InterruptedException {
        look.lock();
        try {
            while (gateNazionaliLiberi==0) waitNaz.await();
            gateNazionaliLiberi--;
        } finally {
            look.unlock();
        }
    }

    public void rilasciaGateNazionale(Volo v ) throws InterruptedException{
        look.lock();
        gateNazionaliLiberi++;
        //signal - notify
        waitNaz.signal();

        look.unlock();
    }

    public void rilasciaGateInternazionale(Volo volo) throws InterruptedException{
        look.lock();
        gateInternazionaliLiberi++;
        //signal - notify
        waitNaz.signal();

        look.unlock();
    }

    public void getGateInter(Volo volo) throws InterruptedException {
        look.lock();
        try {
            while (gateInternazionaliLiberi==0) waitNaz.await();
            gateInternazionaliLiberi--;
        } finally {
            look.unlock();
        }
    }
}
