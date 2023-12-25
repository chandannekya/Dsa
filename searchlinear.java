public class searchlinear <T extends Comparable<T>> {
    public  int LinearSearch(T arr[],T key,int size ){
       for (int i = 0; i <size; i++) {
        if (arr[i]==key) {
            return i;
            
        }


        
       }
       return -1;
    }
    public static void main(String[] args) {
    searchlinear <Integer> l=new searchlinear<>();

        Integer [] arr={7,5,6,7,54,6,8};
        int n=arr.length;
        Integer key=5;
        if (l.LinearSearch(arr,key,n)==-1) { //give first occurence
            System.out.println("Element is not present in array");
            
        }
        else{
            System.out.println("element is present at : "+ l.LinearSearch(arr, key, n));
        }

    }
}
