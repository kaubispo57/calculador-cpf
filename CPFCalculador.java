import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CPFCalculador {


    public static void main(String[] args) {

        Scanner t = new Scanner (System.in);

        double aleatorio1 = Math.random();
        int primeiroTerco = (int) (100 + aleatorio1 * (999-100));

        double aleatorio2 = Math.random();
        int segundoTerco = (int) (100 + aleatorio2 * (999-100));

        double aleatorio3 = Math.random();
        int Ultimos2 = (int) (10 + aleatorio3 * (99-10));

        int[] cpf = new int[11];

        //Primeiro teço de números
        cpf[0] = primeiroTerco / 100;
        cpf[1] = (primeiroTerco / 10) % 10;
        cpf[2] = primeiroTerco % 10;

        //Segundo teço de números
        cpf[3] = segundoTerco / 100;
        cpf[4] = (segundoTerco / 10) % 10;
        cpf[5] = segundoTerco % 10;

        //7° e 8° número
        cpf[6] = Ultimos2 / 10;
        cpf[7] = Ultimos2 % 10;

        System.out.println("Qual é o seu Estado? \n" +
                "------------------------\n" +
                " [0] Rio Grande do Sul          \n" +
                " [1] Distrito Federal, Goiás, Mato Grosso, Mato Grosso do Sul e Tocantins          \n" +
                " [2] Acre, Amazonas, Amapá, Pará, Rondônia e Roraima            \n" +
                " [3] Ceará, Maranhão e Piauí             \n" +
                " [4]  Alagoas, Paraíba, Pernambuco e Rio Grande do Norte            \n" +
                " [5] Bahia e Sergipe          \n" +
                " [6] Minas Gerais         \n" +
                " [7] Espírito Santo e Rio de Janeiro         \n" +
                " [8] São Paulo         \n" +
                " [9] Paraná e Santa Catarina         \n" +
                "------------------------");
        int estado = t.nextInt();
        cpf [8] = estado;

        //Calcular o primeiro Dígito
        int soma1 = 0;
        for (int i = 0; i < 9; i++){
            soma1 += cpf[i] * (10 -i);
        }
        int dv1 = soma1 % 11;
        cpf[9] = (dv1 < 2) ? 0 : 11 - dv1;

        //Calcular o segundo Dígito
        int soma2 = 0;
        for (int i = 0; i < 10; i++){
            soma2 += cpf[i] * (11 -i);
        }
        int dv2 = soma2 % 11;
        cpf[10] = (dv2 < 2) ? 0 : 11 - dv2;

        System.out.printf("%d%d%d.%d%d%d.%d%d%d-%d%d", cpf[0],cpf[1],cpf[2], cpf[3],cpf[4],cpf[5], cpf[6],cpf[7],cpf[8], cpf[9],cpf[10]);

    }
}
