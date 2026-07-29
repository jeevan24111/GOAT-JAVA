public class deepdiveobjects{
    public static void main(){
        /*
          what is the exact size of on object
            3 main parts are there to calculate exact size
              1.header size
              2.exact fields
              3.padding



              1.object header
                 ->mete data
                    ->1.marks words   
                            ->garbage collection
                            ->synchronization
                            ->lock

                    ->2.class pointer >
                    
            ======>   4 bytes or 8 bytes depends on JVM

             2.Exact fields
             class student{
              int age;    ->4bytes
              String name;  ->4bytes     =>total =12bytes
              String gender; ->4 bytes  
             }


             3.padding 

             now header size+exact fields size is =8+12 =>20
             now we need exact 4 padding bcz cpu works on 8 bytes chunck
              we should provide 8  next multiple as padding

              20+4=24

              so total size is 24bytes
        */
    }
}