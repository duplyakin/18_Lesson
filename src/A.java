/**
 * Created by Vlad on 09.12.2016.
 */
public class A implements I1, I2{
    @Override
    public void run() {
        I1.super.run();

        new Runnable() {
            @Override
            public void run() {
                A.this.run();//говорим что зовём не  public void run()
            }
        }


    }

    public static void main(String[] args) {
        new A().run();
    }
}
