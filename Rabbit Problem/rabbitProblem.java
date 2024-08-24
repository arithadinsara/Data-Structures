public class RabbitProblem {

    // Recursive method to calculate the number of rabbits in month n
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int months = 10; // Number of months to calculate
        System.out.println("Rabbit Problem: Number of pairs of rabbits after " + months + " months:");
        
        for (int i = 0; i <= months; i++) {
            System.out.println("Month " + i + ": " + fibonacci(i) + " pair(s) of rabbits");
        }
    }
}

