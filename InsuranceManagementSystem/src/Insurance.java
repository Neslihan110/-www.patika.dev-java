package Z_Homeworks.InsuranceManagmentSystem;

import java.util.Date;

public abstract class Insurance {
    private final String name;
    private final double price;
    private final Date date;
    private final Z_Homeworks.InsuranceManagementSystem.User user;

    protected Insurance(Z_Homeworks.InsuranceManagementSystem.User user, String name, double price, Date date){
        this.name = name;
        this.price = price;
        this.date = date;
        this.user = user;
    }

    public double calculate(){
        return price;
    }
    public double getPrice(){return price;};
    public String getName(){return name;};
    public String getCustomerName(){return user.getName();};
}