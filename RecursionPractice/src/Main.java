
public class Main {
	public static void main(String[] args) {
        int number = 5;
        int result = sum(number);
        System.out.println("The recursive sum of " + number + " is: " + result);

        System.out.println(factorial(7));
        System.out.println(power(2, 8));
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
