package Threads;

public class MyThread implements Runnable{
    Thread th;
    MyThread(String name){
        th = new Thread(this, name);
        th.start();
    }

    @Override
    public void run(){
        System.out.println(th.getName() + " starting.");
        try{
            for(int i = 0; i < 10; i++){
                Thread.sleep(400);
                System.out.println("In " + th.getName() + ",count is " + i);
            }
        } catch (InterruptedException e){
            System.out.println(th.getName() + " is interrupted.");
        }
        System.out.println(th.getName() + " is terminating.");
    }
}
