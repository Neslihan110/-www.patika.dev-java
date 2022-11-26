import com.sun.source.tree.TryTree;

public class kronometreThread implements  Runnable{

    private  Thread thread;
    private String threadName;
    public kronometreThread(String threadName) {
        this.threadName=threadName;
        System.out.println("Oluşturuluyor :"+ threadName);
    }

    @Override
    public void run() {
        System.out.println("Oluşturuluyor :"+ threadName);

        try
        {

        for(int i=1;i<=10;i++){
            System.out.println(threadName + " : " +i);
            Thread.sleep(1000);
        }
        }catch (InterruptedException exception) {
            System.out.println("kesildi :"+ threadName);
        }
        System.out.println("Thread bitti : "+ threadName);

    }

    public void start() {
        System.out.println("Thread nesnesi oluşuyor");
        if(thread==null) {
            thread= new Thread(this, threadName);
            thread.start();
        }

    }
}
