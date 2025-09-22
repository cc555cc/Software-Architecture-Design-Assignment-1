public class BrandABulb implements SmartBulb{
    private String powerUsage;
    public BrandABulb(){

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
