public class ZeraOneSort {
    public static void display(int a[]){
        for (int i=0;i<a.length;i++){
            System.out.println(a[i] +" ");
        }
    }
    public static void SortZero(int a[]){
        int n=a.length;
        int count=a.length;
        int count=0;
        for(int i=0;i<n; i++){
            if (a[i]==0){

            }
        }

    for(int i=0;i<n;i++){
        if(i<count){
            a[i]=0;
        }else{
            a[i]=1;

        }

    }
    display(a);

    }
    public static void main(String[] args) {
        int a[]={1,1,0,0,0,1,0,1};
    }
    
}
