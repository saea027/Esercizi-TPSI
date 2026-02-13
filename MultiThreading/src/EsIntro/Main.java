package EsIntro;
/*
    Obbiettivo: N thread che per 10k volte sommino 1 al contatore
    class Main
    Class Counter
    Class AdderThread
 */

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AdderThread adderThread1 = new AdderThread();
        AdderThread adderThread2 = new AdderThread();

        adderThread1.start();
        adderThread2.start();

        adderThread1.join();
        adderThread2.join();

        System.out.println(AdderThread.counter.getCount());
    }
}
