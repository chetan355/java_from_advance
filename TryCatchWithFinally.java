
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    Finally block used to execute code irrespective exception their or not
    Also can be used to close the resource. for example BufferedReader, Database
*/
public class TryCatchWithFinally {
    public static void main(String[] args) throws IOException {
        // int i = 20;
        // int j = 0;

        BufferedReader bf = null;

        try 
        {
            // j = 18/i;
            InputStreamReader in = new InputStreamReader(System.in);
            bf = new BufferedReader(in);

           
        }catch (Exception e) 
        {
            System.out.println(e);
        }finally{
            bf.close();
//            System.out.println("Bye!");
        }
    }
}
