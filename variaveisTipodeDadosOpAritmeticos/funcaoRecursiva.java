public class funcaoRecursiva{
    public static void main(String[] args) {
        int x = f(5);
        System.out.println(x);
    }
    public static int f(int n){
        if (n < 2){
            return n;
        }
        else{
            return f(n - 1) + f(n - 2);
        }
    }

}    
