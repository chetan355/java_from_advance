class MyException extends Exception{
    public MyException(String exception){
        super(exception);
    }
}
public class CustomException {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try 
        {
            j = 18/i;
            if(j==0)
                throw new MyException("this is my exception");
        }catch (MyException e) 
        {
            System.out.println(e);
        }
    }
}
