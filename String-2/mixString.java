public static String mixString(String a, String b) {
    String newString = "";
    int min = Math.min(a.length(), b.length());
    for(int i = 0; i < min; i++){
        newString += "" + a.charAt(i) + b.charAt(i);
    }
    if(b.length() > a.length()){
        newString += b.substring(a.length());
    }else {
        newString += a.substring(b.length());
    }
    return newString;
}