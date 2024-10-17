public class DIY6 {
    public static void main(String[] args) {
        String[] colors = {"Red", "Green", "Blue"};
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (String color : colors) {
            System.out.println(color);
        }

        for (int num : nums) {
            sum += num;
        }
        System.out.println(sum);
    }
}