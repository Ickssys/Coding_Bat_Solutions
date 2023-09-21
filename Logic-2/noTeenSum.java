public  int noTeenSum(int a, int b, int c){
    int newA = fixTeen(a);
    int newB = fixTeen(b);
    int newC = fixTeen(c);

    return newA + newB + newC;
}

public  int fixTeen(int n){
    if((n != 15 && n != 16) && (13 <= n && n <= 19)){
        n = 0;
    }
    return n;
}