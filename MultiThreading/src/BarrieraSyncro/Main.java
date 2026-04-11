package BarrieraSyncro;

import java.util.ArrayList;

//{
// Class BarrierThread:
//      numThreadAttesa valMaxThread
//      if numThreadAttesa < valMaxThread >> wait()
//      else notifyAll()
// Class BarrieraSyncro:
//      tempRandom(2s - 5s) to wark (sleep)
// }
public class Main {
    public static void main(String[]args){
        BarrierThread barrierThread = new BarrierThread(5);
        ArrayList<BarrieraSyncro> threads = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            threads.add(new BarrieraSyncro("Auto-" + (i+1), barrierThread));
        }

        for (BarrieraSyncro b : threads){
            b.start();
        }
    }
}
