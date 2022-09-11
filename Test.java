import java.util.Scanner;

public class Test{


    public static void main(String[] args) {

        Otomobil testOtomobil1 = new Otomobil("12345", "Mehmet", "Korkmaz", 70);
        Otomobil testOtomobil2 = new Otomobil("13579", "Ahmet", "Yılmaz", 0);
        Minibüs testMinibüs1 = new Minibüs("97531", "Fatih", "Akın", 120);
        Otobüs testOtobüs1 = new Otobüs("86531", "Nihal", "Sürer", 500);

        Gişe testGişe = new Gişe("FSM", 10);
        Yönetim testYönetim = new Yönetim();

        System.out.println(testGişe.getGişeAdı()+ " gişesi açılmıştır.");

        testGişe.ÖdemeAl(testOtomobil1);
        testGişe.ÖdemeAl(testOtomobil2);
        testGişe.ÖdemeAl(testMinibüs1);
        testGişe.ÖdemeAl(testOtobüs1);

        testYönetim.anaMenü();


    }
}