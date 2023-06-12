package ContolThreadExecution;

public class MultiThreadImp1 {
    public static void main(String[] args) {

        DemoThread t1 = new DemoThread("ONE");
        DemoThread t2 = new DemoThread("TWO");
        DemoThread t3 = new DemoThread("THREE");

        System.out.println("Thread one is alive: "+ t1.thread.isAlive());
        System.out.println("Thread Two is alive: "+ t2.thread.isAlive());
        System.out.println("Thread Three is alive: "+ t3.thread.isAlive());


        try{

            System.out.println("Waiting for child thread to finish");
            t1.thread.join();
            t2.thread.join();
            t3.thread.join();

        }catch(Exception e){

            System.out.println("Main thread Interrupted");

        }


        System.out.println("Thread one is Alive :"+t1.thread.isAlive());
        System.out.println("Thread Two is Alive :"+t2.thread.isAlive());
        System.out.println("Thread Three is Alive :"+t3.thread.isAlive());

        System.out.println("Main Thread Exiting");
    }
}
