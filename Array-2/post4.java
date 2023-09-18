public int[] post4(int[] nums){
    boolean seenFour = false;
    int count = 0; 
    int idx = 0;

    for(int i = 0; i < nums.length; i++){
        if(nums[i] == 4){
            seenFour = true;
            idx = i;
        }
        if(nums[i] != 4 && seenFour){
            count++;
        }else{
            count = 0;
        }
    }
    int[] nA = new int[count];
    for(int i = idx + 1, j = 0; i < nums.length; i++){
        nA[j] = nums[i];
        j++;
    }
    return nA;
}