package P04_agustos_14;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Registration {
    ArrayList<User> kullanicilar =new ArrayList<>();// user tipinde veriler olacak
    Scanner scan =new Scanner(System.in);

    ArrayList<User> register(){
        System.out.println("Isminizi giriniz: ");
        String name =scan.nextLine();
        LocalDateTime time = LocalDateTime.now();
        User kullanici=new User(name,time); // p li cons kullanarak user class inda obje olusturduk
        kullanicilar.add(kullanici);


        return kullanicilar;
    }

    void printHappyUsers(ArrayList<User> list){
        for (User each:list
             ) {
            /*
            3- Registration(Kayıt) classı na aynı zamanda kendine verilen
     ArrayListteki userlardan(kullanıcı) her dakikanın ilk 10  saniyesinde kaydolanları
     yazdıran printHappyUsers(sanslıKullanıcı) isminde bir metod daha ekleyiniz.
             */
            if (each.registerDate.getSecond()<=10){
                System.out.println(each.name+" hadi yisin 5 kilo bali kaptin....");
            }else {
                System.out.println(each.name+" bu sefer olmadi.Bir dahaki sefere ....");
            }
        }
    }
    void kullaniciListesi(ArrayList<User>list){
        for (User each:list
             ) {
            System.out.println("Isim : "+each.name+"Kayit zamani: "+each.registerDate);
        }
    }
}
