public String doubleChar(String str){
    String newStr = "";
    for(int i = 0; i < str.length(); i++){
        newString += str.substring(i) + str.substring(i);
    }
    return newStr;
}