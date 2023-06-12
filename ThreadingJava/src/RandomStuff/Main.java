package RandomStuff;

import java.util.concurrent.ExecutionException;

import static java.lang.Thread.*;

public class Main implements Runnable {
     public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("HI");
            try {
//                sleep(500);
            } catch (Exception e) {
            }
        }
    }
    public static void main(String[] args)  {
        Main m1 = new Main();
        Main m2 = new Main();
        Thread t1= new Thread(m1){
             public void run(){
                for (int i=0;i<50;i++){
                    System.out.println("HELLO");
//                    try{sleep(500);}catch(Exception e){};
                }
            }
        };
        Thread t2= new Thread(m2);
        t1.setName("First Thread");
        t2.setName("Second Thread");
//        t2.setPriority(MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
                    try{sleep(500);}catch(Exception e){};

        t2.start();
    }
}

