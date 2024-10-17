
public class DIY4 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40};
        nums[2] = 35; // Modifies the second element

        // Displaying modified array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}