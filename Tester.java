
public class Tester {
    public static void main(String[] args) {

        //create a factory creator, then create abstract factories that create Brand A and Brand B factory classes//
        AbstractFactory af = new FactoryCreator().getFactory("A");
        AbstractFactory af2 = new FactoryCreator().getFactory("B");

        //create products//
        SmartBulb bulb1 = af.getBlub();
        SmartLock lock1 = af.getLock();
        SmartBulb bulb2 = af2.getBlub();
        SmartLock lock2 = af2.getLock();



    }
}