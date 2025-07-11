package models;
public class Hewan {
    String nama;
    int berat;
    Integer umur;

    public Hewan(String namaHewan) { // ini metode 
        // Non-argument constructor
        this.nama = namaHewan;
       
    }
    // Hewan(String namaHewan) { // ini constructor dengan parameter
    //   this.nama = namaHewan;
    // }

    public void beratHewan(int beratHewan){
        this.berat = beratHewan;
    }

    public void umurHewan(Integer umurHewan){
        this.umur = umurHewan;
    }

    public void printHewan(){
        System.out.println("Nama Hewan: " + this.nama);
        System.out.println("Berat Hewan: " + this.berat);
        System.out.println("Umur Hewan: " + this.umur);
    }
}
