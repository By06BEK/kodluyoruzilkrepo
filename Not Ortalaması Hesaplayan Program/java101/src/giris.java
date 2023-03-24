

 import java.util.Scanner;
public class giris {
public static void main(String[] args) {

   // Degiskenleri olustur
        int mat, fizik, kimya, turkce, tarih, muzik ;

   // Scanner sinifimizi tanimladik

        Scanner inp = new Scanner(System.in);

   // kullanicidan degerleri al

        System.out.print("Matematik notunu giriniz :");
        mat = inp.nextInt();

        System.out.print("Fizik notunu giriniz :");
        fizik = inp.nextInt();

        System.out.println("Kimya notunu giriniz :");
        kimya = inp.nextInt();

        System.out.println("Turkce notunugiriniz :");
        turkce = inp.nextInt();

        System.out.println("Tarih notunu giriniz :");
        tarih = inp.nextInt();

        System.out.println("Muzik notunu giriniz :");
        muzik = inp.nextInt();

        int toplam =( mat + fizik + kimya + turkce + tarih + muzik );
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamaniz : " + sonuc);

        double Ortalamaniz = sonuc;
                boolean kosul1 = sonuc >= 60.0;
                boolean kosul2 = sonuc < 60.0 ;
                boolean Ortalama = kosul1 ;

                String str = (Ortalama) ? "Gectiniz" : "Kaldiniz" ;

        System.out.println(str);



    }
}
