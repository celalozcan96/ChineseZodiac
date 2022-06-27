package ChineseZodiac;

import java.util.Scanner;

//Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.

//Çin Zodyağı nedir?

//4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar. Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.

//Çin Zodyağı nasıl hesaplanır?

//Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

//Doğum Tarihi %12 = 0 ➜ Maymun

//Doğum Tarihi %12 = 1 ➜ Horoz

//Doğum Tarihi %12 = 2 ➜ Köpek

//Doğum Tarihi %12 = 3 ➜ Domuz

//Doğum Tarihi %12 = 4 ➜ Fare

//Doğum Tarihi %12 = 5 ➜ Öküz

//Doğum Tarihi %12 = 6 ➜ Kaplan

//Doğum Tarihi %12 = 7 ➜ Tavşan

//Doğum Tarihi %12 = 8 ➜ Ejderha

//Doğum Tarihi %12 = 9 ➜ Yılan

//Doğum Tarihi %12 = 10 ➜ At

//Doğum Tarihi %12 = 11 ➜ Koyun

public class chineseZodiacProgram {
    public static void main(String[] args) {
        int birthYear;

        Scanner year = new Scanner(System.in);
        
        System.out.print("Doğum Yılınızı Giriniz :");
        birthYear = year.nextInt();

        if(birthYear % 12 == 0){
            System.out.println("Burcunuz 'Maymun'");

        }else if(birthYear % 12 == 1){
            System.out.println("Burcunuz 'Horoz'");

        }else if(birthYear % 12 == 2){
            System.out.println("Burcunuz 'Köpek'");

        }else if(birthYear % 12 == 3){
            System.out.println("Burcunuz 'Domuz'");

        }else if(birthYear % 12 == 4){
            System.out.println("Burcunuz 'Fare'");

        }else if(birthYear % 12 == 5){
            System.out.println("Burcunuz 'Öküz'");

        }else if(birthYear % 12 == 6){
            System.out.println("Burcunuz 'Kaplan'");

        }else if(birthYear % 12 == 7){
            System.out.println("Burcunuz 'Tavşan'");

        }else if(birthYear % 12 == 8){
            System.out.println("Burcunuz 'Ejderha'");

        }else if(birthYear % 12 == 9){
            System.out.println("Burcunuz 'Yılan'");

        }else if(birthYear % 12 == 10){
            System.out.println("Burcunuz 'At'");

        }else{
            System.out.println("Burcunuz 'Koyun'");
        }
    }
    
}
