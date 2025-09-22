import static java.lang.System.exit;

public class FactoryCreator {
    public FactoryCreator(){
    }

    //create a factory based on the brand//
    public AbstractFactory getFactory(String brand){
        if (brand.equalsIgnoreCase("A")){
            return new BrandAFactory(); // --> create a Brand A factory//
        } else {
            return new BrandBFactory(); // --> create a Brand B factory//
        }
    }

}
