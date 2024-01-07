public String zipZap(String str){
   String modString = "";
   if(str.length() < 3){
      return str;
   }
   for(int i = 0; i < str.length(); i++){
      if(str.charAt(i) == 'z' && str.charAt(i + 2) == 'p'){
         modString += str.substring(i, i+1) + str.substring(i+2, i+3);
         i += 2;
      }else{
         modString += str.substring(i,i+1);
      }
   }
   return modString;
}