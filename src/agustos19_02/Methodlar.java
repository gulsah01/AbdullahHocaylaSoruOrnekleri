package agustos19_02;

import java.util.ArrayList;
import java.util.Scanner;

public class Methodlar {

    ArrayList<Kullanici> kullaniciList = new ArrayList<>();

    Scanner scan= new Scanner(System.in);

    void bakiyeSorgula(String kartNo) {

        for (Kullanici each : kullaniciList
        ) {
            if (each.getKartNo().equals(kartNo))
                System.out.println(kartNo + " ait bakiye= " + each.getBakiye());
        }
    }
    void paraYatirma(String kartNo) {
        for (Kullanici each:kullaniciList
             ) {
            if (each.getKartNo().equals(kartNo)){
                System.out.println("Yatirmak istediginiz miktari giriniz : ");
                double miktar=scan.nextDouble();
                each.setBakiye(miktar+each.getBakiye());
                bakiyeSorgula(kartNo);
            }
        }

    }

}