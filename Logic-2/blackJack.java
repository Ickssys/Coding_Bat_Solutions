public  int blackjack(int a, int b){
    if(a > 21 && b > 21){
        return 0;
    }
    else if(b - a == 1){
      return b;
    }
    else{
    return 21 % a < 21 % b ? a : b; 
   } 
}