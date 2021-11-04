public class PeugeotFactory implements IFactory {
    private Peugeot peugeot;
    public PeugeotFactory(String engineType){
        peugeot = new Peugeot(engineType);
    }
    public String getCarName(){
        return peugeot.toString();
    }
    public Peugeot getCar(){
        return peugeot;
    }
}
