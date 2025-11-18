import java.time.LocalDate;
import java.util.Scanner;

public class ExercioSatisfacao {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("O quando você sab de java");
        int nivel = sc.nextInt();

        LocalDate date = LocalDate.now();
        int mes = date.getMonthValue();
        var dia = date.getDayOfWeek();
        System.out.println("Dia " + dia);
        mesDoAno(mes);
        
        switch (nivel) {
            case 1 -> System.out.println("Muito insatisfeito");
            case 2 -> System.out.println("Insatisfeito");
            case 3 -> System.out.println("Neutro");
            case 4 -> System.out.println("Satisfeito");
            case 5 -> System.out.println("Muito Satisfeito");
            default -> System.out.println("Opção invalida");
        }
    }

     public static void mesDoAno(int mes) {
        String mesAtual = switch (mes) {
            case 1 -> "Janeiro";
            case 2 -> "Fevereiro";
            case 3 -> "Março";
            case 4 -> "Abril";
            case 5 -> "Maio";
            case 6 -> "Junho";
            case 7 -> "Julho";
            case 8 -> "Agosto";
            case 9 -> "Setembro";
            case 10 -> "Outubro";
            case 11 -> "Novembro";
            case 12 -> "Dezembro";

            default -> "Mes invalido";

        };

        System.out.println(mesAtual);
    }




}
