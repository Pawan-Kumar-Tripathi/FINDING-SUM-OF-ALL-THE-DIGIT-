import java.io.*;
import java.util.*;
class sum_digit
    {
        public void main()
        {
            Scanner sc = new Scanner(System.in);
            int numb = sc.nextInt();
            int count1=0,rem;
            for(;numb!=0;)
            {
                rem=numb%10;
                count1= count1+rem;
                numb = numb/10;
            }
            System.out.println("sum of digits are "+ count1);
            
        }
    }