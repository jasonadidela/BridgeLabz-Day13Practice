public class TestCase {
    public static void main(String[] args) {
        int x1 = 3, y1 = 4, z1 = 5;
        int x2 = 6, y2 = 10, z2 = 15;
        int x3 = 100, y3 = 400, z3 = 50;

        new intMaximumTest(x1, y1, z1).maximum();
        new intMaximumTest(x2, y2, z2).maximum();
        new intMaximumTest(x3, y3, z3).maximum();
    }
}
