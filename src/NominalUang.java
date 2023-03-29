import java.util.Scanner;

public class NominalUang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah uang: \n" );

        int uang = input.nextInt();
        int duaPuluhRibuan = uang / 20000;
        uang = uang % 20000;
        int sepuluhRibuan = uang / 10000;
        uang = uang % 10000;
        int seribu = uang / 1000;
        uang = uang % 1000;
        int limaRatus = uang / 500;
        uang = uang % 500;
        int duaRatus = uang / 200;
        uang = uang % 200;
        int seratus = uang / 100;
        uang = uang % 100;


        System.out.println("Jumlah pecahan uang:");
        System.out.println("Dua puluh ribuan: " + duaPuluhRibuan);
        System.out.println("Sepuluh ribuan: " + sepuluhRibuan);
        System.out.println("Seribu: " + seribu);
        System.out.println("Lima ratusan: " + limaRatus);
        System.out.println("Dua ratusan: " + duaRatus);
        System.out.println("Seratusan: " + seratus);
    }
}
