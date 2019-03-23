public class Calculadora {

    public int sum(int var1, int var2) {
        System.out.println("Adding values: " + var1 + " + " + var2);
        return var1 + var2;
    }

    public int diff(int var1, int var2) {
        System.out.println("Subtracting values: " + var1 + " - " + var2);
        return var1 - var2;
    }

    public int times(int var1, int var2) {
        System.out.println("Multiplying values: " + var1 + " * " + var2);
        return var1 * var2;
    }

    public int div(int var1, int var2) {
        try {
            System.out.println("Dividing values: " + var1 + " / " + var2);
            return var1 / var2;
        } catch (ArithmeticException e) {

        }

        return 0;
    }

    public int sqr(int var) {
        System.out.println("Square root of: " + var);
        boolean found = false;
        int odd = 1;
        int root = 0;
        if (quadradoPerfeito(var)) {
            while (!found) {
                var = var - odd;
                odd = odd + 2;
                root++;
                if (var == 0)
                    found = true;
            }
        }
        return root;
    }

    public boolean quadradoPerfeito(int var) {
        boolean quadradoPerfeito = false;
        if (var % 2 == 0) {
            if (var % 4 == 0) {
                quadradoPerfeito = true;
            }
        } else {
            if (var % 8 == 1) {
                quadradoPerfeito = true;
            }
        }

        return quadradoPerfeito;
    }
}
