package proba.test9;

public class Operation {
    public static void main(String[] args) {
        int a=1;
        System.out.println("a=  "+a);
        {
            int b = 2;
            a = a + b;
            System.out.println("b=  "+b);

        }
        System.out.println("a+b=  "+a);
        //System.out.println("b=  "+b);
        {
            int b = 4;
            a = a + b;
            System.out.println("b=  "+b);
        }
        System.out.println("a+b=  "+a);
        //b=5;
        //a=a+b;
        int b =3;
        a = a+b;
        System.out.println("b=  "+b);
        System.out.println("a+b=  "+a);
        int c=1;
        ProbaDostupa sum = new ProbaDostupa();
        System.out.println("сумма с предустановленными = "+sum.summa());
        System.out.println("переменная а = "+sum.a);
        //System.out.println("переменная б = "+sum.b);
        System.out.println("переменная с = "+sum.c);
        System.out.println("сумма 1+2+3 = "+sum.summa(1,2,3));
        sum.a=5;
       // sum.b=10;
        sum.c=15;
        System.out.println("сумма 5+10+15 = ? "+sum.summa());
        ProbaDostupa sum2 = new ProbaDostupa();
        System.out.println("a= "+sum2.a+" b=  "+/*sum2.b+*/" c= "+sum2.c);


    }
    {
        // j=ошибки нет но как передать сюда управление? go to нет)))
        int y = 10;
        int x= 10+y;
        System.out.println("не уверен это y  x "+y+x);
    }
}
