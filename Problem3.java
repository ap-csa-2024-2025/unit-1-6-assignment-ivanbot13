public class Problem3
{
  public static void main(String[] args)
  {
    double num = 67.3424;
    double x = num%1;
    x *= 1000;

    int firDigit = (int)(x/100);
    int secDigit = (int)((x/10)%10);
    int thrDigit = (int)(x%10);
    System.out.println("decimal number: " + num);
    System.out.println("Answer: " + firDigit + " " + secDigit + " " + thrDigit);
  }
}

