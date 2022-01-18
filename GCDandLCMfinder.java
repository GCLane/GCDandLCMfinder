public class GCDandLCMfinder{

static int gcd(int x, int y)
{
    while (y != 0)
    {
        int rem = x % y;
        x = y;
        y = rem;
    }
    return x;
}

static int lcm(int x, int y)
{
    return (x / gcd(x,y)) * y;
}

public static void main(String[] args){
    int gcd = gcd(20, 12);
    System.out.println(gcd);
    int lcm = lcm(4, 5);
    System.out.println(lcm);
}

}
