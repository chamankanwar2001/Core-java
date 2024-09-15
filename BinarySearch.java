import java.util.*;
public class BinarySearch{
    public static void main(String[] args) {

        int a[]={1,2,3,4,5,6,7,8,9,10};
        int li=0;
        int hi=a.length-1;
        int mid= (li+hi)/2;
        int target=79;
        while(li<=hi){
            if(a[mid] == target){
                System.out.println(mid);
                break;

            }
            else if(a[mid] < target){
                li= mid-1;

            }
            mid=(li +hi) /2;
        }
        if(li>hi){
            System.out.println("element not found");
        }

    }
    
}