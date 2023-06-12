public class Main implements Runnable{
    // custom thread using runnable interface
    public void run(){
        for (int i=0;i<=10;i++){
            System.out.println("i : "+i);
        }
    }
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Main m1 = new Main();
        Thread t1 = new Thread(m1);
        t1.start();
    }
}