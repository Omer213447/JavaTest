abstract class Cars {
    //protected static int count = 0;
    protected String modelName;
    protected String engineType;
    protected Boolean isEngineRunning;
    public String getModelName(){
        return modelName;
    }
    public String getEngineType(){
        return engineType;
    }
    public Boolean getIsEngineRunning(){
        return isEngineRunning;
    }
    public void runEngine(){
        isEngineRunning = true;
        System.out.println("Engine of " + this.toString() + " running.");
    }
    public void stopEngine(){
        isEngineRunning = false;
        System.out.println("Engine of " + this.toString() + " stopped.");
    }
    public String toString(){
        return modelName + " " + engineType;
    }
}
