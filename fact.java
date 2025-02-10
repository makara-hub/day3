public class Main {
public static void main(String[] args) {
int n = 4;
int result = factorial(n);
System.out.println(result);
    }
public static int factorial(int n) {
if (n==1) {
return 1;
} else {
    return n*factorial(n - 1);
        }
    }
}
