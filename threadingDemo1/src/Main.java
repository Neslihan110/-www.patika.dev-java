public class Main {
    public static void main(String[] args) {
        kronometreThread thread1= new kronometreThread("thread1");

        kronometreThread thread2= new kronometreThread("thread2");

        kronometreThread thread3= new kronometreThread("thread3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}