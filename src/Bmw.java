public class Bmw extends Cars{
    private static int count = 0;
    public Bmw(String engineType){
        modelName = "BMW" + String.format("%04d", count);
        this.engineType = engineType;
        isEngineRunning = false;
        System.out.println("Bmw car has been created! Model and Engine Type: " + this.toString());
        count++;
    }
}
