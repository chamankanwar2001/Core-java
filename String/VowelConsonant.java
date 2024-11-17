public class VowelConsonant {
    public static void main(String[] args){
        String s="my name is chaman kanwar";
        char a[]=s.toCharArray();
        for (int i=0;i<a.length;i++){
            if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'){
                System.out.println(a[i] +" vowel");
            }
            else if(a[i]==' '){

            }
            else{
                System.out.println(a[i]+ " consonant");
            }
        }
    }
    
}
