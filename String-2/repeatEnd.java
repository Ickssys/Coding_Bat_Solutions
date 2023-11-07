public String repeatEnd(String str, int n){
  String newString = "";
  String lastN = str.substring(str.length() - n);
  for (int i = 0; i < n; i++) {
    newString += "" + lastN; 
  }
  return newString; 
}
