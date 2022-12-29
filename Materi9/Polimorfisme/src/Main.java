public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Employee karyawan1 = new Employee();


        //Set data Student1
        student1.setName("I Kadek Arya Surya Saputra");
        student1.setAddress("Jalan kenangan yang pernah ada");
        student1.setNPM(Integer.parseInt("2345435"));
        //Output Student
        System.out.println("> Data Mahasiswa1");
        System.out.println("Nama : " + student1.getName()); //getName dari class Student dipanggil
        System.out.println("Alamat : " + student1.getAddress());
        System.out.println(student1.getNPM());

        //========================
        System.out.println("");

        //Set data Student2
        student2.setName("Vionny Monica");
        student2.setAddress("Jalan kita masih panjang");
        student2.setNPM(Integer.parseInt("134235345"));
        //Output Student
        System.out.println("> Data Mahasiswa2");
        System.out.println("Nama : " + student2.getName()); //getName dari class Student dipanggil
        System.out.println("Alamat : " + student2.getAddress());
        System.out.println(student2.getNPM());

        //========================
        System.out.println("");

        //set data karyawan1
        karyawan1.setName("Arya Surya");
        karyawan1.setAddress("Jln cinta virtual");
        karyawan1.setStatus("CEO of Sadlove Story");
        //Output karyawan1
        System.out.println("> Data Karyawan");
        System.out.println("Nama : " + karyawan1.getName()); //getName dari class Karyawan dipanggil
        System.out.println("Alamat : " + karyawan1.getAddress());
        System.out.println(karyawan1.getStatus());
    }
}