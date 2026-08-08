// package DAY15.InputStream;
import java.io.*;
import java.util.Scanner;

public class InputInJava {
    public static void main(String[] args) throws IOException{
        
        /*   
            in java we have INputSTream to take input

            we can take input from
            ->console(keyboard)
            ->network(server based)
            ->files(files)
            ->memory

            ->taking i/p is not limited to console we can take it above places also

            now lets take input from console

            to take input console we have to do
            System.in ->which is a abstract class
            and helps in taking input

            implementing class has to define the way of taking input 

            ->like console will implement its type of taking input,network will define its methods
            same for others

            ->System.in ->belong to Input Stream and it is a abstract class
            and it say i will not implementation,if u want take input and implement me and give ur type of taking input method
        */

       /*
       
            JAVA INPUT 
            java input is based on streams

            image water flowing through a pipe
            stream means flow of data

            in INputSteam(Abstract) we have 4 methods take input
            ->1.FileInputStream->read(){ }
            ->2.ConsoleInputStream->read(){ }
            ->3.NetworkInputStream->read(){ }
            ->4.MemoryInputStream->read(){ }

            these are child class of InputStream which define their methods of taking input

            
            streamOfData->

            InputStream->if data flow into program->read();
            OutputStream->if data flow into program->read();


            System.in->INput stream

            by default we take input from keyboard

            inputstream is used fro read()-> import java.io

            it reads stream of bytes
            we take give input as A->in stream of bytes  it is stored as 65
       */
    //   System.in.read();-> reads one byte at a time

            /*
            
            
              if i give ADITYA ->
              it take only A coz->it reads only one byte a time

              -------------------------
              [A] [D] [I] [T] [Y] [A] [\n]
                ---------------------
               [65] [100] [105] [116] [121] [91] [10] 
               --------------------------------------
                IT READS ONLY at a time [A]=65
                if i do 
                System.out.read();
                ->gives A only as output
            */

           /*
             if i had to read all values i have to call it again and againa
             multiple os call get all value
           
           */

          /*
            ot over come this ->there is reader(Abstract) class
             it has 3 implementing class

             1.InputStreamREader       (1  & 2 are used in console input)
             2.bufferReader
             3.FIleReader

             the reader class is used to read stream of characters

              -------------------------
              [A] [D] [I] [T] [Y] [A] [\n]
                ---------------------


                 buffer reader makes 1000 call if i have 1000 char ->

                 so this got one solution

                read character from os buffer
                store it in memory
                give them to program when required


                keyboard->os buffer->java buffer->program
           */

                /*
                
                        IMPORTANT

                        one problem is there java inputreader and buffer reader are not compatible with each 
                        InputStream is standard


                        so ->now i have to convert stream character into bytes

                        the inputStreamReader solver the problem
                        it converts stream sof bytes from char

                        1.My InputStreamREader takes System.in into it
                        2.My buffer takes InputStreamRader into it



                 */

                InputStreamReader irs=new InputStreamReader(System.in);
                BufferedReader br=new BufferedReader(irs);
                String s=br.readLine();
                System.out.println(s);
                br.close();

                // steps
                /*
                1.take input ->ADITYA
                2.OS buffer->[65] [100] [105] [116] [121] [91] [10] 
                3.Sytem.in(inputStream)->recieves these bytes
                4.4.inputStreamReader converts  bytes into char
                    -> [A] [D] [I] [T] [Y] [A] [\n]
                5.Buffer reader(reads all buffer)->readline();
                6.s.o.p(s)->gives ADITYA

                 */

                /*
                
                  It is a long process and so that new method came 
                  which is Scanner method
                  it is a class and we have to import it 
                  and have to make object of it make take input from users
                  it provide many method to take input

                     
                Scanner sc=new Scanner(System.in); for console i/p
                file i/p=new FIle(input.txt)->for file input
                  it simplified input
                  can take multiple types of input

                  scanner class work on tokonization

                  i am a big person
                  4 token ->are gathered by spaces b/w the words

                 */
                Scanner sc=new Scanner(System.in);  // whatever we do ,at last we have to work on System.in only->input stream
                int x=sc.nextInt();

                System.out.println("ENter String");
                String name=sc.nextLine();
                System.out.println("ENter  a BYte");
                byte c=sc.nextByte();
                System.out.println("ENter float");
                float f=sc.nextFloat();
                System.out.println("Enter double");
                double d=sc.nextDouble();
                System.out.println("ENter Long");
                long l=sc.nextLong();
                System.out.println("Integer is"+x);
                System.out.println("float is"+ f);
                System.out.println("String is "+name);
                System.out.println("BYTE IS "+c);
                System.out.println("DOUBLE IS"+d);
                System.out.println("LONG IS "+l);
                sc.close();

                /*
                
                Scanner  class is too slow and buffer reader is faster 
                Scanner class work on top of all the process we have disscussed above

                 */

    }
    
}
