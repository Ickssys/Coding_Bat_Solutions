public int luckySum(int a, int b, int c){
        int sum = 0;
        if(a == 13){
            return sum;
        }else if(b == 13){
            sum = a;
        }else if(c == 13){
            sum = a + b;
        }else{
            sum = a + b + c;
        }
        return sum;
    }