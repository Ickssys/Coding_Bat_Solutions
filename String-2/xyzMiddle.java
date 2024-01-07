public boolean xyzMiddle(String str){
   if(str.equals("xyz")){
      return true;
   }
   boolean equals = false;
   for(int i = 0; i < str.length() - 3; i++){
      if(str.substring(i, i + 3).equals("xyz")){
         if(str.substring(0,i).length() == str.substring(i+3).length() ||
         Math.abs(str.substring(0,i).length() - str.substring(i+3).length()) == 1){
            equals = true;
         }
      }
   }
   return equals;
} 