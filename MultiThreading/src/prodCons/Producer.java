package prodCons;

import java.util.Base64;

public class Producer extends Thread{
    private final Buffer buffer;

    public Producer(Buffer buffer){
        this.buffer=buffer;
    }

    public void run(){
        //Aggiungi +1 alla tua variabile Buffer.value
        for (int i = 1; i <= 10; i++){
            try {
                System.out.print(" P:" + i);
                buffer.setValue(i);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
