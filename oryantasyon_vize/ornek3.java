package oryantasyon_vize;

public class ornek3 {
    public static void main(String[] args) {
        float birinci=1.20f, ikinci=2.45f;
        System.out.println("--Değişimden önce--");
        System.out.println("Birinci sayı="+birinci);
        System.out.println("İkinci sayı="+ikinci);
        
        float gecici=birinci;
        birinci=ikinci;
        ikinci=gecici;
        System.out.println("--Değişimden sonra--");
        System.out.println("Birinci sayı="+birinci);
        System.out.println("İkinci sayı="+ikinci);
    }
    
}
