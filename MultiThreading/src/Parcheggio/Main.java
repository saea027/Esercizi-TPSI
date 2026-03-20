package Parcheggio;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args) throws InterruptedException{
        //TODO: (
        // 1. Tempo massimo di simulazione. Il parcheggio chiude dopo N secondi.
        // 2. Non tutti i veicolo sono uguali - alcunoi occupano più posti
        // )

        Parking parking = new Parking(5);
        List<Auto> autos = new ArrayList<>();

        final int maxAuto = 10;

        for (int i = 0; i < maxAuto ; i++) {
            autos.add(new Auto("Auto-" + (i+1), parking));
        }

        for (Auto a : autos) a.start();
        for (Auto a : autos) a.join();

        System.out.println("Programma finito");
    }
}
