package ProducerConsumerProblem;

public class Consumer extends Thread{

    Company c;

    Consumer(Company c){
        this.c = c;
    }
    public void run(){
        while(true){
            try {
                this.c.consumed_items();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try{Thread.sleep(3000);}catch(Exception e){};
        }
    }
}
