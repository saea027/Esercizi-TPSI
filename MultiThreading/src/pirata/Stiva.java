package pirata;

import java.util.ArrayList;

public class Stiva {
    private ArrayList <LootItem> stiva;
    private final int maxSize;

    public Stiva(int maxSize){
        this.stiva = new ArrayList<>();
        this.maxSize = maxSize;
    }

    public synchronized void addLoot(LootItem lootItem) throws InterruptedException{
        while (stiva.size() == maxSize) {
            System.out.println(Thread.currentThread().getName() + " in attesa.");
            wait();
        }
        stiva.add(lootItem);
        System.out.println(Thread.currentThread().getName() + " ha aggiunto " + lootItem);
        notifyAll();
    }

    public synchronized LootItem getLoot() throws InterruptedException{
        while (stiva.isEmpty()) wait();

        LootItem toGoBack = stiva.remove(0);
        notifyAll();
        return toGoBack;
    }
}
