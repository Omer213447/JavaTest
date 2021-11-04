public class Peugeot extends Cars{
    private static int count = 0;
    public Peugeot(String engineType){
        modelName = "Peugeot" + String.format("%04d", count);
        this.engineType = engineType;
        isEngineRunning = false;
        System.out.println("Peugeot car has been created! Model and Engine Type: " + this.toString());
        count++;
    }
}
