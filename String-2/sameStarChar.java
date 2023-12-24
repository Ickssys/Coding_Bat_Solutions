public boolean sameStarChar(String str){
   for(int i = 0; i < str.length(); i++){
      if((0 < i && i < str.length() - 1) && str.charAt(i) == '*'
      && str.charAt(i - 1) != str.charAt(i + 1)){
         return false;
      }
   }
   return true;
}
