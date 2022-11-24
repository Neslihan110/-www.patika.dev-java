import java.util.Scanner;

class HomeAddress implements Z_Homeworks.InsuranceManagementSystem.Address {
    private String address;

    public HomeAddress(String address){
        this.address = address;
    }

    @Override
    public void setAddress(String address){
        this.address = address;
    }

    @Override
    public String getAddress() {
        return address;
    }


}

class BusinessAddress implements Z_Homeworks.InsuranceManagementSystem.Address {

    @Override
    public void setAddress(String address){

    }
    @Override
    public String getAddress() {
        return null;
    }
}


public class AddressManager{

    public static void addAddress(Z_Homeworks.InsuranceManagementSystem.User user, Z_Homeworks.InsuranceManagementSystem.Address address){
        user.getAddressList().add(address);
    }

    public static void removeAddress(Z_Homeworks.InsuranceManagementSystem.User user, Z_Homeworks.InsuranceManagementSystem.Address address){
        user.getAddressList().remove(address);
    }

    public static Z_Homeworks.InsuranceManagementSystem.Address createAddress(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter address : ");
        String adr = scn.nextLine();
        return new HomeAddress(adr);


    }
}