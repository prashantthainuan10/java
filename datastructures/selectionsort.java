//package datastructures;

public class selectionsort {
    public static void main(String[] args) {
        int[] nums={46,2,6,5,1};
        int size=nums.length;
        int temp=0;
        int min=0;
        for(int i=0;i<size-1;i++ ){
            for(int j =i;j<size;j++){
                 min = nums[j];
                if(nums[j]<nums[j+1]){
                    min=nums[j];
                }
                else{
                    min=nums[j+1];
                }
            }
            temp=nums[i];
            nums[i]=min;
            min=temp;
        }
        System.out.println();
        System.out.println("sorted aray");
        for(int ele:nums){
            System.out.println(ele +"");
        }
    }
}
