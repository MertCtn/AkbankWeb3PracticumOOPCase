
public abstract class Araç {

    private String HGSNumarası;
    private String sürücüAdı;
    private String sürücüSoyAdı;

    private int bakiye;

    private int araçSınıfı; // Otomobil = 1, Minibüs = 2, Otobüs=3
    
    
    Araç(String HGSNumarası,String sürücüAdı,String sürücüSoyadı,int bakiye){

        this.HGSNumarası = HGSNumarası;
        this.sürücüAdı = sürücüAdı;
        this.sürücüSoyAdı = sürücüSoyadı;
        this.bakiye = bakiye;

    }

    public void setAraçSınıfı (int araçSınıfı){
        this.araçSınıfı = araçSınıfı;
    }

    public int getAraçSınıfı(){
        return araçSınıfı;
    }

    public void setBakiye(int bakiye){
        this.bakiye = bakiye;
    }

    public int getBakiye(){
        return bakiye;
    }

    public String getHGSNumarası(){
        return HGSNumarası;
    }

    public String getSürücüAdı(){
        return sürücüAdı;
    }

    public String getSürücüSoyAdı(){
        return sürücüSoyAdı;
    }


    

}