public class DuplicateArray {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 2, 4, 9, 7, 7};

        

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break; 
                }
            }
        }
    }
}
