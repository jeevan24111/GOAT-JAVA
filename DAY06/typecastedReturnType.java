package DAY06;
public class typecastedReturnType{
    public static void main(String[] args) {
        int x=20,y=20;

        double res=sum(x,y);
        System.out.println(res);

        //here i passed parameters as integer but got returned as double because of typecasting while returning
    }
    static double sum(int x,int y){
        return (double)x+y;
    }
}
