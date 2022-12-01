public class MaximumTest<T extends Comparable<T>> {

    T x, y, z;

    public MaximumTest(T x, T y, T z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T maximum(){
        return MaximumTest.maximum(x, y, z);
    }
    public static <T extends Comparable<T>> T maximum(T x, T y, T z){
        T max = x;
        if(y.compareTo(max) > 0){
            max = y;
        }
        if(z.compareTo(max) > 0){
            max = z;
        }
        printMax(x, y, z, max);
        return max;
    }

    public static String testMaximum(String x, String y, String z){
        String max = x;
        if(y.compareTo(max) > 0){
            max = y;
        }
        if(z.compareTo(max) > 0){
            max = z;
        }
        printMax(x, y, z, max);
        return max;
    }
    public static <T> void printMax(T x, T y, T z, T max){

        System.out.printf("Max of %s, %s and %s is %s\n", x, y, z, max);
    }
    public static void main(String[] args){
        Integer xInt = 3, yInt = 4, zInt = 5;
        Float xFl = 6.6f, yFl = 8.8f, zFl = 7.7f;
        String xStr = "Orange", yStr = "Apple", zStr = "Pear";

		MaximumTest.testMaximum(xStr, yStr, zStr);
        new MaximumTest(xInt, yInt, zInt).maximum();
        new MaximumTest(xFl, yFl, zFl).maximum();
        new MaximumTest(xStr, yStr, zStr).maximum();
    }
}