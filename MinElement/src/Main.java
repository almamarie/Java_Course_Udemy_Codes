import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int[] tmpArray = {1, 2, 3, 4, 5};
        reverse(tmpArray);
    }


    public static int readInteger(){
        return scanner.nextInt();
    }

    public static int[] readElements(int count){
        int[] arrays = new int[count];
        for(int i = 0; i < count ; i++){
            arrays[i] = scanner.nextInt();
        }

        return arrays;
    }

    public static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }

        return min;
    }


    private static void reverse(int[] array){
        System.out.println("Array = " + Arrays.toString(array));
        int[] tmp = new int[array.length];

        System.arraycopy(array, 0, tmp, 0, array.length);

        int count = array.length - 1;
        for(int i = array.length - 1; i >= 0; i-- ){
            array[(array.length - i) - 1] = tmp[i];
        }
        System.out.println("Array = " + Arrays.toString(array));

    }


}
