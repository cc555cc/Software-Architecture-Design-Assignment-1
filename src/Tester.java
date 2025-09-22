
public class Tester {
    public static void main(String[] args) {

        //create a factory creator, then create abstract factories that create Brand A and Brand B factory classes//
        AbstractFactory af = new FactoryCreator().getFactory("A");
        AbstractFactory af2 = new FactoryCreator().getFactory("B");

        //create products//
        SmartBulb bulb1 = af.createBlub();
        SmartLock lock1 = af.createLock();
        SmartBulb bulb2 = af2.createBlub();
        SmartLock lock2 = af2.createLock();



    }
}