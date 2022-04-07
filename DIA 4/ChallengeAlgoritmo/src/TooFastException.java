public class TooFastException extends Exception{


    private static final long serialVersionUID = 1L;

    public TooFastException()
    {
        super("this vehicle is going too fast");

    }
}