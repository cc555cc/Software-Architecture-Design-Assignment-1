public class BrandBLock implements SmartLock {
    private String batteryConsumption;
    public BrandBLock(){

    }

    @Override
    public void setBatteryConsumption(String value){
        batteryConsumption = value;
    }

    @Override
    public String getBatteryConsumption(){
        return batteryConsumption;
    }
}