public static int bunnyEars2(int bunnies){
    int oddOrEven = bunnies % 2 != 0 ? 2 : 3;
    //base case
    if(bunnies == 0){
        return 0;
    }
    return oddOrEven + bunnyEars2(bunnies - 1);
}