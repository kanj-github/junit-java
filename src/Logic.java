/**
 * Created by naraykan on 20/07/17.
 */
public class Logic {
    private View mView;

    public Logic(View view) {
        this.mView = view;
    }

    public void startShit() {
        System.out.println(System.currentTimeMillis() + " startShit");
        Thread t = new Thread(() -> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            mView.display();
        });
        t.start();
    }

    public static void main(String args[]) {
        new Logic(new View()).startShit();
    }
}
