package com.example.rccflatslabdesign;

public class centralStore {
    private static centralStore mInstance;
    public static synchronized centralStore getInstance() {
        if (mInstance != null) {
            return mInstance;
        } else {
            return new centralStore();
        }
    }

    public static double roundup(double value,double roundupdigit){
        int roundup = (int) Math.pow(10,Math.abs(roundupdigit));
        int m = (int)Math.ceil(value);  //100
        int y = m % roundup;   // 71
        if(y == 0){
            return m;
        }
        else{
            m = m / roundup;  //1
            m = m + 1;     //2
            m = m * roundup;    //200
            return m;
        }
    }


    public static double ROUNDDOWN(double v, int i) {
        int returnv = (int) v;
        i = Math.abs(i) * 10 ;
        returnv = returnv / i;  //205 / 10 = 20;
        return returnv * i; // 20 * 10 = 200
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}
