package Program5;

class EnhancedString{
    String str;
    EnhancedString(String str){
        this.str=str;
    }
    static String reverseString(String str){
        String result="";
        for(int i=str.length()-1;i>=0;i--){
            result+=str.charAt(i);
        }
        return result;
    }
    String revWord(){
        String result="";
        String[] words=str.split(" ");
        for(String word : words){
            result=result+reverseString(word)+" ";
        }
        return result;
    }
    int charCount(char ch){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                count++;
            }
        }
        return count;
    }
    void titleCase(){
        String result="";
        boolean toTitle=true;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch == ' '){
                toTitle=true;
                result+=" ";
            }else if(toTitle){
                toTitle=false;
                result+=Character.toUpperCase(ch);
            }else{
                result+=Character.toLowerCase(ch);
            }
        }
        str=result;
    }
}