package Generics;
 
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // Contoh penggunaan kelas Planets
        // Planets earth = new Planets("Earth", 5972);
        // Planets mars = new Planets("Mars", 641);
            char input = 'B';
                int output = 0;
                switch (input) {
                    case 'A':
                        output++;
                    case 'B':
                        output++;
                    case 'C':
                        output++;
                    case 'D':
                        output++;
                    default:
                        output++;
                }
                System.out.println("Nilai akhirnya adalah: " + output);
        // earth.print();
        // mars.print();
        for (int i = 0; i < 5; i++){
            System.out.print(i);
        };
        int a = 5;
        for (int i = 0; i <= a; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
  
        List<Object> lo = new ArrayList<Object>(); // List tanpa type-parameter
        lo.add("lo - String 1"); // lo menampung objek String
        lo.add(new Planets("Mercury", 0.06)); // lo menampung objek Planet
        List<Planets> lp = new ArrayList<Planets>(); // List dengan type-parameter Planet
        lp.add(new Planets("Mercury", 0.06)); // lp menampung objek Planet
        lp.add(new Planets("Venus", 4.87)); // lp menampung objek Planet lainnya

        for (Planets p : lp) {
            p.print();
        }

        long timeNow = System.currentTimeMillis();
        System.out.println("Waktu sekarang adalah " + timeNow + " milisecond");

        Date date = new Date();
        System.out.println("Tanggal sekarang adalah " + date.toString());

         // Menampilkan waktu sekarang
        Calendar calendar = Calendar.getInstance();
        System.out.println("Waktu sekarang adalah " + calendar.getTime());
        // Menampilkan waktu sekarang
        Calendar calendars = Calendar.getInstance();
        System.out.println("Waktu sekarang adalah " + calendar.getTime());
        // menampilkan spesifik waktu yang diinginkan
        System.out.println("Tanggal : " + calendars.get(Calendar.DATE));
        System.out.println("Bulan   : " + calendars.get(Calendar.MONTH));
        System.out.println("Tahun   : " + calendars.get(Calendar.YEAR));

        
        // Menampilkan waktu sekarang
        Calendar calendarss = Calendar.getInstance();
        System.out.println("Waktu sekarang adalah " + calendarss.getTime());
        // Menampilkan waktu 15 hari yang lalu
        calendarss.add(Calendar.DATE, -15);
        System.out.println("15 hari yang lalu: " + calendarss.getTime());
    }
}

class Planets{
    private String name;
    private double mass;

    public Planets(String name, double mass) {
        this.name = name;
        this.mass = mass;
    }

    public void print(){
        System.out.println("Planet Name: " + name);
        System.out.println("Planet Mass: " + mass);
    }
}