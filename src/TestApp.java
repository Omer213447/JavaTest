import java.util.Scanner;

public class TestApp {
    public static void main(String[] args) throws Exception {
        String input = " ", secondInput;
        while(!input.equals("0")){
            System.out.println("1- Create BMW, 2- Create Mercedes, 3- Create Peugeot, 0-Exit");
            Scanner in = new Scanner(System.in);
            input = in.nextLine();
            int count;
            switch(input){
                case "1":
                BmwFactory bmwFactory;
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
                break;
                case "2":
                MercedesFactory mercedesFactory;
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
                break;
                case "3":
                PeugeotFactory peugeotFactory;
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
