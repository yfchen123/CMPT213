package Threads;

public class MoreThreads {
    public static void main(String[] args) {
        System.out.println("Main Thread Starting.");
        MyThread th1 = new MyThread("Child #1");
        MyThread th2 = new MyThread("Child #2");
        MyThread th3 = new MyThread("Child #3");
        for(int i = 0; i < 50; i++){
            System.out.println(".");
            try{
                Thread.sleep(100);
            } catch (InterruptedException e){
                System.out.println("Main Thread interrupted.");
            }
        }
        System.out.println("Main Thread ending.");
    }
}
