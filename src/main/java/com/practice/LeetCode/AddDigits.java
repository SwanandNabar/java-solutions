package practice.LeetCode;

public class AddDigits {
    public static int addDigits(int num) {
        int result = 0;
        while (num > 0 || result > 9) {
            if (num == 0) {
                num = result;
                result = 0;
            }
            result += num % 10;
            num = num / 10;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(addDigits(89));
    }
}
