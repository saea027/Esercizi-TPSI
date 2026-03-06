package prodCons;

public class Consumer extends Thread {
    private final Buffer buffer;

    public Consumer(Buffer buffer){
        this.buffer=buffer;
    }

    public void run(){
        for (int i = 0; i < 10; i++){
            try {
                System.out.print(" C:" + buffer.getValue());
            }catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
