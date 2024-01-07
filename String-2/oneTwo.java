public String oneTwo(String str){
   String modString = "";
   if(str.length() < 3){
      return modString;
   }
   else if(str.length() == 3) {
      return str.substring(1,3) + str.charAt(0);
   }
   for(int i = 0; i < str.length() / 3; i++){
      modString += str.substring(3 * i + 1, 3 * i + 3) + str.charAt(3 * i);
   }
   return modString;
}