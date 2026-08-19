/*
    Compile time error
    Runtime error
    logical error
 */

public class ExceptionHandling {
    public static void main(String[] args) {
    
        int a = 11;

        int arr[] = new int[5];

        int b = 0;
        try 
        {
            b = 10/a;
            if(b == 0){
                throw new ArithmeticException();
            }
            // System.out.println(arr[5]);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            b = 10/1;
            System.out.println("Something went wrong "+ e);
        }
        catch(Exception e){
            System.out.println("Something went wrong : "+e);
        }

        System.out.println(b);
    }    
}
