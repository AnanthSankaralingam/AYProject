public class main()
{
    public main()
    {
        Quotient quotient = (float a, float b)->
            {
                System.out.printf("%.3f", a/b);

            };
            quotient.printQ(10,2);

        Square square = (x)->{
            if(x%2==0)
            return true;
            return false;
            };
            System.out.println(square.checker(4)) ;
    }
    public static void main(String[] args)
    { main app = new main();}

}