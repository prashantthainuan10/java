//package datastructures;

public class selectionsort {
    public static void main(String[] args) {

        int[] nums = {46, 2, 6, 5, 1};
        int size = nums.length;

        for (int i = 0; i < size - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < size; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }

        System.out.println("Sorted Array");

        for (int ele : nums) {
            System.out.print(ele + " ");
        }
    }
}