package functionExample;

public class OverLoading{
    public static void main(String[] args){
        double p =2.2; // ini properti
        double l = 3.0;
        double hasil = hitungLuas(p, l);
        System.out.println("Luas persegi panjang: " + hasil);

        int pn = 4;
        int lb = 5;
        int hasil2 = hitungLuas(pn, lb);
        System.out.println("Luas persegi: " + hasil2);

    }

    public static double hitungLuas(double panjang, double lebar){ 
        return panjang * lebar;
    }

    public static int hitungLuas(int sisiPanjang, int sisiLebar){
        return sisiPanjang * sisiLebar;
    }
}