package pirata;

import java.util.ArrayList;

public class Main {
    public static void main(String[] arg){
        final int maxPirares = 20;
        Stiva stiva = new Stiva(5);

        ArrayList<Pirata> piratas = new ArrayList<>();

        for (int i = 0; i < maxPirares; i++) {
            piratas.add(new Pirata(stiva, "Pirata-" + (i+1)));
        }

        for(Pirata p : piratas) p.start();
    }
}
