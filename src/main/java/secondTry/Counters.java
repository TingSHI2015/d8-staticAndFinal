package secondTry;

public class Counters {
    private static int totalCount = 0;
    private int instanceCount = 0;

    //-----constructor only with instance variables, without static variables!
/*    public Counters(int instanceCount) {
        this.instanceCount = instanceCount;
    }*/

    public static int getTotalCount() {
        return totalCount;
    }      //Getter also with 'static'!

    public static void setTotalCount(int totalCount) {
        Counters.totalCount = totalCount;
    } //Setter also with 'static'!

    public int getInstanceCount() {
        return instanceCount;
    }

    public void setInstanceCount(int instanceCount) {
        this.instanceCount = instanceCount;
    }

    @Override
    public String toString() {
        return "Counters{" +
                "totalCount=" + totalCount +
                "instanceCount=" + instanceCount +
                '}';
    }


    //------methods----
    //void! if need the value, use 'Getter'!
    public static void incrementTotalCount(){           // also static!!!
        totalCount += 1;      // totalCount = totalCount + 1; // totalCount ++;
    }

    public void incrementInstanceCount(){
        instanceCount += 1;      // instanceCount = instanceCount + 1; //instanceCount ++;
    }




}
