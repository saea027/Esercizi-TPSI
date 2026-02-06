package Olimpiadi;

import java.util.Random;

public class Main {
    public static void main (String[] arg){
        Atleta a = new Atleta("Sara");
        Atleta b = new Atleta("Andrea");

        //Per far andare il run()
        a.start();
        b.start();

        //interrompi i thread in modo randomico con true/false
        boolean d = new Random().nextBoolean();
        if (d) a.interrupt();
        else b.interrupt();

        try {
            a.join();
            b.join();
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        System.out.println("\nTempo\n" + a.getName() + " - " + a.getRaceTime());
        System.out.println(b.getName() + " - " + b.getRaceTime());
    }
}
