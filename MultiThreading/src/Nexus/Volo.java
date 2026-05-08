package Nexus;

public class Volo extends Thread{
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
                sleep(20);
                if (type == TipoVolo.nazionale){
                    aereoporto.getGateNaz(this);
                }
            }catch (InterruptedException e){ System.out.println(e.getMessage()); }
        }

    }
}
