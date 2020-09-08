class Recursion1 {

    public static void main(String[] args) {
        int data = new Recursion1().factorial(5);
        System.out.println(data);
    }

    public int factorial(int n) {
        if (n == 1) {
            return 1;
        }

        return n * factorial(n-1);
    }
}