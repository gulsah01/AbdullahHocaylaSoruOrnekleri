package P04_agustos_14;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Registration {
    List<String> usersName = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    Users user = new Users();
    int sayac=0;
    boolean flag=false;
    List<String> register(){
        while(sayac<5) {
            System.out.print("Lütfen Kullanıcı isminizi giriniz: ");
            user.name = scan.next();
            user.registerDate = LocalDateTime.now();
            usersName.add(user.name + " " + user.registerDate.getSecond());
            sayac++;
        }
        return usersName;
    }
    void printHappyUsers(List<String> usersName){
        for (int i = 0; i < usersName.size(); i++) {
            if (Integer.valueOf(usersName.get(i).substring(usersName.get(i).length() - 2).replace(" ","")) < 10) {
                System.out.println("Şanslı kullanıcı: " + usersName.get(i) + ". Saniye de kayıt edilmiştir");
                flag=true;
            }
            if (!flag){
                System.out.println("İlk 10 saniyede kayıt edilebilen kullanıcı olmamıştır");
                break;
            }
        }
    }

}
