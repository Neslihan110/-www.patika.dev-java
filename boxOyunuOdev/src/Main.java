public class Main {
    public static void main(String[] args) {

        Fighter marc = new Fighter ("marc" ,  15 , 100 , 90 , 50);
        Fighter alex = new Fighter ("alex"  ,  0 , 95 , 100 , 50);
        Ring r = new Ring (marc,alex , 90 , 100);
        r.run();
    }
}