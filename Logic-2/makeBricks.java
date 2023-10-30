public boolean makeBricks(int small, int big, int goal){
   int rem;
   if(goal >= (5 * big)){
    rem = goal - (5 * big);
   }else{
    rem = goal % 5;
   } 

   return small >= rem;
}