package P01_temmuz25;

import java.util.*;

public class C01_soru1 {
    public static void main(String[] args) {
      //   1. SORU
      //   Girilen desimal değeri binary değere çeviren metodu oluşturunuz.
      //   Örnek: 12 = 1 1 0 0
        System.out.println("Desimal deger giriniz :");
        Scanner scan =new Scanner(System.in);
        int sayi=scan.nextInt();
        System.out.println(sayi+ " desimal sayisinin binary karsiligi : "+binaryConvert(sayi));


    }

    public static List<Integer> binaryConvert(int sayi) {
        List<Integer> binary =new ArrayList<>();
        while (sayi>0){
            binary.add(sayi%2);
            sayi/=2;

        }

        List<Integer> tersBinary =new ArrayList<>();
        for (int i = binary.size()-1; i >=0 ; i--) {
            tersBinary.add(binary.get(i));
          }

       // Collections.reverse(binary);
        return binary;
    }

}
