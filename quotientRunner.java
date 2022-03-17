public class quotientRunner
{
    public quotientRunner()
    {
            Quotient quotient = (float a, float b)->
            {
                System.out.printf("%.3f", a/b);

            };
            quotient.printQ(10,2);
    }
    public static void main(String[] args)
    { quotientRunner app = new quotientRunner(); }
}