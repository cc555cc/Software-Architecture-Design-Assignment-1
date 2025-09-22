import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
public abstract class AbstractFactory {
    protected ArrayList<String> lines = new ArrayList<>();
    protected String brand;
    public AbstractFactory(){
        //retrieve configuration value of the product from the "external database"//
        File externalDatabase = new File("ExternalDatabaseFile.txt");
        try{
            Scanner scan = new Scanner(externalDatabase);
            while(scan.hasNextLine()){
                lines.add(scan.nextLine()); //put each line in an Array List for the subclasses to read//
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }

    //the factory of each brand should be able to create their bulb and lock, then configure them//
    //creation methods//
    public abstract SmartBulb getBlub();
    public abstract SmartLock getLock();

    //configuration methods//
    public abstract void setPowerUsage(SmartBulb b);
    public abstract void setBatteryConsumption(SmartLock l);
}
