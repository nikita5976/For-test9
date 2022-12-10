package proba.test9_1;

public class ProbaForEach {
    public static void main(String[] args) {
        for (char c : "Привет мир!!!".toCharArray()){
            System.out.print(c);
        }
        for (String s: args) {
         System.out.println(s);
        }
        System.out.println("начало работы блоков для break");
        System.out.println("сегодня обойдёмся без окончания с "+args.length+" го блока");
        blok_1: {
            System.out.println("работа блока 1 начата");
            blok_2: {
                System.out.println("работа блока 2 начата");
                blok_3: {
                    System.out.println("работа блока 3 начата");
                    switch (args.length) {
                        case 0 :
                            break ;
                        case 1:
                            break blok_1;
                        case 2:
                            break blok_2;
                        case 3:
                            break blok_3;
                    }
                    System.out.println(" продолжен блок 3");
                }
                System.out.println("Продолжен блок 2");
            }
            System.out.println("продолжен блок 1");
        }
        System.out.println("завершена работа блоков мы снаружи");

    }
}
