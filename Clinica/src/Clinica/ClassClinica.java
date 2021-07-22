/*
paciente Bia Nair Ivo Luiz Nei Gil Ari
idade 9 70 16 3 11 63 39
convenio s n n s s n s
medico Ian Iara Iuri Ian Susi Iuri Iara

 

a) Armazena os dados em vetores e exiba-os na tela em formato tabular;     2,0
b) Exibe os nomes e as idades das crian�as atendidas e os nomes dos m�dicos que 
as atenderam. Um paciente � considerado crian�a at� 15 anos de idade, inclusive;     2,0
c) Exiba os dados do paciente mais idoso: nome, idade, se tem conv�nio e os nomes 
dos m�dicos que o atenderam;     2,0
d) Calcule a porcentagem de adultos que n�o t�m conv�nio;     2,0
e) Solicite que o usu�rio digite o nome de um m�dico e exiba a quantidade de 
pacientes que ele atendeu.     2,0
 */

package clinica;

 

import java.util.Scanner;

 

public class Clinica {

 

    public static void main(String[] args) {

 

        Scanner leia = new Scanner(System.in);

 

        //item a
        String paciente[] = {"Bia", "Nair", "Ivo", "Luiz", "Nei", "Gil", "Ari"};
        int idade[] = {9, 70, 16, 3, 11, 63, 39};
        char convenio[] = {'s', 'n', 'n', 's', 's', 'n', 's'};
        String medico[] = {"Ian", "Iara", "Iuri", "Ian", "Susi", "Iuri", "Iara"};

 

        //item c
        int maior = idade[0];//oncializa com o primeiro elemento

 

        //item d
        int contAdulto = 0;
        int contAdultoConvenio = 0;
        double perc;

 

        //item a
        System.out.printf("%10s %10s %10s %10s\n", "Paciente", "Idade", "Convenio", "M�dico");
        for (int i = 0; i < 7; i++) {
            System.out.printf("%10s %10d %10c %10s\n", paciente[i], idade[i], convenio[i], medico[i]);
        }

 

        //item b
        System.out.println("\nPaciente  M�dico");
        for (int i = 0; i < 7; i++) {
            if (idade[i] < 15) {
                System.out.println(paciente[i] + "       " + medico[i]);
            }
        }

 

        //item c
        //busca da maior idade
        for (int i = 0; i < 7; i++) {
            if (idade[i] > maior) {
                maior = idade[i];
            }
        }
        //exibe os dados do mais velho
        System.out.println("\nPaciente mais idoso");
        for (int i = 0; i < 7; i++) {
            if (idade[i] == maior) {
                System.out.println(paciente[i] + "  " + idade[i] + "  " + convenio[i] + "  " + medico[i]);
            }
        }

 

        //item d
        for (int i = 0; i < 7; i++) {
            if (idade[i] > 15) {
                contAdulto = contAdulto + 1;
                if(convenio[i] == 'n'){
                    contAdultoConvenio = contAdultoConvenio + 1;
                }
            }
        }
        perc = (double) contAdultoConvenio / contAdulto * 100;//obser a divis�o de inteiros
        System.out.println("\nPorcentagem adulto sem conv�nio: " + perc + "%");