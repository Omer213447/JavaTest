public class Bmw extends Cars{
    private static int count = 0;
    public Bmw(String engineType){
        modelName = "BMW" + String.format("%04d", count);
        this.engineType = engineType;
        isEngineRunning = false;
        System.out.println("Bmw car has been created! Model and Engine Type: " + this.toString());
        count++;
    }
    public String getModelName(){
        return modelName;
    }
    public String getEngineType(){
        return engineType;
    }
    public Boolean getIsEngineRunning(){
        return isEngineRunning;
    }
    public String toString(){
        return modelName + " " + engineType;
    }
    public void runEngine(){
        isEngineRunning = true;
        System.out.println("Engine of " + this.toString() + " running.");
    }
    public void stopEngine(){
        isEngineRunning = false;
        System.out.println("Engine of " + this.toString() + " stopped.");
    }
}
