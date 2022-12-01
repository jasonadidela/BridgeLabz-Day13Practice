public class floatMaximumTest {
    float x, y, z;

    public floatMaximumTest(float x, float y, float z){

        this.x = x;
        this.y = y;
        this.z = z;
    }
    public float maximum(){
        return floatMaximumTest.maximum(x, y, z);
    }

    public static float maximum(float x, float y, float z) {
        float max = x;
        if(y > x){
            max = y;
        }
        if(z > x){
            max = z;
        }
        printMax(x, y, z, max);
        return max;
    }
    public static void printMax(float x, float y, float z, float max){
        System.out.printf("Max of %.2f, %.2f and %.2f is %.2f\n", x, y, z, max);
    }
}