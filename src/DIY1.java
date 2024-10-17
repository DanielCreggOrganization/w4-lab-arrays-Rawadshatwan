public class DIY1 {
    public static void main(String[] args) {
        int[] intArray = new int[3];
        char[] charArray = new char[4];
        String[] stringArray = new String[3];

        System.out.println("Default int values:");
        for (int num : intArray) {
            System.out.print(num + " ");
        }

        System.out.println("Default Char values:");
        for (char num : charArray) {
            System.out.print(num + " ");
        }

        System.out.println("\nDefault String values:");
        for (String str : stringArray) {
            System.out.print(str + " ");
        }
    }
}