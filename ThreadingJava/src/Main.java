public class Main implements Runnable{
    // custom thread using runnable interface
    public void run(){
//        for (int i=0;i<=10;i++){
//            System.out.println("Runnable : "+i);
//            try{
//                Thread.sleep(1000);
//            }catch(Exception a){
//                System.out.println(a);
//            }
//        }
        Thread t = Thread.currentThread();
        t.setName("Aditya Thread");
        System.out.println(t.getName());
        System.out.println(t.getId());
    }
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Main m1 = new Main();
        Thread t1 = new Thread(m1);
        Main2 t2 = new Main2();
        t2.start();
        t1.start();
    }
}