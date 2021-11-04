import java.util.Scanner;

public class TestApp {
    public static void useCar(BmwFactory bmwFactory){
        Scanner in = new Scanner(System.in);
        String use = "1";
        while(!use.equals("0")){
            System.out.println("1- Run Engine, 2- Stop Engine, 0-Exit");
            use = in.nextLine();
            switch(use){
                case "1":
                if(bmwFactory.getCar().getIsEngineRunning()){
                    System.out.println("Engine has been running already!");
                }else{
                    bmwFactory.getCar().runEngine();
                }
                break;
                case "2":
                if(!bmwFactory.getCar().getIsEngineRunning()){
                    System.out.println("Engine has been stopped already!");
                }else{
                    bmwFactory.getCar().stopEngine();
                }
                break;
                case "0":
                break;
                default:
                System.out.println("Wrong input! Retry please!");
            }
        }
    }
    public static void useCar(MercedesFactory mercedesFactory){
        Scanner in = new Scanner(System.in);
        String use = "1";
        while(!use.equals("0")){
            System.out.println("1- Run Engine, 2- Stop Engine, 0-Exit");
            use = in.nextLine();
            switch(use){
                case "1":
                if(mercedesFactory.getCar().getIsEngineRunning()){
                    System.out.println("Engine has been running already!");
                }else{
                    mercedesFactory.getCar().runEngine();
                }
                break;
                case "2":
                if(!mercedesFactory.getCar().getIsEngineRunning()){
                    System.out.println("Engine has been stopped already!");
                }else{
                    mercedesFactory.getCar().stopEngine();
                }
                break;
                case "0":
                break;
                default:
                System.out.println("Wrong input! Retry please!");
            }
        }
    }
    public static void useCar(PeugeotFactory peugeotFactory){
        Scanner in = new Scanner(System.in);
        String use = "1";
        while(!use.equals("0")){
            System.out.println("1- Run Engine, 2- Stop Engine, 0-Exit");
            use = in.nextLine();
            switch(use){
                case "1":
                if(peugeotFactory.getCar().getIsEngineRunning()){
                    System.out.println("Engine has been running already!");
                }else{
                    peugeotFactory.getCar().runEngine();
                }
                break;
                case "2":
                if(!peugeotFactory.getCar().getIsEngineRunning()){
                    System.out.println("Engine has been stopped already!");
                }else{
                    peugeotFactory.getCar().stopEngine();
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
        while(!firstInput.equals("0")){
            System.out.println("1- Create BMW, 2- Create Mercedes, 3- Create Peugeot, 0-Exit");
            Scanner in = new Scanner(System.in);
            firstInput = in.nextLine();
            int count;
            switch(firstInput){
                case "1":
                BmwFactory bmwFactory = null;
                count = 0;
                while(count != 1){
                    System.out.println("1- Diesel, 2- Electric");
                    secondInput = in.nextLine();
                    switch(secondInput){
                        case "1":
                        bmwFactory = new BmwFactory("Diesel");
                        count++;
                        break;
                        case "2":
                        bmwFactory = new BmwFactory("Electric");
                        count++;
                        break;
                        default:
                        System.out.println("Wrong input! Retry please!");
                    }
                }
                if(bmwFactory != null)
                    useCar(bmwFactory);
                break;
                case "2":
                MercedesFactory mercedesFactory = null;
                count = 0;
                while(count != 1){
                    System.out.println("1- Diesel, 2- Electric");
                    secondInput = in.nextLine();
                    switch(secondInput){
                        case "1":
                        mercedesFactory = new MercedesFactory("Diesel");
                        count++;
                        break;
                        case "2":
                        mercedesFactory = new MercedesFactory("Electric");
                        count++;
                        break;
                        default:
                        System.out.println("Wrong input! Retry please!");
                    }
                }
                if(mercedesFactory != null)
                    useCar(mercedesFactory);
                break;
                case "3":
                PeugeotFactory peugeotFactory = null;
                count = 0;
                while(count != 1){
                    System.out.println("1- Diesel, 2- Electric");
                    secondInput = in.nextLine();
                    switch(secondInput){
                        case "1":
                        peugeotFactory = new PeugeotFactory("Diesel");
                        count++;
                        break;
                        case "2":
                        peugeotFactory = new PeugeotFactory("Electric");
                        count++;
                        break;
                        default:
                        System.out.println("Wrong input! Retry please!");
                    }
                }
                if(peugeotFactory != null)
                    useCar(peugeotFactory);
                break;
                case "0":
                in.close();
                System.out.println("Program is closed!");
                break;
                default:
                System.out.println("Wrong input! Retry please!");
            }
        }
    }
}
