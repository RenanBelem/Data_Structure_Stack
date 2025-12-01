import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] simbolosEspeciais = {'{', '[', '(', ')', ']', '}'};

        System.out.print("Insira a formula aritimetica:");
        String formula = scanner.nextLine();

        int tamanhoFormula = formula.length();
        int tamanhoSimbolosEspeciais = simbolosEspeciais.length;

        Pilha pilha = new Pilha(tamanhoFormula);

        for(int indexFormula = 0; indexFormula < tamanhoFormula; indexFormula++ ){
            boolean encontrado = false;

            // Verificar se o caracter é um simbolo especial
            for(int indexSimbolosEspeciais = 0; indexSimbolosEspeciais < tamanhoSimbolosEspeciais; indexSimbolosEspeciais++ ){
                if(formula.charAt(indexFormula) == simbolosEspeciais[indexSimbolosEspeciais]){
                    encontrado = true;
                    break;
                }
            }

            // Se o caracter é um simbolo especial então empilhe ou desempilhe
            if (encontrado){
                if (
                    (Objects.equals(pilha.pegarUltimoDado(), "{") && Objects.equals(formula.charAt(indexFormula), '}')) ||
                    (Objects.equals(pilha.pegarUltimoDado(), "[") && Objects.equals(formula.charAt(indexFormula), ']')) ||
                    (Objects.equals(pilha.pegarUltimoDado(), "(") && Objects.equals(formula.charAt(indexFormula), ')'))
                ){
                    System.out.println("Desempilhando caracter: " + formula.charAt(indexFormula));
                    pilha.desempilha();
                } else {
                    System.out.println("Empilhando caracter: " + formula.charAt(indexFormula));
                    pilha.empilha(String.valueOf(formula.charAt(indexFormula)));
                }
            }
        }

        if (pilha.vazia()){
            System.out.println("Operação informada válida");
        } else {
            System.out.println("Operação informada inválida");
        }
    }
}