import static java.lang.Thread.sleep;

public class Thread0 extends Thread {
    int taken;
    int count;
    String name;

    private Object main;


    Thread0(int x, String name) {
        super();
        taken = x;
        this.name = name;
    }

    public Thread0() {

    }

    public void run() {
        synchronized (Number3.monitor) {
            while (Number3.money >= taken) {
                Number3.money = Number3.money - taken;
                System.out.println(name + " Взять " + taken + " Со счета. У вас осталось " + Number3.money + " долларов ");
                count++;
                try {
                    sleep(900);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}



