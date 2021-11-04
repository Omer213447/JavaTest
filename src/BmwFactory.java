public class BmwFactory implements IFactory {
    private Bmw bmw;
    public BmwFactory(String engineType){
        bmw = new Bmw(engineType);
    }
    public String getCarName(){
        return bmw.toString();
    }
}
