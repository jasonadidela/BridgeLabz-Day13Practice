public class stringMaximumTest {
    String x, y, z;

    public stringMaximumTest(String x, String y, String z){

        this.x = x;
        this.y = y;
        this.z = z;
    }
    public String maximum(){
        return stringMaximumTest.maximum(x, y, z);
    }

    public static String maximum(String x, String y, String z) {
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
    public static void printMax(String x, String y, String z, String max){
        System.out.printf("Max of %s, %s and %s is %s\n", x, y, z, max);
    }
}