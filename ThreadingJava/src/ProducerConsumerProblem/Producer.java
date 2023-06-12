package ProducerConsumerProblem;

public class Producer extends Thread{

    Company c;

    Producer(Company c){
        this.c = c;
    }

    public void run(){
        int i = 1;

        while(true){
            try {
                this.c.produced_items(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try{Thread.sleep(1000);}catch(Exception e){
                System.out.println(e);
            }
            i++;
        }
    }
}
