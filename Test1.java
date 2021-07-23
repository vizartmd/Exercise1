package main.java;

public class Test1 {

    public int birthdayCakeCandles(int[] arr) {
        int maxInt = 0;
        int countMaxCandleHeight = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxInt) {
                maxInt = arr[i];
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == maxInt)  {
                countMaxCandleHeight++;
            }
        }
        return  countMaxCandleHeight;
    }

    public static void main(String[] args) {
        int[] candles;
        candles = new int[] {9, 62, 4, 12, 62, 62, 3, 12, 12, 62, 62, 12, 62};
        Test1 test = new Test1();
        int res = test.birthdayCakeCandles(candles);
        System.out.println(res);
    }
}
