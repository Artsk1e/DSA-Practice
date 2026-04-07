
public class Main {
	public static void main(String[] args) {
        int number = 5;
        int result = sum(number);
        System.out.println("The recursive sum of " + number + " is: " + result);

        System.out.println("Factorial of 7: " + factorial(7));
        System.out.println("Power of 8 with a base of 2: "+power(2, 8));
        System.out.println("Fibonacci Sequence of 5: "+ fibonacci(5));
	}

    private static int fibonacci(int n) {
        if(n==0) return 0;
        if(n==1) return 1;

        return fibonacci(n-1) + fibonacci(n-2);
    }

    private static int factorial(int num) {
        if( num < 1) return 1; //base Case
        return num * factorial(num -1);
    }

    private static int power(int base, int exponent){
        if(exponent < 1) return 1; // base case
        return base * power(base, exponent-1); // recursive case
    }

    public static int sum(int n){
        //Base Case
        if(n <= 1){
            return 1;
        }
        //Recursive Call
        return n + sum(n-1);
}


}
