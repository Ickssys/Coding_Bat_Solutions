public  int[] midThree(int[] nums){
     int[] newArr = new int[3]; 
     newArr[0] = nums[nums.length/2 - 1];
     newArr[1] = nums[nums.length/2];
     newArr[2] = nums[nums.length/2 + 1];
     
     return newArr;
   }