package day_3_assignment;

public class RemoveDuplicates_array {

	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 3, 4, 4,5, 5};
        int n = arr.length;
        System.out.println("Original array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nArray after removing duplicates:");
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }

	}

}