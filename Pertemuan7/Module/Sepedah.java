class Sepedah { //main class
    public String nama; 

    public void setNama(String newNama) {
        this.nama = newNama;
    }

    public String getNama() {
        return nama;
    }

    String merk() { 
        return "Sepedah merek Polygon";
    }

}
class Stang extends Sepedah {
    public int stang;
    
    public int getStang() {
        return stang;
    }

    public void setStang(int newStang) {
        this.stang = newStang;
    }
}

class Jok extends Sepedah {
    public String jok;
    
    public String getJok() {
        return jok;
    }
    public void setJok(String newJok) {
        this.jok = newJok;
    }     
}

class Gear extends Sepedah {
    public int gear;

    public int getGear() {
        return gear;
    }
    public void setGear(int newGear) {
        this.gear = newGear;
    }
}

class Ban extends Sepedah {
    public int ban;

    public int getBan() {
        return ban;       
    }
    public void setBan(int newBan) {
        this.ban = newBan;
    }
}

class Hasil{
    public static void main(String[] args) {
        Sepedah mySepedah = new Sepedah();
        System.out.println(mySepedah.merk());

        Stang myStang = new Stang();
        myStang.setStang(13);
        System.out.println("Panjang stang: " + myStang.getStang()+ " cm");

        Jok myJok = new Jok();
        myJok.setJok("Jok ini sangat empuk");
        System.out.println(myJok.getJok());

        Gear myGear = new Gear();
        myGear.setGear(52);
        System.out.println("Ukuran Gear " + myGear.getGear()+ " cm");

        Ban myBan = new Ban();
        myBan.setBan(32);
        System.out.println("Ukuran ban " + myBan.getBan()+ " mm");
    }
}