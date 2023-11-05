public int makeChocolate(int small, int big, int goal){
    int use;
    if(goal >= 5 * big){
        use = goal - (5 * big);
    }else{
        use = goal % 5;
    }
    return use <= small ? use : -1;
}