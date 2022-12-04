
package oryantasyon_vize;

import java.util.Scanner;

public class ornek9 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        System.out.println("Üniversite kaçıncı sınıftasınız:");
        byte sinif=giris.nextByte();
        switch(sinif){
            case 1:
                System.out.println("ÇAYLAK");
                break;
            case 2:
                System.out.println("KALFA");
                break;
            case 3:
                System.out.println("USTA");
                break;
            case 4:
                System.out.println("ÜSTAD");
                break;
                
            default:
                System.out.println("Lütfen 1-4 arası bir değer girin!");
                
                
        
    }
    }
    
}
