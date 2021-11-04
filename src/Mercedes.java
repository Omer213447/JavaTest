public class Mercedes extends Cars{
    private static int count = 0;
    public Mercedes(String engineType){
        modelName = "Mercedes" + String.format("%04d", count);
        this.engineType = engineType;
        isEngineRunning = false;
        System.out.println("Mercedes car has been created! Model and Engine Type: " + this.toString());
        count++;
    }
}
