// package DAY26.04-WORKING OF SET ;

public class set {
    public static void main(String[] args) {
        /*how do the set.add(2) works when set uses maps internally
        

        when i say set.add(2)
        it is like calling put(2,PRESENT);
        value is PRESENT AND KEY IS HAVING VALUE

        key%n is taken and index is found and in that position key is stored

        set.add(2)

        class MAP(){
          put(int key,Object Value){
            int index=key%n;
            key=arr[index];
          }
        }


        if array is empty->then simple hashing is done 
        if bucket is filled then linked HashMAP is used to store the values 

        set.contains(23)

        its calls containsKey(23) of MAP methods
           int index=23%n
           in that index values key are compared and returns boolean values
        */
    }
    
}
