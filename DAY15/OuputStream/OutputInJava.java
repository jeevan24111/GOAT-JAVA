// package DAY15.OuputStream;

public class OutputInJava {
    public static void main(String[] args) {
        /*
        
        OutputStream->write();
        
         in OutputSteam(Abstract) we have 4 methods take input
            ->1.FileOutputStream->write(){ }
            ->2.ConsoleOutputStream->write(){ }
            ->3.NetworkOutputStream->write(){ }
            ->4.MemoryOutputStream->write(){ }
            
             these are child class of OutputStream which define their methods of giving output

             it belong to PRIntStream class

             it has 2 method to give output
             1.System.out->consolr o/p
             2.System.err->used to error output which production and used in log

             printStream is child class of Output Stream ->console o/p implementation is given
            
    */
            int x=20;
             System.out.println("hello i am PrintStream ,i i give new line and i belong to OutPut STream");
             System.out.print("hello i am PrintStream ,i don't give new line and i belong to OutPut STream");
             System.err.println("\ni am used to give error messages");
             System.out.printf("my x value is %d",x);
             
    }
    
}
