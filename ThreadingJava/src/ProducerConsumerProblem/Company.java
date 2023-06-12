package ProducerConsumerProblem;

public class Company {

    boolean flag = false;
    int n;
    synchronized public void produced_items(int n) throws InterruptedException {
        if(flag){
        wait();

    }
        this.n = n;
        System.out.println("Produced Item : "+n);
        flag = true;
        notify();

    }


    synchronized public int consumed_items() throws InterruptedException {
        if (!flag) {
            wait();


        }

        System.out.println("Consumed Item : " + n);
        flag = false;
        notify();
        return this.n;

    }
}
