public  int[] reverse3(int[] nums) {
        int nLength = nums.length;
        int[] newArr = new int[3];
        newArr[0] = nums[nLength - 1];
        newArr[1] = nums[1];
        newArr[2] = nums[0];

        return newArr;


    }