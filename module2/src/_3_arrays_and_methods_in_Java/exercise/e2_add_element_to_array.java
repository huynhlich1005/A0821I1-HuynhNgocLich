package arrays_and_methods_in_Java.exercise;

public class e2_add_element_to_array {
    public static void main(String[] avgs) {
        int size = 20;
        int[] arr = new int[size];
        arr[0] = 1;
        arr[1] = -1;
        arr[2] = 6;
        arr[3] = 5;
        arr[4] = 3;
        int n = 5;
        int x = 10;
        System.out.print("Truoc khi them: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        int postision = 3;
        n = insertToPos(arr, size, n, x, postision);
        System.out.print("\nSau khi them: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    static int insertToPos(int[] arr, int size, int n, int x, int postision) {

            if (n >= size) {
                return n;
            }

            if (postision < 0 || postision > n) {
                return n;
            }

            for(int i = n; i > postision; i--) {
                arr[i] = arr[i - 1];
            }

            arr[postision] = x;
            return n + 1;
        }

}

