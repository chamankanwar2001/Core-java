public class FindDuplicate {
    public static void main(String[] args) {
        for (int i=0;i<a.length;i++){
            for( int j=i;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
        }
        System.out.println("duplicate count is" +count);
    }
    
}
