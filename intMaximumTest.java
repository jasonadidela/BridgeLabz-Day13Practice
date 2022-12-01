public class intMaximumTest {

        int x, y, z;

    public intMaximumTest(int x, int y, int z){

            this.x = x;
            this.y = y;
            this.z = z;
        }
        public int maximum(){
            return intMaximumTest.maximum(x, y, z);
        }

        public static int maximum(int x, int y, int z) {
            int max = x;
            if(y > x){
                max = y;
            }
            if(z > x){
                max = z;
            }
            printMax(x, y, z, max);
            return max;
        }
        public static void printMax(int x, int y, int z, int max){
            System.out.printf("Max of %d, %d and %d is %d\n", x, y, z, max);
    }
}
