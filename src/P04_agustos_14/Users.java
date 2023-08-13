package P04_agustos_14;

import java.time.LocalDateTime;

/*
Bu uygulama kulanıcıların bir ArrayListe kayıt zamanını da alarak
     ekleyen ve sonrasında her dakikanın ilk 10 saniyesinde kaydolanları
     şanslı kullanıcı olarak ekrana yazdıran bir uygulamadır.
     Bunun için;
     1- Bir user(Kullanıcı) class oluşturun fields: name , registerDate(kayıtZamanı) (LocalDateTime cinsinden)
     2- Registration(Kayıt) isminde bir class oluşturun ve register()(kayıtAl()) isminde bir metod
     ekleyerek Kullanıcıdan user ismini alarak ArrayList e ekleyin ve bu list i
     return edin.
     3- Registration(Kayıt) classı na aynı zamanda kendine verilen
     ArrayListteki userlardan(kullanıcı) her dakikanın ilk 10  saniyesinde kaydolanları
     yazdıran printHappyUsers(sanslıKullanıcı) isminde bir metod daha ekleyiniz.
 */
public class Users {
    String name = "";
    LocalDateTime registerDate;

    public static void main(String[] args) {

        Registration registration = new Registration();

        System.out.println(registration.register());
        registration.printHappyUsers(registration.register());

    }
}
