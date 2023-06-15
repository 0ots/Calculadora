import java.util.Scanner;

public class Calculadora {

    public static void clt(double salarioMensal, String nome){

        Scanner teclado = new Scanner(System.in);
        System.out.printf("Insira o salário mensal do professor: ");
        salarioMensal = teclado.nextDouble();
        double salarioCLT = salarioMensal;
        System.out.printf("Nome do professor: %s %nValor a receber: R$ %.2f", nome, salarioCLT);
        teclado.close();

    }

    public static void horista(double horasTrabalhadas, double valorHora, String nome){

        Scanner teclado = new Scanner(System.in);
        System.out.printf("Insira o núnmero de horas trabalhadas pelo professor: ");
        horasTrabalhadas = teclado.nextDouble();
        System.out.printf("Insira o valor da hora de trabalho: ");
        valorHora = teclado.nextDouble();
        double salarioHorista = horasTrabalhadas * valorHora;
        System.out.printf("Nome do professor: %s %nValor a receber: R$ %.2f", nome, salarioHorista);
        teclado.close();

    }

    public static void pj(double salarioPJ, String nome){

        Scanner teclado = new Scanner(System.in);
        System.out.printf("Insira o valor do contrato do professor: ");
        salarioPJ = teclado.nextDouble();
        System.out.printf("Nome do professor: %s %nValor a receber: R$ %.2f", nome, salarioPJ);
        teclado.close();

    }

    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        System.out.printf("Insira o nome do professor: ");
        String nome = teclado.nextLine();

        System.out.printf("Selecione o regime de pagamento do professor: %n 1 - CLT %n 2 - Horista %n 3 - PJ %n");
        int regimePagamento = teclado.nextInt();

            switch(regimePagamento){

                case 1:
                clt(regimePagamento, nome);
                break;
        
                case 2:
                horista(regimePagamento, regimePagamento, nome);
                break;
        
                case 3:
                pj(regimePagamento, nome);
                break;

                default:
                System.out.printf("Regime de pagamento inválido. Reincie o programa.");
                break;

            }
            teclado.close();
        }
    }