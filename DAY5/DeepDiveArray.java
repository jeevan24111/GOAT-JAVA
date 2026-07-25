package DAY5;

public class DeepDiveArray{
    public static void main(String[] args){

        //how array elements are accessed
        int a[]=new int[10];
        int x=10;
        for(int i=0;i<10;i++){
            a[i]=x;
            x++;
        }

        System.out.println(a[4]);
        System.out.println(a[0]);
        /* how we get a[4] value internally 
                a will have the base address
                like 1000

                now i need 4th index value which means
                index-1=4-3
                base address+(data_type * index);
                1000+(4*4)=1016

                at 1016 a[4] value is present
        */

                //2.how 2d arrays are stored
                int arr2d[][]=new int[3][3];
                int y=10;
                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        arr2d[i][j]=y;
                        y++;
                    }
                }
            //suppose i need arr2d[2][1]
            /*
            2nd row first column value

            so first arr2d[2][] goes to 2nd row 
             and gets address 2008
             2000+(4*2)=2008

                    now it goes to address arr2d[][1] 
                    first column in 2nd row array
                    suppose 
                    2008+(4*1)
                    2012;

                    like this array values are accessed
            
            */

    }
}