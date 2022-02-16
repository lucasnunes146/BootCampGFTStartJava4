// casting = transformação de uma determinada variável de tipo menos específico para um tipo mais específico ou vice-versa.

// upcast (implícito) = de menor para maior.
// Downcast (explícito) = de maior para menor

//exemplos: 
//* long l; int i=10; l=i; upcast
//* int i; long l=100; i=(int)l; downcast
//* double d; float f=10.5f; d=f; upcast
//* float f; double d=10.5d; f=(float)d; downcast
//* int i; float f=10.5f; i=(int)f; downcast


public class casting {
    public static void main(String[] args) {
        byte b1;
        short s1=1000;
        b1 = (byte) s1;

        long l1;
        int i1 = 10;
        l1 = i1;

        int i2;
        long l2 = 1000000000000000000L;
        i2 = (int) l2;

        int i3;
        long l3 = 100000l;
        i3 = (int) l3;

        double d1;
        float f1 = 10.5f;
        d1 = f1;

        float f2;
        float f3;
        double d2 = 10000.58d;
        f2 = (float) d2;
        double d3 = 10000.58888888888888888888888888888888888888888888888888d;
        f3 = (float) d3;

        int i4;
        float f4 = 11.5697f;
        i4 = (int) f4;

        System.out.println("b1 = " + b1);
        System.out.println("l1 = " + l1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
        System.out.println("d1 = " + d1);
        System.out.println("f2 = " + f2);
        System.out.println("f3 = " + f3);
        System.out.println("i4 = " + i4);

        b1 = (byte) d3;

        System.out.println("b1 = " + b1);

        int i10 = 3;
        int g = 10 - 5 * 2 + --i10;

        System.out.println(i10);
    }
}
