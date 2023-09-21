public  boolean evenlySpaced(int a, int b, int c){
  return (a + b == 2 * c) || (a + c == 2 * b) || (b + c == 2 * a);
}   

//first solution before I used some mathematical maturity.

/*int diff = a - b - c;
  if(a == b && b == c){
    return true;
  }
  if(diff != 0 && (a == b || a == c || b == c)){
    return false;
  }

  int diff1 = Math.abs(a - b);
  int diff2 = Math.abs(a - c);
  int diff3 = Math.abs(b - c);

  if(diff1 == diff2 || diff1 == diff3 || diff2 == diff3){
    return true;
  }
  return false;
*/