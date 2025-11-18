

public class MainSwitch {
    public static void main(String[] args) {
        
        diaUltio("Sabado");
    }

    public static void diaUltio(String dia) {

        String tipoDeDia = switch (dia) {
            case "Seg", "Ter", "Qua", "Qui", "Sex" -> "Dia util";
            case "Sabado", "Domingo" -> "Fim de semana";

            default -> "Desconhecido";
        };

        System.out.println(tipoDeDia);

    }

   
}