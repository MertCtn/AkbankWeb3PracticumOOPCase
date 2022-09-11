class Otobüs extends Araç{

    Otobüs(String HGSNumarası, String sürücüAdı, String sürücüSoyadı, int bakiye){
        super(HGSNumarası, sürücüAdı, sürücüSoyadı, bakiye);
        setAraçSınıfı(3);
    }

}