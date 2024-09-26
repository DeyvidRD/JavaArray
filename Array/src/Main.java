public class Main {
    public static void main(String[] args) {

        int[] numeros = {44, 15, 12, 28, 53, 60};

        int i = 0;

        int maior = 0;

        int menor = numeros[0];

        while (i < numeros.length) {

            if (numeros[i] > maior) {
                maior = numeros[i];
            }

            if (numeros[i] < menor){
                menor = numeros[i];
            }

            i++;

        }

        System.out.println("O maior número é " + maior);
        System.out.println("O menor número é " + menor);


        int[] pares = new int[numeros.length];
        int[] impares = new int[numeros.length];
        // Índices para controlar onde adicionar os números pares e ímpares
        int indiciPares = 0;
        int indiciImpares = 0;
        int j = 0;

        i = 0;

        while (i < numeros.length) {

            if (numeros[i] % 2 == 0) {

                pares[indiciPares] = numeros[i];
                indiciPares++;
            } else {

                impares[indiciImpares] = numeros[i];
                indiciImpares++;
            }

            i++;
        }

        System.out.print("Números pares: ");
        for ( j = 0; j < indiciPares; j++) {
            System.out.print(pares[j] + " ");
        }
        System.out.println();

        System.out.print("Números ímpares: ");
        for ( j = 0; j < indiciImpares; j++) {
            System.out.print(impares[j] + " ");
        }
        System.out.println();

        boolean[] primo = new boolean[numeros.length];

        for (i = 0; i < numeros.length; i++) {
            primo[i] = ehPrimo(numeros[i]);
        }

        System.out.println("Verificação se o número é primo:");
        for (i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + " é primo? " + primo[i]);
        }
    }


    // Método para verificar se um número é primo
    public static boolean ehPrimo (int numero) {


        if (numero <= 1) {
            return false;
        }

        if (numero == 2) {
            return true;
        }

        if (numero % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= numero; i += 2) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;

    }
}