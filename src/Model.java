import java.util.Random;

public class Model {

     double calculate(double number)
    {double sum = 0;

        for (int i=0;i<15;i++)
        {
            if(i%2==0)
            sum+=calc2(number*i);
            else
                sum+=calc3(number*i);
        }
        return sum;

    }

    private double calc2(double number)
    {
        return Math.pow(number,2.5);
    }

    private double calc3(double number)
    {
        return Math.pow(number,1.15);
    }

}
