//Solution1 - Using two for loops - O(n^2)

import java.util.*;

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    // Write your code here.
		int len = array.length;
		
		for(int i=0;i<len;i++){
			for(int j=i+1;j<len;j++){
				if(array[i]+array[j] == targetSum){
					return new int[] {array[i],array[j]};
				}
			}
		}
    return new int[0];
  }
}


// Solution 2 - Using HashSet - O(n) Time and O(n) space

import java.util.*;

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    // Write your code here.
		Set<Integer> nonDup = new HashSet<>();
		
		for(int x:array){
			int potentialMatch = targetSum - x;
			if(nonDup.contains(potentialMatch)){
				return new int[] {potentialMatch,x};
			}
			else{
				nonDup.add(x);
			}
		}
		
    return new int[0];
  }
}


// Solution3 - using sorting and twoPointer - O(nlogn) 


import java.util.*;

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    // Write your code here
		Arrays.sort(array);
		
		int leftPointer = 0;
		int rightPointer = array.length -1;
		
		while(leftPointer < rightPointer){
			int currSum = array[leftPointer] + array[rightPointer];
			if(currSum == targetSum)
				return new int[] {array[leftPointer],array[rightPointer]};
			else if(currSum < targetSum)
				leftPointer++;
			else
				rightPointer--;
		}
		
    return new int[0];
  }
}


