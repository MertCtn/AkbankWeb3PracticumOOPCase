import java.util.ArrayList;

public class Gişe {

    private int standartGeçişÜcreti;  // Minibüs için 2 ile otobüs için 3 ile çarpılacak.
    private String gişeAdı;
    private static int günlükGelir = 0;
    static ArrayList<Araç> günlükGeçenler = new ArrayList<>(); // Günlük geçen araçların listesi.

    Gişe(String gişeAdı , int standartGeçişÜcreti){
        this.gişeAdı = gişeAdı;
        this.standartGeçişÜcreti = standartGeçişÜcreti;
    }


    public void ÖdemeAl(Araç geçenAraç){
        int geçişKatsayısı = geçenAraç.getAraçSınıfı();

        geçenAraç.setBakiye(geçenAraç.getBakiye() - standartGeçişÜcreti*geçişKatsayısı);
        günlükGelir += standartGeçişÜcreti*geçişKatsayısı;
        günlükGeçenler.add(geçenAraç);

        if(geçenAraç.getBakiye() >= standartGeçişÜcreti * geçişKatsayısı){
            System.out.println(gişeAdı + " gişesinden geçtiniz. ");
            System.out.println("İyi yolculuklar. "+geçenAraç.getSürücüAdı()+" "+geçenAraç.getSürücüSoyAdı());
            System.out.println("Kalan bakiyeniz : " + geçenAraç.getBakiye());
            System.out.println("-----------------------");
        }
        else{
            System.out.println(gişeAdı + " gişesinden geçtiniz. ");
            System.out.println("Dikkat! Bakiyeniz sıfırın altında."+geçenAraç.getSürücüAdı()+" "+geçenAraç.getSürücüSoyAdı());
            System.out.println("En kısa zamanda yükleme yapın.");
            System.out.println("Kalan bakiyeniz : " + geçenAraç.getBakiye());
            System.out.println("------------------------");
        }
        
    } 
    
    public String getGişeAdı(){
        return gişeAdı;
    } 

    public static int getGünlükGelir(){
        return günlükGelir;
    }







}