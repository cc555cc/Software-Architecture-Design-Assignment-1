public class BrandALock implements SmartLock {
    private String batteryConsumption;
    public BrandALock(){

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
