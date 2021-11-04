public class Cars {
    protected String modelName;
    protected String engineType;
    protected Boolean isEngineRunning;
    public void runEngine(){

    }
    public void stopEngine(){

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
}
