import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{

    private String[] MySepedah = {"Mtb","Bmx"};
    public List <Sepedah> jenisSepedah1 = new ArrayList<Sepedah>();
    public List <Sepedah> jenisSepedah2 = new ArrayList<Sepedah>();

    public static void main(String[] args) {

        System.out.println("===================================================");
        System.out.println("\t\tJenis - jenis Sepedah");
        System.out.println("===================================================");

        Scanner myObj = new Scanner(System.in);
        Main m = new Main();

        System.out.println("\nPilihlah angka untuk melanjutkan");
        System.out.println("1. Menambahkan jenis sepedah baru");
        System.out.println("2. Melihat jenis sepedah");
        System.out.print("\nPilih angka : ");

        String input = myObj.nextLine();
        int code = Integer.parseInt(input);
        System.out.println("===================================================");

        switch (code) {
            case 1:
                m.InputListSepedah();
                break;
            case 2:
                m.ShowListSepedah();
                break;

            default:
                System.out.println("Pilihan tidak terdaftar");
                break;
        }

    }

    public void InputListSepedah(){

        System.out.println("\n---------------------------------------------------");
        System.out.println("\t\tMenambahkan sepedah");
        System.out.println("---------------------------------------------------\n");
        System.out.println("Pilih jenis sepedah : ");

        int i=1;
        for (String sepedah : MySepedah){
            System.out.println(i + "." + sepedah);
            i++;
        }

        System.out.print("Masukkan pilihan : ");
        Scanner myObj = new Scanner(System.in);

        String inputProduct = myObj.nextLine();
        int product = Integer.parseInt(inputProduct);

        switch (product) {
            case 1:
                try {
                    jenisSepedah1 =  InputSepedahMtb();
                } catch (Exception e) {
                    System.out.println("Masukkan data yang valid");
                    System.out.println("Error: "+e.getMessage());
                }
                break;

            case 2:
                try {
                    jenisSepedah2 =  InputSepedahBmx();
                } catch (Exception e) {
                    System.out.println("Masukkan data yang valid");
                    System.out.println("Error: "+e.getMessage());
                }
                break;

            default:
                break;

        }

        myObj.close();

    }

    public List InputSepedahMtb() {

        Scanner myObj = new Scanner(System.in);
        System.out.println("\n============= Jenis sepedah baru =============");
        
        int jmlData = 2;
        for (int i = 0; i < jmlData; i++) {
            Sepedah s = new Sepedah();
            System.out.println("- Jenis ke-" + (i+1) + ":");

            System.out.print("Merk = ");
            String merk = myObj.nextLine();
            s.setMerk(merk);

            System.out.print("Jenis Stang = ");
            String stang = myObj.nextLine();
            s.setStang(stang);

            System.out.print("Bentuk Jok = ");
            String jok = myObj.nextLine();
            s.setJok(jok);

            System.out.print("Bentuk Gear = ");
            String gear = myObj.nextLine();
            s.setGear(gear);

            System.out.print("Jenis Ban = ");
            String ban = myObj.nextLine();
            s.setBan(ban);

            System.out.println("----------------------------------------------");
            this.jenisSepedah1.add(s);
        }

        System.out.println("\n");
        myObj.close();
        return this.jenisSepedah1;

    }

    public List InputSepedahBmx(){

        Scanner myObj = new Scanner(System.in);
        System.out.println("\n============= Jenis sepedah baru =============");
        
        int jmlData2 = 2;
        for (int i = 0; i < jmlData2; i++) {
            Sepedah s2 = new Sepedah();
            System.out.println("- Jenis ke-" + (i+1) + ":");

            System.out.print("Merk = ");
            String merk = myObj.nextLine();
            s2.setMerk(merk);

            System.out.print("Jenis Stang = ");
            String stang = myObj.nextLine();
            s2.setStang(stang);

            System.out.print("Bentuk Jok = ");
            String jok = myObj.nextLine();
            s2.setJok(jok);

            System.out.print("Bentuk Gear = ");
            String gear = myObj.nextLine();
            s2.setGear(gear);

            System.out.print("Jenis Ban = ");
            String ban = myObj.nextLine();
            s2.setBan(ban);

            System.out.println("----------------------------------------------");
            this.jenisSepedah2.add(s2);
       

        }
        System.out.println("\n");
        myObj.close();
        return this.jenisSepedah2;

    }

    public void ShowListSepedah(){

        for (String x : MySepedah) {
            System.out.println("Sepedah yang sudah ada yaitu : "+ x);
        }

    }
}