public class Randomclass {
    public static void main(String[] args) {
       
        
        Random r1=new Random(20,30);
            //r1-> points to x and y in heap location
         System.out.println(" value x and y values of r1 are :"+r1.x+ " " +r1.y);
        
        Random r2=new Random(r1.x,r1.y);
          System.out.println(" value x and y values  of r2 are  :"+r2.x+ " " +r2.y);

        //r2->points to x and y in heap with the values of  20,30 diff 
        /* any change made by r2 is not reflected to r1 and r2 since it is diff in location */

        Random r3=r1;
        System.out.println(" value x and y values  of r3 are :"+r3.x+ " " +r3.y);
        //r3->points to where r1 is pointing to in heap
         /* if anything is changes by r3 also get reflected to r1  */
         r3.x=30;
         r3.y=40;
        System.out.println(" value x and y values  r3 after  r3 changes  :"+r3.x+ " " +r3.y);
        System.out.println(" value x and y values r1  after r3 changes are :"+r1.x+ " " +r1.y);
          
        
       
        


    }
}
class Random{
    int x;
    int y;

    Random(int x,int y){
        this.x=x;
        this.y=y;
    }

    
}
