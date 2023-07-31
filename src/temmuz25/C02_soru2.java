package temmuz25;

import java.util.Scanner;

public class C02_soru2 {
    public static void main(String[] args) {
       /* 2. SORU
        Kullanıcı tarafından girilen metni "Sezar Şifreleme Yöntemi" ne göre şifreleyiniz.
                Sezar Şifreleme: Sezar şifrelemesi, ilk kez Romalı lider Jül Sezar tarafından
                kullanılmış olan şifreleme tekniğidir.
        Bu şifreleme en basit ve en bilinen şifreleme tekniklerinden biridir.
        Düz metindeki her harfin, alfabeden belirli bir sayı ileride konumlu olan bir
        harfle değiştirildiği bir şifreleme türüdür.
        //hello ----> ıfmmp --->1 birim kaydırılmış hali
        */

        System.out.println("Sifrelenecek metni giriniz: ");
        Scanner scan=new Scanner(System.in);
        String metin = scan.nextLine().toUpperCase();
        System.out.println("Kaydirma miktarini giriniz");
        int kaydirma = scan.nextInt();
        sifreleme(metin,kaydirma);

    }

    public static void sifreleme(String metin, int kaydirma) {
        String sifrelenmisMetin="";
        String alfabe="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i <metin.length() ; i++) {
            char karakter=metin.charAt(i);
            int karakterIndex=alfabe.indexOf(karakter);
            //(26       +    3) % 26 =  3
            //karakterIndexin ve kaydırma miktarını ekledikten sonra alfabe uzunluğunu geçmemesi için alfabe
            //uzunluğuna modu alınarak alfabe değerleri içinde yeniIndex değeri elde edilmiş oldu
            int yeniIndex=(karakterIndex+kaydirma)%alfabe.length();
            sifrelenmisMetin+=alfabe.charAt(yeniIndex);

        }
        System.out.println("Sifrelenmis metin: "+sifrelenmisMetin);
    }


}
