public class MaxSum {
    public static void maxsum(int maxint, int value) {
        int result = 0;
        int i = 0;

        if (value < 0) {
            value = -value;
        }

        while (i < value && result <= maxint) {
            i++;
            result++;
        }

        if (result <= maxint) {
            System.out.println(result);
        } else {
            System.out.println("too large");
        }
    }

    public static void main(String[] args) {
        maxsum(10, 5);
    }
}
