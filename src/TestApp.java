import java.util.ArrayList;
import java.util.Scanner;

public class TestApp {
    public static void useCar(Factory factory){
        Scanner in = new Scanner(System.in);
        String use = "1";
        while(!use.equals("0")){
            System.out.println("1- Run Engine, 2- Stop Engine, 0-Exit");
            use = in.nextLine();
            switch(use){
                case "1":
                if(factory.getCar().getIsEngineRunning()){
                    System.out.println("Engine has been running already!");
                }else{
                    factory.getCar().runEngine();
                }
                break;
                case "2":
                if(!factory.getCar().getIsEngineRunning()){
                    System.out.println("Engine has been stopped already!");
                }else{
                    factory.getCar().stopEngine();
                }
                break;
                case "0":
                break;
                default:
                System.out.println("Wrong input! Retry please!");
            }
        }
    }
    public static void main(String[] args) throws Exception {
        String firstInput = "1", secondInput;
        ArrayList<Cars> cars = new ArrayList<Cars>();
        while(!firstInput.equals("0")){
            System.out.println("1- Create BMW, 2- Create Mercedes, 3- Create Peugeot, 0-Exit");
            Scanner in = new Scanner(System.in);
            firstInput = in.nextLine();
            Factory factory = null;
            int count;
            switch(firstInput){
                case "1":
                count = 0;
                while(count != 1){
                    System.out.println("1- Diesel, 2- Electric");
                    secondInput = in.nextLine();
                    switch(secondInput){
                        case "1":
                        factory = new BmwFactory("Diesel");
                        cars.add(factory.getCar());
                        count++;
                        break;
                        case "2":
                        factory = new BmwFactory("Electric");
                        cars.add(factory.getCar());
                        count++;
                        break;
                        default:
                        System.out.println("Wrong input! Retry please!");
                    }
                }
                if(factory != null)
                    useCar(factory);
                break;
                case "2":
                count = 0;
                while(count != 1){
                    System.out.println("1- Diesel, 2- Electric");
                    secondInput = in.nextLine();
                    switch(secondInput){
                        case "1":
                        factory = new MercedesFactory("Diesel");
                        cars.add(factory.getCar());
                        count++;
                        break;
                        case "2":
                        factory = new MercedesFactory("Electric");
                        cars.add(factory.getCar());
                        count++;
                        break;
                        default:
                        System.out.println("Wrong input! Retry please!");
                    }
                }
                if(factory != null)
                    useCar(factory);
                break;
                case "3":
                count = 0;
                while(count != 1){
                    System.out.println("1- Diesel, 2- Electric");
                    secondInput = in.nextLine();
                    switch(secondInput){
                        case "1":
                        factory = new PeugeotFactory("Diesel");
                        cars.add(factory.getCar());
                        count++;
                        break;
                        case "2":
                        factory = new PeugeotFactory("Electric");
                        cars.add(factory.getCar());
                        count++;
                        break;
                        default:
                        System.out.println("Wrong input! Retry please!");
                    }
                }
                if(factory != null)
                    useCar(factory);
                break;
                case "0":
                in.close();
                System.out.println("All of the cars that has been produced and their engine states:");
                for(int i = 0; i < cars.size(); i++){
                    System.out.println(cars.get(i).toString() + " " + (cars.get(i).getIsEngineRunning() == true ? "Engine is Running" : "Engine is Stopped"));
                }
                System.out.println("Program is closed!");
                break;
                default:
                System.out.println("Wrong input! Retry please!");
            }
        }
    }
}
