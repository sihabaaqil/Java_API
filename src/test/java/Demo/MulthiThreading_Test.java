package Demo;

public class MulthiThreading_Test extends  Thread{
    @Override
    public void run(){
        System.out.println("running");
    }
    public static void main(String[] args){

        MulthiThreading_Test obj =new MulthiThreading_Test();
        obj.setPriority(15);
        obj.start();
    }
    //MulthiThreading_Test MultiThreading_Test


}
