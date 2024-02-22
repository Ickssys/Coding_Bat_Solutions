public static boolean twoTwo(int[] nums){
   int isTwoCount = 0, isTwoNext = 0;
   boolean containsTwo = false;
   for(int i = 0; i < nums.length; i++){
      if(nums[i] == 2){
         containsTwo = true;
         isTwoCount++;
         if(i < nums.length - 1 && nums[i + 1] == 2){
         isTwoNext++;
         }
      }
   }
   return (isTwoCount - isTwoNext == 1  && isTwoNext != 0) || !containsTwo;
}
