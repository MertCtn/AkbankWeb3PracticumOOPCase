import java.util.Date;
import java.util.Scanner;

public class Yönetim {

    Date tarih = new Date();

    public void yönetimBilgiSistemi(){
        Scanner sc = new Scanner(System.in);
        int seçim = sc.nextInt();

        System.out.println("---Yönetim Bilgi Sistemi---");
        System.out.println(" 1.Geçen Araçları Listele");
        System.out.println(" 2.Günlük Geliri Yazdır");
        System.out.println(" 0.Çıkış");
        System.out.println("---------------------------");

        if(seçim == 1){
            if(Gişe.günlükGeçenler.isEmpty()){
                System.out.println(tarih +" tarihinde araç geçmedi.");
                System.out.println("----------------------------------");
                yönetimBilgiSistemi();
            }
            else{
                geçenAraçlarıListele();
                System.out.println("----------------------------------");
                yönetimBilgiSistemi();
            }
        }
        else if(seçim == 2){
            System.out.println(tarih + "tarihinde toplam gelir: " + günlükGelir());
            System.out.println("---------------------------------");
            yönetimBilgiSistemi();
        }
        else{
            System.out.println("Geçerli bir değer girin.");
            yönetimBilgiSistemi();
        }
        
    }


    private void geçenAraçlarıListele(){
        int araçSayısı = Gişe.günlükGeçenler.size();
        System.out.println(tarih + " Tarihinde Geçen Araçlar");
        System.out.println("Toplam araç sayısı: "+araçSayısı);
        for(int i=0 ; i < araçSayısı; i++){
            Araç listelenenAraç = Gişe.günlükGeçenler.get(i);
            System.out.println(listelenenAraç.getHGSNumarası()+" "+listelenenAraç.getSürücüAdı()+""+listelenenAraç.getSürücüSoyAdı()+" "+listelenenAraç.getAraçSınıfı());
        }
        System.out.println("-----------------------------");
    }

    private int günlükGelir(){
        int toplamGelir = 0;
        int araçSayısı = Gişe.günlükGeçenler.size();
        for(int i=0 ; i<araçSayısı ; i++){
            toplamGelir += Gişe.günlükGeçenler.get(i).getBakiye();
        }
        return toplamGelir;
    }
}