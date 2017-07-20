/**
 * Created by naraykan on 20/07/17.
 */
public class Logic {
    public void startShit(final View view) {
        System.out.println(System.currentTimeMillis() + " startShit");
        Thread t = new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            view.display();
        });
        t.start();
    }

    public static void main(String args[]) {
        new Logic().startShit(new View());
    }
}
