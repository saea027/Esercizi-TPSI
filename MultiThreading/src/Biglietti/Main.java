package Biglietti;

//{
// class TicketManager:
//      numtot selTicket()--> true = aquistabile, false = esauriti
// class Buyer:
//      run()
//  10ticket - 20compratori
// }

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        ArrayList<Buyer> pers = new ArrayList<>();
        TicketManager ticketManager = new TicketManager(10);
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            System.out.print("Nome comprante: ");
            String nome = in.nextLine();
            pers.add(new Buyer(nome, ticketManager));
        }

        for(Buyer buyer : pers) buyer.start();
    }
}
