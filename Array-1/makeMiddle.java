public  int[] makeMiddle(int[] nums){
      int first = nums[nums.length/2 - 1];
      int second = nums[nums.length/2];
      int[] newArr = new int[2];
      newArr[0] = first;
      newArr[1] = second;
      
      return newArr;
   }