package ContolThreadExecution;

public class DemoThread implements Runnable{
    String name;
    Thread thread;

    DemoThread(String name){
        this.name = name;

        thread = new Thread(this,this.name);

        System.out.println("New Thread : "+ thread);

        thread.start();
    }
    public void run() {
        try {
            for (int i=5;i>0;i--){
                System.out.println("Child Thread : "+i);

                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(name+" Exiting");
    }
}
