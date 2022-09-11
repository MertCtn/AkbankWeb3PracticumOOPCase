import java.time.LocalDate;
import java.util.ArrayList;

public class Gişe {

    private int standartGeçişÜcreti;  // Minibüs için 2 ile otobüs için 3 ile çarpılacak.
    private String gişeAdı;
    static ArrayList<Araç> günlükGeçenler = new ArrayList<>(); // Günlük geçen araçların listesi.

    Gişe(String gişeAdı , int standartGeçişÜcreti){
        this.gişeAdı = gişeAdı;
        this.standartGeçişÜcreti = standartGeçişÜcreti;
    }


    public void ÖdemeAl(Araç geçenAraç){
        LocalDate geçişTarihi = LocalDate.now();
        int geçişKatsayısı = geçenAraç.getAraçSınıfı();

        geçenAraç.setBakiye(geçenAraç.getBakiye() - standartGeçişÜcreti*geçişKatsayısı);
        günlükGeçenler.add(geçenAraç);
        geçenAraç.geçişTarihleri.add(geçişTarihi);

        if(geçenAraç.getBakiye() >= standartGeçişÜcreti * geçişKatsayısı){
            System.out.println("İyi yolculuklar.");
            System.out.println(gişeAdı + " gişesinden geçtiniz. ");
            System.out.println("Kalan bakiyeniz : " + geçenAraç.getBakiye());
        }
        else{
            System.out.println("Dikkat! Bakiyeniz sıfırın altında.");
            System.out.println("En kısa zamanda yükleme yapın.");
            System.out.println(gişeAdı + " gişesinden geçtiniz. ");
            System.out.println("Kalan bakiyeniz : " + geçenAraç.getBakiye());
        }
        
    } 
    







}