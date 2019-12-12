public class Counter {
    private static int localCount = 0;

    public static String getCount(){
        return String.valueOf(localCount);
    }

    public static String incrCount(){
        localCount++;
        return getCount();
    }

    public static void ResetCount(){
        localCount = 0;
    }
}
