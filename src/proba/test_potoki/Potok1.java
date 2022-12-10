package proba.test_potoki;

import java.util.concurrent.atomic.AtomicInteger;

class Potok1 extends Thread {
     @Override
    public  synchronized void run() {
         for (int i=1;i<1000; ++i ){
            System.out.print(" "+i);
            i=i+1;
        }
        System.out.println(" \n кончены цифры");
    }
}
