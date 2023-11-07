public static String repeatFront(String str, int n){
    String newString = "";
    for(int i = 0; i < n; i++){
        newString += "" + str.substring(0,n - i);
    }
    return newString;
}