public class Main {
    public static void main(String[] args) {
        String[] arr = new String[22];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = "str" + i;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        A[] arr2 = new A[22];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = new A(i + "");
        }

        // arr2.length = 2; // нельзя т.к. final

        System.out.println(int[].class);
        System.out.println(Integer.class);
    }
}
