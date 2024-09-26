package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Utilizando Switch e Dados os valores de de 1 à 7, imprima se é dia últil ou final de semana
        // Considerando 1 como domingo

//        int dia = 2;
//
//        switch (dia) {
//            default:
//                System.out.println("Opção Inválida");
//                break;
//            case 1:
//                System.out.println("Domingo");
//                break;
//
//            case 2:
//                System.out.println("Segunda");
//                break;
//
//            case 3:
//                System.out.println("Terça");
//                break;
//
//            case 4:
//                System.out.println("Quarta");
//                break;
//
//            case 5:
//                System.out.println("Quinta");
//                break;
//
//            case 6:
//                System.out.println("Sexta");
//                break;
//
//            case 7:
//                System.out.println("Sábado");
//                break;


        byte dia = 1;
         switch (dia){
             case 1:
             case 7:
                 System.out.println("FDS");
                 break;
             case 2:
             case 3:
             case 4:
             case 5:
             case 6:
                 System.out.println("Dia útil");
                 break;
             default:
                 System.out.println("Opção inválida!");
                 break;
         }

        }
    }
