package Nexus;

public class Volo extends Thread{
    private static final int MAX_INTERATION = 2;
    private Aereoporto aereoporto;
    private TipoVolo type;

    public Volo(String name, Aereoporto aereoporto, TipoVolo type){
        setName(name);
        this.aereoporto = aereoporto;
        this.type = type;
    }

    @Override
    public void run() {
        for (int i = 0; i < MAX_INTERATION; i++) {
            try {
                int random = (int) (2000 * Math.random() + 1000);
                System.out.println(getName() + " si prepara...");
                sleep(random);

                if (type == TipoVolo.nazionale) {
                    System.out.println(getName() + " chiede un gate nazionale...");
                    aereoporto.getGateNaz(this);
                }
                if (type == TipoVolo.internazionale) {
                    System.out.println(getName() + " chiede un gate internazionale...");
                    aereoporto.getGateInter(this);
                }

                System.out.println(getName() + " sta imbarcando...");
                random = (int) (2000 * Math.random() + 2000);

                if (type == TipoVolo.nazionale) {
                    System.out.println(getName() + " pronto al lancio...");
                    aereoporto.rilasciaGateNazionale(this);
                    System.out.println(getName() + " rilascio gate nazionale...");
                }
                if (type == TipoVolo.internazionale) {
                    System.out.println(getName() + " pronto al lancio...");
                    aereoporto.rilasciaGateInternazionale(this);
                    System.out.println(getName() + " rilascio gate internazionale...");
                }
            }catch (InterruptedException e){ System.out.println(e.getMessage()); }
        }

    }
}
