import java.util.Scanner;
public class Player {
    private int damage;
    private int health;
    private int orjinalHealth;
    private int money;
    private String charName;
    private String name;
    private Scanner input = new Scanner(System.in);
    private Inventory inventory;

    public Player(String name) {
        this.name = name;
        this.inventory=new Inventory();
    }

    public void selectChar() {
        Samurai samurai = new Samurai();
        Knight knight = new Knight();
        Archer archer = new Archer();
        GameCharacter[] charList = {new Samurai(), new Archer(), new Knight()};
        System.out.println("Karakterler");
        System.out.println("---------------------");
        for (GameCharacter gameCharacter : charList) {
            System.out.println("ID: " + gameCharacter.getId() +
                    "\tKarakter:" + gameCharacter.getName() +
                    "\t Hasar:" + gameCharacter.getDamage() +
                    "\t Sağlık:" + gameCharacter.getHealth() +
                    "\t Para:" + gameCharacter.getMoney());
        }
        System.out.println("------------------------");
        System.out.print("Lütfen bir karakter seçiniz: ");

        int selectChar = input.nextInt();
        switch (selectChar) {
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                System.out.println("Hatalı bir seçim yaptınız, lütfen tekrar seçim yapınız.");
        }
        System.out.println("Karakter : " + this.getCharName() +
                ", Hasar : " + this.getDamage() +
                ", Sağlık : " + this.getHealth() +
                ", Para : " + this.getMoney());

    }



    public void initPlayer(GameCharacter gameCharacter) {
        this.setDamage(gameCharacter.getDamage());
        this.setHealth(gameCharacter.getHealth());
        this.setOrjinalHealth(gameCharacter.getHealth());
        this.setMoney(gameCharacter.getMoney());
        this.setCharName(gameCharacter.getName());
    }
    public void printInfo(){
        System.out.println(
                "  Silah : "+ this.getInventory().getWeapon().getName() +
                        ", Zırh : "+ this.getInventory().getArmor().getName() +
                        ", Bloklama : "+ this.getInventory().getArmor().getBlock() +
                        ", Hasarın : " + this.getTotalDamage() +
                        ", Sağlık : " + this.getHealth() +
                        ", Para : " + this.getMoney());
    }
    public static void properties(GameCharacter[] gameCharacters) {   // Karakter ozellikleri yazdırma methodu.Polymorphism!
        for (GameCharacter gameCharacter : gameCharacters) {
            System.out.println("Karakterin ID:\t" + gameCharacter.getId() + "\t\tKakterin ismi:\t" + gameCharacter.getName()
                    + "\t\tKarakterin hasari:\t" + gameCharacter.getDamage() + "\t\tKarakterin cani:\t"
                    + gameCharacter.getHealth() + "\t\tKarakterin parasi:\t" + gameCharacter.getMoney());
        }
    }
    public int getTotalDamage(){
        return damage;
    }

    public int getDamage() {
        return damage + this.getInventory().getWeapon().getDamage();
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        if (health<0){
            health=0;
        }
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player(Inventory inventory) {
        this.inventory = inventory;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getOrjinalHealth() {
        return orjinalHealth;
    }

    public void setOrjinalHealth(int orjinalHealth) {
        this.orjinalHealth = orjinalHealth;
    }
}
