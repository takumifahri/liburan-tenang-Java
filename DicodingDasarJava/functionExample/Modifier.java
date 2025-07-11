package functionExample;
import java.io.*;
public class Modifier {
    public static void main(String[] args) {
        Modifier mod = new Modifier();
        mod.setNama("Kucing");
        mod.setJenis("Mamalia");
        System.out.println("Nama: " + mod.nama);
        System.out.println("Jenis: " + mod.jenis);
        System.out.println("Luas lingkaran dengan jari-jari " + mod.jari + " adalah: " + mod.getLuas());
         // SERIALISASI - Menyimpan objek ke file
        try {
            Person person = new Person();
            FileOutputStream fileOut = new FileOutputStream("person.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(person); // Objek disimpan ke file
            out.close();
            System.out.println("Objek berhasil disimpan!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // DESERIALISASI - Membaca objek dari file
        try {
            FileInputStream fileIn = new FileInputStream("person.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Person restoredPerson = (Person) in.readObject(); // Objek dikembalikan
            in.close();
            
            System.out.println("Nama: " + restoredPerson.nama);     // "John"
            System.out.println("Umur: " + restoredPerson.umur);     // 25
            System.out.println("Password: " + restoredPerson.password); // null (karena transient)
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    private String nama; // ini hanya bisa diakses di dalam class ini
    int umur; // ini bisa diakses di dalam package ini. Default access modifier
    protected String jenis; // ini bisa diakses di dalam package ini dan subclass di luar package

    String function1(){
        return "Ini adalah fungsi 1";
    }
    private void setNama(String nama) { // ini hanya bisa diakses di dalam class ini
        this.nama = nama;
    }   

    protected void setJenis(String jenis) { // ini bisa diakses di dalam package ini dan subclass di luar package
        this.jenis = jenis;
    }

      static final double PI = 3.141;
 
    int jari = 7;
 
    final double getLuas() {
        return PI * (jari * jari);
    }

    transient int berat; // ini tidak akan diserialisasi saat objek disimpan
}

class Person implements Serializable {
    String nama = "John";
    int umur = 25;
    transient String password = "rahasia123"; // Tidak akan disimpan
}


