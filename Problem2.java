public class Problem2
{
  public static void main(String[] args)
  {
     double x = 57.3934;
     double y = 22.5211;
     int num1 = (int)(x+0.5);
     int num2 = (int)(y+0.5);
     int sum = num1 + num2;
     System.out.println("The original numbers are " + x + " and " + y);
     System.out.println("The rounded sum is " + sum);
  }
}

