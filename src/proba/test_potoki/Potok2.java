package proba.test_potoki;

public class Potok2 extends Thread {
    @Override
  public synchronized   void run (){
        for (int i=32; i<1000; ++i){
            char ch = (char) i;
            System.out.print(" "+ch);
        }
        System.out.println(" \n кончены символы");
    }
}
