public class Main {
    public static void main(String[] args) {
        // aula de orientação de objetos
        //declarar objetos
        Pessoa stan;
        //instanciar objeto
        stan = new Pessoa();
        Pessoa eric = new Pessoa();
        //definição do formato do objeto
        stan.nome = "Stan";
        stan.sobrenome = "Marsh";
        eric.nome = "Eric";
        eric.sobrenome = "Cartman";
        //acionar comportamento
        stan.falar();
        eric.falar();
    }
}