public  int roundSum(int a, int b, int c){
  return round10(a) + round10(b) + round10(c); 
    }
public  int round10(int num){
  int div10 = num / 10; 
  int rounded = num % 10;

  if(rounded >= 5){
    div10 = (div10 + 1) * 10;
    }else{
      div10 = div10 * 10;
    }
    return div10;
}