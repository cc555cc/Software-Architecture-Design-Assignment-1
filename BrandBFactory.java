public class BrandBFactory extends AbstractFactory {
    public BrandBFactory(){
        super();
        brand = "Brand B";
    }

    public SmartBulb getBlub(){
        SmartBulb bulb = new BrandBBulb();
        setPowerUsage(bulb); //set the power usage of the bulb//
        System.out.println("Brand B bulb created and configured, the power usage is " + bulb.getPowerUsage() );
        return bulb;
    }

    public SmartLock getLock() {
        SmartLock lock = new BrandBLock();
        setBatteryConsumption(lock);//set the battery consumption of the lock//
        System.out.println("Brand B light lock created and configured, the battery consumption is " + lock.getBatteryConsumption());
        return lock;
    }

    //configure the product after it is created based on the value in the external database(A text file)//
    public void setPowerUsage(SmartBulb b){
        for(String s: lines){
            if(s.contains(brand) && s.contains("bulb")){
                String value = s.substring(s.lastIndexOf(':') + 1);
                b.setPowerUsage(value);
                break;
            }
        }
    }

    public void setBatteryConsumption(SmartLock l){
        for(String s: lines){
            if(s.contains(brand) && s.contains("lock")){
                String value = s.substring(s.lastIndexOf(':') + 1);
                l.setBatteryConsumption(value);
                break;
            }
        }
    }
}
