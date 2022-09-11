import java.time.LocalDate;
import java.util.Scanner;

public class Yönetim {

    LocalDate tarih = LocalDate.now(); 

    public void anaMenü(){
        Scanner sc = new Scanner(System.in);

        System.out.println("---------------------------");
        System.out.println("Yönetim Bilgi Sistemini açmak için '1' e basınız.");
        System.out.println("Çıkış için '0' a basınız.");
        System.out.println("---------------------------");
        int girdi = sc.nextInt();
        if(girdi == 0){
            System.exit(0);
        }
        else if(girdi == 1){
            yönetimBilgiSistemi();
        }
        else{
            System.out.println("Geçerli bir değer girin.");
            anaMenü();
        }
    }

    private void yönetimBilgiSistemi(){
        Scanner sc = new Scanner(System.in);

        System.out.println("---Yönetim Bilgi Sistemi---");
        System.out.println(" 1.Geçen Araçları Listele");
        System.out.println(" 2.Günlük Geliri Yazdır");
        System.out.println(" 0.Çıkış");
        System.out.println("---------------------------");
        int seçim = sc.nextInt();

        if(seçim == 1){
            if(Gişe.günlükGeçenler.isEmpty()){
                System.out.println(tarih +" tarihinde araç geçmedi.");
                System.out.println("---------------------------");
                yönetimBilgiSistemi();
            }
            else{
                geçenAraçlarıListele();
                System.out.println("---------------------------");
                yönetimBilgiSistemi();
            }
        }
        else if(seçim == 2){
            System.out.println(tarih + " tarihinde toplam gelir: " + Gişe.getGünlükGelir());
            System.out.println("---------------------------");
            yönetimBilgiSistemi();
        }
        else if(seçim == 0){
            anaMenü();
        }
        else{
            System.out.println("Geçerli bir değer girin.");
            yönetimBilgiSistemi();
        }
        
    }


    private void geçenAraçlarıListele(){
        int araçSayısı = Gişe.günlükGeçenler.size();
        System.out.println("---------------------------");
        System.out.println(tarih + " Tarihinde Geçen Araçlar");
        System.out.println("Toplam araç sayısı: "+araçSayısı);
        System.out.println("HGSNumarası - Adı - Soyadı - AraçTipi");
        for(int i=0 ; i < araçSayısı; i++){
            Araç listelenenAraç = Gişe.günlükGeçenler.get(i);
            System.out.println(listelenenAraç.getHGSNumarası()+" "+listelenenAraç.getSürücüAdı()+" "+listelenenAraç.getSürücüSoyAdı()+" "+listelenenAraç.getAraçSınıfı());
        }
        System.out.println("---------------------------");
    }

}