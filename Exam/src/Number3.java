public class Number3 {
    public static volatile int money = 1000;
    public static Object monitor = new Object();
    public static void main(String[] args) throws InterruptedException {
        Thread0 ob1 = new Thread0(100, "Arax");
        Thread0 ob2 = new Thread0(70, "Netflix");
        Thread0 ob3 = new Thread0(10, "Spotify");
        Thread0 ob4 = new Thread0(50, "Disney+");
        ob1.start();
        ob2.start();
        ob3.start();
        ob4.start();

//            if(Thread1.currentThread().isAlive()){
//                try {
//                    Thread1.currentThread().wait(100);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }

        if(ob1.isInterrupted() && ob2.isInterrupted() && ob3.isInterrupted() && ob4.isInterrupted()){
            ob1.notify();
            ob2.notify();
            ob3.notify();
            ob4.notify();
        }
        if(!ob1.isAlive() && !ob2.isAlive() && !ob3.isAlive() && !ob4.isAlive()){
            System.out.println(ob1.name + ob1.count);
            System.out.println(ob2.name + ob2.count);
            System.out.println(ob3.name + ob3.count);
            System.out.println(ob4.name + ob4.count);
        }
    }
}