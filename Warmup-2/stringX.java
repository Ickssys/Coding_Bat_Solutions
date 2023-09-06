public String stringX(String str){
		if(str.length() < 2){
			return str;
		}
		char x = 'x';
		String newString = "";
		char first = str.charAt(0);
		if(first == x){
			newString += first;
		}
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) != x){
				newString += str.charAt(i);
			}
		}
		char last = str.charAt(str.length()-1);
		if(last == x){
			newString += last;
		}
		return newString;
	}