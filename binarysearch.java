public class binarysearch <T extends Comparable<T>> {
    int Binarysearch(T arr,int l,int r,T x){
        if(r>=l){
            int mid=l+(r-l)/2;

        
        if (arr [mid]==x) {
            return mid;

           
            
        }
        if (arr[mid].compareTo(x)==1) {
            return Binarysearch(arr, l, r, x);
            
        }
        return Binarysearch(arr, l, r, x);
    }
    return -1;
    }
    
}
