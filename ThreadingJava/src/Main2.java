class Main2 extends Thread {
    public void run(){
//        for (int i=10;i>0;i--){
//            System.out.println("Thread : "+ i);
//            try{
//            Thread.sleep(1000);
//        }catch(Exception a){
//                System.out.println(a);
//                }
//            }
    Thread t = Thread.currentThread();
    t.setName("Sharma thread");
        System.out.println(t.getName());
        System.out.println(t.getId());
    }
    }
