public class TestCase {

    public static void main(String[] args) {

        int x1 = 3, y1 = 4, z1 = 5;
        int x2 = 6, y2 = 10, z2 = 15;
        int x3 = 100, y3 = 400, z3 = 50;

        new intMaximumTest(x1, y1, z1).maximum();
        new intMaximumTest(x2, y2, z2).maximum();
        new intMaximumTest(x3, y3, z3).maximum();

        float x4 = 3.3f, y4 = 4.3f, z4 = 5.5f;
        float x5 = 6.6f, y5 = 10.7f, z5 = 15.6f;
        float x6 = 10.02f, y6 = 4.2f, z6 = 50.3f;

        new floatMaximumTest(x4, y4, z4).maximum();
        new floatMaximumTest(x5, y5, z5).maximum();
        new floatMaximumTest(x6, y6, z6).maximum();


        String x7 = "Apple", y7 = "Banana", z7 = "Pear";
        String x8 = "Car", y8 = "Bus", z8 = "Cycle";
        String x9 = "Delhi", y9 = "America", z9 = "Australia";

        new stringMaximumTest(x7, y7, z7).maximum();
        new stringMaximumTest(x8, y8, z8).maximum();
        new stringMaximumTest(x9, y9, z9).maximum();
    }
}