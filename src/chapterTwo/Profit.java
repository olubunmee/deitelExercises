package chapterTwo;

import java.util.Arrays;

public class Profit {
    public static void main(String[] args) {
/*        int [] stockPrices = {7, 7, 5, 3, 6, 7, 8, 4};
        int profit = 0;

        for (int i = 0; i < stockPrices.length - 1; i++) {
            if (stockPrices[i] < stockPrices[i + 1])
                profit += (stockPrices[i + 1] - stockPrices[i]);
        }
        System.out.println(profit);*/

        /*int [] array = {1,1,2,3,4,4,5,6,6};
        System.out.println(Arrays.toString(removeDuplicates(array)));*/

        int [] array = {0, 1, 0, 3, 1, 2};
        for (int i = 0; i < array.length; i++) {
            int temp = 0;
            if (array[i] == 0)
                array[i] = temp;
                temp = array[i +1];
                array[i + 1] = array[i];
        }
        System.out.println(Arrays.toString(array));

    }

/*    public static int[] removeDuplicates(int[] arr) {
		int j = 0;
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
		}
		return arr;
	}*/

/*    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }*/
}
