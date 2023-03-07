package Utlity;

public class MyFunc {


    public static void Wait(int sn)
    {
        try {
            Thread.sleep(500*sn); // ms beklediği
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }



}
