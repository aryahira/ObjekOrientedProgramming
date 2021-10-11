public class Person {
    private String name;
    private String birthdate;
    private String department;
    private String major;
    private int age;
    private int height;
    private double weight;
    private double distance;
    private double time;

    // Pemanggilan getName
    public String getName() {
        return name;
    }
    // end Pemanggilan getName

    // Pemanggilan setName
    public void setName(String newName) {
        this.name = newName;
    }
    // end of Pemanggilan setName

    // Method name
    public static String name(String fname) {
        return "Nama Saya : " + fname;
    }
    // end of Method name 

    // Pemanggilan getBirthDate
    public String getBirthdate() {
        return birthdate;
    }
    // end of pemanggilan getBirthDate

    // Pemanggilan setBirthDate
    public void setBirthdate(String newBirthdate) {
        this.birthdate = newBirthdate;
    }
    // end of setBirthDate

    // Method birthdate
    public static String birthdate(String date) {
        return "Tanggal Lahir : " + date;
    }

    // Pemanggilan getDepartment
    public String getDepartment() {
        return department;
    }
    // end of pemanggilan getDepartment

    // Pemanggilan setDepartment
    public void setDepartment(String newDepartment) {
        this.department = newDepartment;
    }
    // end of pemanggilan setDepartment

    // Method department
    static String department(String depart) {
        return "Nama Fakultas : " + depart;
    }

    // Pemanggilan getMajor
    public String getMajor() {
        return major;
    }
    // end of pemanggilan getMajor

    // Pemanggilan setMajor
    public void setMajor(String newMajor) {
        this.major = newMajor;
    }
    // end of pemanggilan setMajor

    // Method major
    static String major(String Major) {
        return "Jurusan : " + Major;
    }

    // Pemanggilan getAge
    public int getAge() {
        return age;
    }
    // end of pemanggilan getAge

    // Pemanggilan setAge
    public void setAge(int newAge) {
        this.age = newAge;
    }
    // end of pemanggilan setAge

    // Method age
    static int age(int Age) {
        return Age;//"Umur : " + Age + " tahun";
    }

    // Pemanggilan getHeight
    public int getHeight() {
        return height;
    }
    // end of pemanggilan getHeight

    // Pemanggilan setHeight
    public void setHeight(int newHeight) {
        this.height = newHeight;
    }
    // end of pemanggilan setHeight

    // Method height
    static int height(int Height) {
        return Height;//"Tinggi Badan : " + Height + " cm";
    }

    // Pemanggilan getWeight
    public double getWeight() {
        return weight;
    }
    // end of pemanggilan getWeight

    // Pemanggilan setWeight
    public void setWeight(double newWeight) {
        this.weight = newWeight;
    }
    // end of pemanggilan setWeight

    // Method Weight
    static double weight(double Weight) {
        return Weight;
    }

    // Pemanggilan getDistance
    public double getDistance() {
        return distance;
    }
    // end of pemanggilan getDistance

    // Pemanggilan setDistance
    public void setDistance(double newDistance) {
        this.distance = newDistance;
    }
    //end of pemanggilan setDistance

    // Method distance
    static double distance(double v, double t) {
        double s = v*t;
        return s;
    }

    // Pemanggilan getTime
    public double getTime() {
        return time;
    }
    // end of pemanggilan getTime

    // Pemanggilan setTime
    public void setTime(double newTime) {
        this.time = newTime;
    }
    // end of pemanggilan setTime

    // Method time
    static double time(double s, double v) {
        double t = s/v;
        return t;
    }

    public static void main(String[] args) {
        // Objek name
        Person myName = new Person();
        myName.setName(name("Arya Hirawansyah"));
        //Output name
        System.out.println(myName.getName());

        // Objek birthdate
        Person myBirthdate = new Person();
        myBirthdate.setBirthdate(birthdate("09 November 2001"));
        //output birthdate
        System.out.println(myBirthdate.getBirthdate());

        // Objek department
        Person myDepartment = new Person();
        myDepartment.setDepartment(department("Fakultas Teknologi dan Pariwisata"));
        // output department
        System.out.println(myDepartment.getDepartment());

        // Objek major
        Person myMajor = new Person();
        myMajor.setMajor(major("Teknologi Informasi"));
        // output major
        System.out.println(myMajor.getMajor());

        // Objek age
        Person myAge = new Person();
        myAge.setAge(age(19));
        // output age
        System.out.println("Umur : " + myAge.getAge() + " tahun");

        // Objek height
        Person myHeight = new Person();
        myHeight.setHeight(height(173));
        //output height
        System.out.println("Tinggi Badan : " + myHeight.getHeight() + " cm");

        // Objek weight
        Person myWeight = new Person();
        myWeight.setWeight(weight(50));
        // output weight
        System.out.println("Berat Badan : " + myWeight.getWeight() + " kg");

        // Objek distance
        Person myDistance = new Person();
        myDistance.setDistance(distance(0.1, 79));
        // output ditance
        System.out.println("Jarak Tempuh : " + myDistance.getDistance() + " km");

        // Objek time
        Person myTime = new Person();
        myTime.setTime(time(1200, 80));
        // output time
        System.out.println("Waktu Tempuh : " + myTime.getTime() + " menit");
   }
}