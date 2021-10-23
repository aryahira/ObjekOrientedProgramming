import java.util.ArrayList;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Iterator;

public class Main{

    public static void main (String[] args){
        Main m = new Main();
            System.out.println("Masukkan Text:");
            Scanner myObj = new Scanner(System.in);
            String output = myObj.nextLine();
            System.out.println("output:"+output);
            LinkedList<Sepedah> listMain = new LinkedList<Sepedah>();
            for (int i = 0;i <3;i++){
                System.out.println("data ke-"+(i+1));
                Sepedah s = new Sepedah();
                System.out.print("Sepedah :");
                String nama = myObj.nextLine();
                s.setNama(nama);
                listMain.add(s);
            }
            for (Sepedah s : listMain) {
                System.out.println("Sepedah : " + s.getNama());
            }
    }
}