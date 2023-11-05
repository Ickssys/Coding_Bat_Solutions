public boolean bobThere(String str){
    boolean hasBob = false;
    for(int i = 0; i < str.length() - 2; i++){
        if(str.charAt(i) == 'b' && str.charAt(i + 2) == 'b'){
            hasBob = true;
        }
    }
    return hasBob;
}