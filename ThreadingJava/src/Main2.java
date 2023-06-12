public class Main2 extends Thread {
    public void run(){
        for (int i=0;i<5;i++){
            if(i%2==0){
            System.out.println("i: "+i);
            try{
            Thread.sleep(1000);
        }catch(Exception a){
                System.out.println(a);
                }
            }
        }
    }
    public static void main(String[] args) {
        Main2 t1 = new Main2();
        t1.start();
    }
}
