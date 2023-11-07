public String repeatSeparator(String word, String sep, int count){
    String newString = "";
    if(count == 0) return "";
    if(count == 1) return word;
    newString += "" + word;
    for(int i = 0; i < count - 1; i++){
        newString += "" + sep + word;
    }
    return newString;
}