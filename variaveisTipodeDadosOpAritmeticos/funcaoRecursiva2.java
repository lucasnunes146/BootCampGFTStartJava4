

public class FuncaoRecursiva2 {
    public static void main(String[] args) {
        int resultado = f(9, 3);
        System.out.println(resultado);
    }
    public static int f(int x, int y){
        if (y == 0){
            return x;
        }
        else{
            return f(y, x % y);
        }
    }
}
