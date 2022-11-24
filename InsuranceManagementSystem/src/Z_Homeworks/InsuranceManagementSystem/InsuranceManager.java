package Z_Homeworks.InsuranceManagementSystem;

import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

public class InsuranceManager {
    InsuranceManager(){}

    public Z_Homeworks.InsuranceManagmentSystem.Insurance createInsurance(Z_Homeworks.InsuranceManagementSystem.User user){
        Scanner scn = new Scanner(System.in);
        System.out.println("Select one type of Insurance : ");
        System.out.println("1-) Health\n2-) Residence\n3-) Travel\n4-) car");
        String choice = scn.nextLine();
        System.out.print("Enter amount : ");
        double price = scn.nextInt();

        if(choice.equals("1")) return new HealthInsurance(user, "Health Insurace", price*1.23, Date.from(Instant.now()));
        if(choice.equals("2")) return new ResidenceInsurance(user, "Residence Insurace", price*1.32, Date.from(Instant.now()));
        if(choice.equals("3")) return new TravelInsurance(user, "Travel Insurace", price*2.4, Date.from(Instant.now()));
        return new CarInsurance(user,"Car Insurace", price*1.62, Date.from(Instant.now()));

    }
}

class HealthInsurance extends Z_Homeworks.InsuranceManagmentSystem.Insurance {

    HealthInsurance(User user, String name, double price, Date date) {
        super(user,name, price, date);
    }
    @Override
    public double calculate(){
        return super.getPrice();
    }
}

class ResidenceInsurance extends Z_Homeworks.InsuranceManagmentSystem.Insurance {

    ResidenceInsurance(User user,String name, double price, Date date) {
        super(user, name, price, date);
    }
    @Override
    public double calculate(){
        return super.getPrice();
    }
}

class TravelInsurance extends Z_Homeworks.InsuranceManagmentSystem.Insurance {

    TravelInsurance(User user,String name, double price, Date date) {
        super(user, name, price, date);
    }
    @Override
    public double calculate(){
        return super.getPrice();
    }
}

class CarInsurance extends Z_Homeworks.InsuranceManagmentSystem.Insurance {

    CarInsurance(User user,String name, double price, Date date) {
        super(user, name, price, date);
    }

    @Override
    public double calculate(){
        return super.getPrice();
    }
}