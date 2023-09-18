public int[] post4(int[] nums){
    boolean seenFour = false;
    int count = 0; 
    int idx = 0;

    for(int i = 0; i < nums.length; i++){
        //check if current element is a 4;
        if(nums[i] == 4){
            seenFour = true;
            idx = i;
        }
        //check if current element is a four and we've seen a four;
        if(nums[i] != 4 && seenFour){
            count++;
        }else{
            count = 0;
        }
    }
    //create new Array size count;
    int[] nA = new int[count];
    for(int i = idx + 1, j = 0; i < nums.length; i++){
        //populate new array with every number after last four seen;
        nA[j] = nums[i];
        j++;
    }
    return nA;
}