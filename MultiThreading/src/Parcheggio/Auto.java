package Parcheggio;

public class Auto extends Thread{
    private Parking parking;

    public Auto(String nome, Parking parking){
        setName(nome);
        this.parking=parking;
    }

    @Override
    public void run() {
        try {
            //1) per un tot guida
            int driveTime = (int) (5000 * Math.random() + 3000);
            System.out.println(getName() + " sta guidando per " + (driveTime / 1000) + " secondi");
            sleep(driveTime);

            //2) cerca di entrare nel parcheggio
            parking.enter(this);
            int parkTIme = (int) (5000 * Math.random() + 3000);
            sleep(parkTIme);
            System.out.println(getName() + " parcheggiata per " + parkTIme/1000 + "s.");

            parking.exit(this);
        } catch (InterruptedException e) {
            interrupt();
        }
    }
}
