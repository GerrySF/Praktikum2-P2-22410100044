package LatihanIOPercabangan;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
public class percabangan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //if-else
        //cek syarat pembuatan KTP
        int usia = 0;
        System.out.print("Masukan usia anda: ");
        usia = Integer.parseInt(br.readLine());
        if (usia >= 17) {
            System.out.println("Sudah memenuhi syarat");
        } else {
            System.out.println("Belum memenuhi syarat");
        }

        //if-else-if
        //cek status kelulusan mk berdasarkan nim dan nilai UAS
        String nim;
        int nilaiUAS;
        System.out.print("Masukan NIM Anda: ");
        nim = br.readLine();
        System.out.print("Masukan Nilai UAS: ");
        nilaiUAS = Integer.parseInt(br.readLine());

        //jika nilai 80, 70, 65 = lulus, dibawah 65 = tidak lulus
        if (nim.equalsIgnoreCase("22410100044")
                && nilaiUAS == 80) {
            System.out.println("Lulus");
        } else if (nim.equalsIgnoreCase("22410100044")
                && nilaiUAS == 70) {
            System.out.println("Lulus");
        } else if (nim.equalsIgnoreCase("22410100044")
                && nilaiUAS == 65) {
            System.out.println("Lulus");
        } else if (nim.equalsIgnoreCase("22410100044")
                && nilaiUAS < 65) {
            System.out.println("Tidak Lulus");
        }
        //equals: memperhatikan detail besar-kecil hurufnya
        //equalsIgnoranceCase: non-sensitive

        String menu, jenis;
        System.out.print("Masukan menu (Makanan/Minuman): ");
        menu = br.readLine();
        System.out.print("Masukan jenis menu \n Makanan: Snack,Nasi Bungkus \n" + "Minuman: Kopi, Teh, Air Mineral. Pilih: ");
        jenis = br.readLine();

        if (menu.equalsIgnoreCase("makanan")) {
            if (jenis.equalsIgnoreCase("snack")) {
                System.out.println("Harga 2000");
            } else if (jenis.equalsIgnoreCase("Nasi Bungkus")) {
                System.out.println("Harga 5000");
            }

        } else if (menu.equalsIgnoreCase("minuman")) {
            if (jenis.equalsIgnoreCase("Kopi")) {
                System.out.println("Harga 2500");
            } else if (jenis.equalsIgnoreCase("Teh")) {
                System.out.println("Harga 2000");
            } else if (jenis.equalsIgnoreCase("Air Mineral")) {
                    System.out.println("Harga 1500");
            }
        }

    }
}
