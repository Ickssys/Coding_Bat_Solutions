public int sumDigits(int n){
    int digit;
    if(n == 0){
        return 0;
    }
    digit = n % 10;
    return digit + sumDigits(n/10);
}