public class MercedesFactory implements IFactory {
    private Mercedes mercedes;
    public MercedesFactory(String engineType){
        mercedes = new Mercedes(engineType);
    }
    public String getCarName(){
        return mercedes.toString();
    }
    public Mercedes getCar(){
        return mercedes;
    }
}
