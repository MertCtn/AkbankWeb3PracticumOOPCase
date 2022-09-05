
import java.util.ArrayList;
import java.util.Date;

public abstract class Araç {

    private String HGSNumarası;
    private String sürücüAdı;
    private String sürücüSoyAdı;

    private int bakiye;
    ArrayList<Date> geçişTarihleri;  // Tüm geçiş tarihleri her araç için bir arraylistte tutulacak 

    private byte araçSınıfı; // Otomobil = 1, Minibüs = 2, Otobüs=3
    
    
    Araç(String HGSNumarası , String sürücüAdı , String sürücüSoyadı , int bakiye){

        this.HGSNumarası = HGSNumarası;
        this.sürücüAdı = sürücüAdı;
        this.sürücüSoyAdı = sürücüSoyadı;
        this.bakiye = bakiye;

    }

    public void setAraçSınıfı (byte araçSınıfı){
        this.araçSınıfı = araçSınıfı;
    }

    public byte getAraçSınıfı(){
        return araçSınıfı;
    }

    public void setBakiye(int bakiye){
        this.bakiye = bakiye;
    }

    public int getBakiye(){
        return bakiye;
    }


    

}