package agustos7;

import java.util.Scanner;

public class kahveMakinasi {
    /*Basit bir Kahve makinesi oluşturun.
1. Şart
 3 çeşit kahvemiz olsun.
    Sistem şu soruyu sorsun: "Hangi Kahveyi istersiniz?"

    Bu soru ile birlikte kullanıcı kahve bilgilerini görsün.
    Örn:
    Hangi Kahveyi İstersiniz?
            1.Türk kahvesi
  2.Filtre Kahve
  3.Espresso
2.Şart
    Kahve seçildikten sonra sistem kullanıcıya "Süt eklemek istemisiniz?(Evet veya Hayır olarak cevaplayınız)
            3. Şart
    Süt tercihi yapıldıktan sonra sistem kullanıcıya "Şeker ister misiniz ? (Evet veya hayır cevabını veriniz)
    sorusunu sorsun.
            4. Şart
    Şeker tercihini yaptıktan sonra sistem kullanıcıya "Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.)
    sorusunu sorsun.
    Sonuç
    Siparişlerimizi verdik. Son hali görmek istiyoruz.
    konsola şunu yazdırın örnek :
    Türk Kahvesi orta boy hazırdır. Afiyet olsun !!!

     */
    static String kahveCesidi, sut, seker , kahveBoyutu = "";
    static Scanner scan = new Scanner(System.in);

    static void menu() {
        System.out.println("**********KAHVECIYE HOSGELDINIZ************");
        do {
            System.out.println("*****MENU******\n" +
                    "Turk Kahvesi\n" +
                    "Filtre Kahve\n" +
                    "Americano\n"+
                    "SECIM:");
            kahveCesidi=scan.nextLine();
            if (!kahveCesidi.equalsIgnoreCase("turk kahvesi")&&
            !kahveCesidi.equalsIgnoreCase("filtre kahve")&&
            !kahveCesidi.equalsIgnoreCase("americano"))
                System.out.println("BU URUN ENUDE YOK.....");

        }while (!kahveCesidi.equalsIgnoreCase("turk kahvesi")&&
                !kahveCesidi.equalsIgnoreCase("filtre kahve")&&
                !kahveCesidi.equalsIgnoreCase("americano"));}

       // 2.Şart
       // Kahve seçildikten sonra sistem kullanıcıya "Süt eklemek istemisiniz?(Evet veya Hayır olarak cevaplayınız)

        static void sutEkleme(){
        System.out.println("Sur eklemek ister misiniz (Evet yada Hayir olarak cevaplayiniz)");
        sut=scan.next();
    }

}
