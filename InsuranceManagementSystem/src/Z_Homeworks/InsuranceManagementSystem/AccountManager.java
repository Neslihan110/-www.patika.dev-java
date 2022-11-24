package Z_Homeworks.InsuranceManagementSystem;
import java.util.Scanner;
import java.util.TreeSet;

public class AccountManager {
    TreeSet<Z_Homeworks.InsuranceManagementSystem.Account> accounts;
    User currentUser;
    Z_Homeworks.InsuranceManagementSystem.Account account;
    AccountManager() throws Z_Homeworks.InsuranceManagementSystem.InvalidAuthenticationException {
        accounts = new TreeSet<>();
        run();
    }

    public void run() throws Z_Homeworks.InsuranceManagementSystem.InvalidAuthenticationException {
        Scanner scn = new Scanner(System.in);
        String choice = "GO";
        while(!choice.equals("3")){
            System.out.println("1-) Create an Account");
            System.out.println("2-) Login to Account");
            System.out.println("3-) Quit");
            System.out.println("4-) Admin Login");
            System.out.print("Choice : ");
            choice = scn.nextLine();

            if(choice.equals("1"))
                createAccount();

            else if(choice.equals("2")){
                System.out.print("Enter email : ");
                String email = scn.nextLine();
                System.out.print("Enter password : ");
                String password = scn.nextLine();

                login(email, password);
            }
            else if(choice.equals("4")){
                System.out.println("Printing all accounts and passwords in the system ...");
                for(Z_Homeworks.InsuranceManagementSystem.Account a : getAccounts())
                    System.out.println("Email : "+ a.getUser().getEmail() + " Password : " + a.getUser().getPassword());

                System.out.println("Printing all InsuranceList in the system ...");
                for(Z_Homeworks.InsuranceManagmentSystem.Insurance a : User.getInsuranceList())
                    System.out.println("Customer name : "+a.getCustomerName()+" Insurance Name : "+a.getName() + " Total Price : " + a.getPrice()+"\n");

            }
        }

    }

    public void createAccount(){
        Scanner scn = new Scanner(System.in);

        String name, surname, email, password, job, age;
        System.out.print("Enter name : "); name = scn.nextLine();
        System.out.print("Enter surname : "); surname = scn.nextLine();
        System.out.print("Enter email : "); email = scn.nextLine();
        System.out.print("Enter password : "); password = scn.nextLine();
        System.out.print("Enter job : "); job = scn.nextLine();
        System.out.print("Enter age : "); age = scn.nextLine();
        User user = new User(name, surname, email, password, job, age);

        System.out.println("Are you individual (1 for yes 0 for no) : ");
        name = scn.nextLine();
        Z_Homeworks.InsuranceManagementSystem.Account prop;
        if(name.equals("1")){
            prop = new Z_Homeworks.InsuranceManagementSystem.Individual(user);
        }
        else{
            prop = new Z_Homeworks.InsuranceManagementSystem.Enterprise(user);
        }
        accounts.add(prop);
    }

    public void login(String email, String password) throws Z_Homeworks.InsuranceManagementSystem.InvalidAuthenticationException {
        for (Z_Homeworks.InsuranceManagementSystem.Account account : accounts){
            account.login(email, password);
            if (account.isLogin()){
                currentUser = account.getUser();
                this.account = account;
                // 1 => enterprise 0 => individual
                if (account.getType() == 1)
                    individualUserProcess();
                else
                    individualUserProcess();// what is difference ? enterpriseUserProcess();

                break;
            }
        }

    }

    public void individualUserProcess(){
        System.out.println("Welcome Mr. " + currentUser.getName());
        String choice = "1";
        while(!choice.equals("q")){
            Scanner scn = new Scanner(System.in);

            System.out.println("\n1-) Show my infos");
            System.out.println("2-) Get Insurance");
            System.out.println("3-) Show Insurance List");
            System.out.println("4-) Add Address");
            System.out.println("5-) Show All Address");
            choice = scn.nextLine();

            AddressManager AddressManager = new AddressManager();
            if(choice.equals("1")){
                account.showUserInfo();
            }else if(choice.equals("2")){
                InsuranceManager insuranceManager = new InsuranceManager();
                account.addInsurance(insuranceManager.createInsurance(currentUser));
            }else if(choice.equals("3")){
                for (Z_Homeworks.InsuranceManagmentSystem.Insurance insurance : account.getUser().getInsuranceList()){
                    System.out.print("\n\nName : " + insurance.getName());
                    System.out.println("Price : " + insurance.getPrice());
                }
            }else if(choice.equals("4"))
                account.addAddress(new AddressManager.createAddress());
            else if(choice.equals("5")){
                for (Z_Homeworks.InsuranceManagementSystem.Address adr : currentUser.getAddressList()){
                    System.out.println(adr.getAddress());
                }
            }
        }

    }
    public void enterpriseUserProcess(){

    }
    public TreeSet<Z_Homeworks.InsuranceManagementSystem.Account> getAccounts(){
        return accounts;
    }

    static class AddressManager {
        public static class createAddress implements Z_Homeworks.InsuranceManagementSystem.Address {
            @Override
            public String getAddress() {
                return null;
            }

            @Override
            public void setAddress(String address) {

            }
        }
    }
}