package functionExample;

public class Luas {
    // Kitra akan buat parameter func
    public static void main(String[] args){
        hitungLuasSegitiga(12,3,5);
    }

    public static void hitungLuasSegitiga(int alas, int tinggi, int sisiMiring){
        // Rumus luas segitiga
        double luas = (alas * tinggi) / 2.0;
        System.out.println("Luas segitiga dengan alas " + alas + " dan tinggi " + tinggi + " adalah: " + luas);
        System.out.println("Panjang sisi miring segitiga adalah: " + sisiMiring);
    }
}
