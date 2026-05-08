package Nexus;

//{
//  3 gate nazionali - 2 gate internazionali
//  8 voli
//      1) temp.random(1-3)
//      2) enter.gate.tipo
//      3) imbargo.random(2-4)
//      4) exit.gate.tipo
//  class.Aereoporto - gate naz/internaz
//  class.Volo - Thread
// }

public class Main {
    public static void main(String[]args) throws InterruptedException {
        int gateNaz=3, gateInternaz=2;
        Aereoporto aereoporto = new Aereoporto(gateInternaz,gateNaz);

        Volo[] volos = {
                new Volo("nex-01", aereoporto, TipoVolo.internazionale),
                new Volo("nex-02", aereoporto, TipoVolo.nazionale),
                new Volo("nex-03", aereoporto, TipoVolo.nazionale),
                new Volo("nex-04", aereoporto, TipoVolo.internazionale),
                new Volo("nex-05", aereoporto, TipoVolo.nazionale),
                new Volo("nex-06", aereoporto, TipoVolo.internazionale),
                new Volo("nex-07", aereoporto, TipoVolo.nazionale),
                new Volo("nex-08", aereoporto, TipoVolo.nazionale)
        };

        for (Volo v : volos) v.start();
        for (Volo v : volos) v.join();

        System.out.println("END");
    }
}
