abstract class Factory{
    protected Cars car;
    public String getCarName(){
        return car.toString();
    }
    public Cars getCar(){
        return car;
    }
}
