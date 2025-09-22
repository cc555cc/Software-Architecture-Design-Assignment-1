public class BrandBBulb implements SmartBulb{
    private String powerUsage;
    public BrandBBulb(){

    }

    @Override
    public void setPowerUsage(String value){
        powerUsage = value;
    }

    @Override
    public String getPowerUsage(){
        return powerUsage;
    }
}
