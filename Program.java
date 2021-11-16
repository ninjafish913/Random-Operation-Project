public class Program
{
    static int RandomRange(int min, int max)
    {
        double digits = String.valueOf(max).length();
        double pow = Math.pow(10, digits);
        int random = (int) Math.round(Math.random()*pow);
        while (random < min || random > max) {
            random = (int) Math.round(Math.random()*pow);
        }
        return random;
    }

    public static void main(String[] args) {
        int operation = RandomRange(1, 3);
        if (operation == 1) {
            // Operation 1)
            int divisor = RandomRange(2, 10);

            System.out.printf("All the numbers between 100-200 who are divisible by %d:\n", divisor);

            for(int i = 100; i <= 200; i++)
            {
                if (i % divisor == 0) {
                    System.out.print(String.valueOf(i) + " ");
                }
            }
        } else if (operation == 2) {
            // Operation 2)
            int primeStop = RandomRange(2, 200);

            System.out.printf("\n\nAll the prime numbers between 2-%d are:\n", primeStop);
            System.out.print(String.valueOf(2) + " ");
            if (primeStop != 2) {
                System.out.print(String.valueOf(3) + " ");

                for(int i = 5; i <= primeStop; i++) {
                    boolean prime = true;

                    for (int p = 2; p < i / 2; p++) {
                        if (i % p == 0) {
                            prime = false;
                            break;
                        }
                    }
                    if (prime) {
                        System.out.print(String.valueOf(i) + " ");
                    }
                }
            }
        } else {
            // Operation 3)
            int largestNumber = RandomRange(1, 100);

            System.out.printf("\n\nAll numbers between 1-%d in octal notation:\n", largestNumber);

            for (int i = 1; i <= largestNumber; i++) {
                System.out.print(Integer.toOctalString(i) + " ");
            }
        }
    }
}