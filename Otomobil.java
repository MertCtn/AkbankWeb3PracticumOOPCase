class Otomobil extends Araç{

    Otomobil(String HGSNumarası, String sürücüAdı, String sürücüSoyadı, int bakiye) {
        super(HGSNumarası, sürücüAdı, sürücüSoyadı, bakiye);

        setAraçSınıfı((byte) 1);
    }
}