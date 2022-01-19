package arrays_and_methods_in_Java.exercise;

public class e3_merge_array {
    public static void main(String[] avgs){
        int [] array1 = {1,2,3};
        int [] array2 = {4,5,6};

        int length = array1.length + array2.length;
        int [] totalArray = new int[length];
        int i;

        for (i = 0; i < array1.length ; i++ ){
            totalArray[i] = array1[i];
        }
        for (i = 0; i < array2.length ; i++){
            totalArray[i +array1.length] = array2[i];
        }
        System.out.println("Array after merge: ");

        for (i = 0; i < length ; i++){
            System.out.print(totalArray[i] + "\t");
        }
    }
}
