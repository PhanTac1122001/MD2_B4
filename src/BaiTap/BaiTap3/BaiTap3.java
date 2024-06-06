package BaiTap.BaiTap3;

import java.util.Random;




public class BaiTap3 {

    public static void main(String[] args) {

        StopWatch sw = new StopWatch();
        sw.start();
        int[] numbers = new int[10000000];
        Random rand = new Random();

        for (int i = 0; i < 10000000; i++) {
            numbers[i] = rand.nextInt(10000000);
        }


        sw.stop();

        System.out.println(sw.getElapsedTime() + " milliseconds");
    }
}
