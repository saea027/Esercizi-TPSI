package pirata;

public class Pirata extends Thread {
    private Stiva stiva;

    public Pirata(Stiva stiva, String name){
        this.stiva = stiva;
        setName(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                stiva.addLoot(new LootItem("LootItem" + (i+1), 120));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
