package prodCons;

public class Buffer {
    private int value;
    private final int maxSize = 1;
    //Quanti thread ho in questo momento
    private int numInside = 0;

    //Chiamato da Producer
    public synchronized void setValue(int value) throws InterruptedException{
        //Se il buffer è già occupato il trhead aspetta (perchè il valore prima lo deve consumare)
        if (numInside == maxSize) wait();

        numInside++;
        notify();
        this.value = value;
    }

    //Chiamato da Costumer
    public synchronized int getValue() throws InterruptedException{

        if (numInside == 0) wait();
        numInside--;
        //Sveglia gli altri thread "dormienti"
        notify();
        return value;
    }
}
