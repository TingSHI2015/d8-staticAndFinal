package secondTry;

import static secondTry.Calculator.add;
import static secondTry.Counters.getTotalCount;
import static secondTry.Counters.incrementTotalCount;

public class Main {
    public static void main(String[] args){

        incrementTotalCount();
        incrementTotalCount();
        incrementTotalCount();
        System.out.println(getTotalCount());

        Counters c1 = new Counters();
        Counters c2 = new Counters();
        c1.incrementInstanceCount();
        c1.incrementInstanceCount();
        System.out.println(c1);  //instance can use toString()
        System.out.println(c2);  //instance can use toString()

    //--------Bonus-------------
        //---error:--- add method is static. Wir don't need an instance to use it!
/*        Calculator calculator1 = new Calculator();
        System.out.println(calculator1.add(100,200));*/

        System.out.println(add(100,200));
        System.out.println(add(300,400));















    }
}
