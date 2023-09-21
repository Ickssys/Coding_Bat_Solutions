public boolean catDog(String str){
    int dCount = 0;
    int cCount = 0;

    for(int i = 0; i < str.length()-2; i++){
        if(str.substring(i, i+3).equals("dog")){
           dCount++; 
        }
        if(str.substring(i, i+3).equals("cat")){
            cCount++; 
         }
    }
    return cCount == dCount;

}