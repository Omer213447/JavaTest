public class Bmw extends Cars{
    private static int count = 0;
    public Bmw(String engineType){
        modelName = "BMW" + String.format("%04d", count);
        this.engineType = engineType;
        System.out.println("Bmw car has been created! Model and Engine Type: " + this.toString());
        count++;
    }
    public String getModelName(){
        return modelName;
    }
    public String getEngineType(){
        return engineType;
    }
    public String toString(){
        return modelName + " " + engineType;
    }
}
