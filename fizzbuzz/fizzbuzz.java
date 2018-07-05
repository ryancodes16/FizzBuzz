
/**
 * Write a description of class main here.
 *
 * @author Ryan
 * @version 1.0
 */
public class fizzbuzz
{
    //coded in under 5 minutes by Ryan
    //tested and works perfectly
    //meets all requirements and is efficient, original,
    //and impressive (not really, fizz buzz is an easy test to pass LOL)
    public static void main()
    {
        String fizz = "fizz";
        String buzz = "buzz";
        
        for(int i = 1; i <= 100; i++)
        {
           if(i % 3 == 0 && i % 5 == 0)
           {
              System.out.println(fizz + "" + buzz);  
            }
           else if(i % 3 == 0)
           {
               System.out.println(fizz);              
            }
            else if(i % 5 == 0)
            {
                System.out.println(buzz);
            }
            else
            {
                System.out.println(i);
            }
        }
              
    }
}
