// imprimir a sequencia de Fibonacci ate o 30º elemento
public class ex09 
{
    public static void main(String[] args) 
    {
        int n1 = 0, n2 = 1, n3, i, tamanho = 30;

        System.out.println(n1);
        System.out.println(n2);

        for (i = 2; i < tamanho; ++i)
        {
            n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }

    }

}
