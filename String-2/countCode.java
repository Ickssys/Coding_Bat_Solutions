 public static int countCode(String str){
        String code = "code";
        int codeCount = 0;
        int strLength = str.length();
        if(str.equals(code)){
            codeCount = 1;
        }
        if(strLength > 4){
            for(int i = 0; i < str.length()-3; i++){
                System.out.println(str.substring(i,i+4));
                if(str.substring(i,i+4).equals(code)){
                    codeCount++;
                }
                else if(str.substring(i, i+2).equals("co") && str.substring(i+2,i+4).endsWith("e")){
                    codeCount++;
                }
            }
        }
        return codeCount;
    }