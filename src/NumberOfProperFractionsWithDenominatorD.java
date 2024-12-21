

public class NumberOfProperFractionsWithDenominatorD {

    public static void main(String[] args) {
        System.out.println(CountOfFraction(9));
    }

    public static long CountOfFraction(long n) {
/*        System.out.println(n);
        int count = 0;
        for (long i = 1; i < n; i++) {
            boolean fr = true;
            for (int j = 2; j < 10; j++) {
                if (n % j == 0 && i % j == 0) {
                    fr = false;
                    break;
                }
            }
            if (fr) {
                count++;
            }
        }
        return count;*/


        if (n==1) return 0;
        long res=n,a=n;
        for (long i=2;i<=Math.sqrt(a);i++)
        {
            if (a%i==0)
            {
                res=res/i*(i-1);
                while (a%i==0)
                    a/=i;
            }
        }
        if (a>1) res=res/a*(a-1);
        return res;


    }
}
