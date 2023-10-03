public static boolean endOther(String a, String b){
        int min = min(a.length(), b.length());
        return a.substring(a.length() - min).equalsIgnoreCase(b.substring(b.length() - min));
    }