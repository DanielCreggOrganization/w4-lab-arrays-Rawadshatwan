public class DIY3 {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20};

        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[numbers.length - 1]);

        System.out.println("Using traditional for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        System.out.println("Using enhanced for loop:");
        for (int num : numbers) {
            System.out.println(num);
        }


        System.out.println("Using traditional for loop:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
   }
}   
