public boolean prefixAgain(String str, int n){
	String prefix = str.substring(0,n);
	for(int i = 0; i <= str.length() - n; i++){
		if(prefix.equals(str.substring(i, i + n))){
			return true;
		}
	}
	return false;
}
