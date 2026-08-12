// package DAY22.02-String Methods.05-Extraction and Transformation;

public class exatractionjava {
    public static void main(String[] args) {
        /*Returns a string that is a substring of this string.  */
        String s="helllo i am ";
        System.out.println(s.substring(0, 5));
        System.out.println(s.substring(1));

        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        String s1="                      hello            ";
        System.out.println(s1.trim());
        System.out.println(s1.strip());
        System.out.println(s1.repeat(3));


        System.out.println(s.replace("e","h"));
        System.out.println(s.replaceAll("e","h"));

        //spilt string into array
        String s3="hello,iam,jeevan";
        String[] s4=s3.split(",");
        System.out.println(s4);

        //join
        System.out.println(String.join("-", "a","b","c"));

     
    }
}
