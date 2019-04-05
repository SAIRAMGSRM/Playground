import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in =new Scanner(System.in);
    int n = in.nextInt();
    int firstdigit =n/100;
    int seconddigit =((n/10)%10);
    int lastdigit =n%10;
    int reverse = (lastdigit*100+seconddigit*10+firstdigit);
                   System.out.println(reverse);
  }
}