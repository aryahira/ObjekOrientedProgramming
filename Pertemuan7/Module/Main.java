import java.util.Scanner;
import java.util.LinkedList;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {

        // Object Class Main
        Main m = new Main();

        System.out.println("\n======================================================================");
        System.out.print("Masukkan Text : ");
 
        // Object Import Scanner
        Scanner myScr = new Scanner(System.in);
        String output = myScr.nextLine();
 
        System.out.println("Outputnya adalah : " + output);
 
        System.out.println("\n======================================================================");
 
        // Pemanggilan Object Kelinci dengan Linked List
        LinkedList<Sepedah> sepedahLokal = new LinkedList<Sepedah>();
 
        for (int i = 0; i < 1; i++) {
 
            // Pemanggilan Object Kelinci di looping for
            Sepedah mySepedah = new Sepedah();
 
            System.out.print("Tipe sepedah : ");
            String merk = myScr.nextLine();
            mySepedah.setMerk(merk);
 
            System.out.print("Tipe stang : ");
            String stang = myScr.nextLine();
            mySepedah.setStang(stang);
 
            System.out.print("Tipe jok : ");
            String jok = myScr.nextLine();
            mySepedah.setJok(jok);
 
            System.out.print("Tipe gear : ");
            String gear = myScr.nextLine();
            mySepedah.setGear(gear);

            System.out.print("Tipe ban : ");
            String ban = myScr.nextLine();
            mySepedah.setBan(ban);
            
            sepedahLokal.add(mySepedah);
        }
 
        for (Sepedah mySepedah : sepedahLokal) {
            System.out.println("\n- Merk dan tipe sepeda yang dipilih : " + mySepedah.getMerk());
            System.out.println("- Tipe stang yang dipilih : " + mySepedah.getStang());
            System.out.println("- Tipe jok yang dipilih : " + mySepedah.getJok());
            System.out.println("- Model gear yang dipilih : " + mySepedah.getGear());
            System.out.println("- Jenis ban yang dipilih : " + mySepedah.getBan());
        }         
    }    
}