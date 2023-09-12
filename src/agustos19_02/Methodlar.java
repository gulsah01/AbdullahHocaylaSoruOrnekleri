package agustos19_02;

import java.util.ArrayList;
import java.util.Scanner;

public class Methodlar {

    ArrayList<Kullanici> kullaniciList = new ArrayList<>();

    Scanner scan = new Scanner(System.in);
   void kullaniciGirisi(){
       System.out.println("KART NO GIRINIZ: ");
       String kartNo=scan.nextLine();
       System.out.println("SIFRE GIRINIZ: ");
       int sifre =scan.nextInt();


   }
    

    void kullaniciOlustur(){
        System.out.println("KART NO GIRINIZ: ");
        String kartNo=scan.nextLine().replace(" ","");
        System.out.println("SIFRE GIRINIZ: ");
        int sifre =scan.nextInt();
        System.out.println("BAKIYE GIRINIZ: ");
        double bakiye =scan.nextDouble();
        Kullanici kullanici =new Kullanici(kartNo,sifre,bakiye);

    }

    void bakiyeSorgula() {
        String kartNo = scan.nextLine();
        boolean flag = true;
        for (Kullanici each : kullaniciList
        ) {
            if (each.getKartNo().equals(kartNo)) {
                System.out.println(kartNo + " ait bakiye= " + each.getBakiye());
                flag = false;
            }
        }
    if (flag){
        System.out.println("Hatali giris yaptiniz");
        paraYatirma();
    }
  }
    void paraYatirma() {
        String kartNo=scan.nextLine();
        boolean flag=true;
        for (Kullanici each:kullaniciList
             ) {
            if (each.getKartNo().equals(kartNo)){
                System.out.println("Yatirmak istediginiz miktari giriniz : ");
                double miktar=scan.nextDouble();
                each.setBakiye(miktar+each.getBakiye());// siradaki kullanicinin bakiyesine miktari  o andaki bakiye ile toplayarak updat ettik
                System.out.println("Bakiyeniz = "+each.getBakiye());
                flag=false;
            }
        }
       if (flag){
      System.out.println("Hatali giris yaptiniz");
      paraYatirma();
}

    }
    void paraCekme(){
        String kartNo=scan.nextLine();
        boolean flag=true;
        for (Kullanici each:kullaniciList
             ) {
    if (each.getKartNo().equals(kartNo)){
    //Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez
    System.out.println("Cekmek istediginiz miktari giriniz: ");
    double miktar= scan.nextDouble();
    if (miktar<= each.getBakiye()){
        each.setBakiye(each.getBakiye()-miktar);
        System.out.println("Bakiyeniz : "+ each.getBakiye());
    }else {
        System.out.println("Yetersiz bakye .....");
        paraCekme();
    }
    flag=false;
}
        }
        if (flag){
            System.out.println("Hatali giris yaptiniz .....");
        }

    }
void paraGonderme(){
    //Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
    //Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali,
    // eger değilse menü ekranina geri donsun

}
}