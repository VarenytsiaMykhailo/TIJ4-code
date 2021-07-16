import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        new Car();
        new Car2();
        A a = new A();

        System.out.println(B.str1);
        System.out.println(A.str1);
        System.out.println(a.str1);

        A[] arr = new A[22];
        System.out.println(arr[2].str1); // Статическое поле доступно, даже если по ссылке хранится null
        //System.out.println(arr[2].c); // NPE
        System.out.println(arr);
        int[] arr2 = {1, 2,};
        System.out.println(Arrays.toString(arr2));
    }
}
