//                                  __           .__                    __
//  ____    _____    ____   _______/  |_ _____   |  |    ____    ____  |  | __
//_/ __ \  /     \  /  _ \ /  ___/\   __\\__  \  |  |   /  _ \  /  _ \ |  |/ /
//\  ___/ |  Y Y  \(  <_> )\___ \  |  |   / __ \_|  |__(  <_> )(  <_> )|    <
// \___  >|__|_|  / \____//____  > |__|  (____  /|____/ \____/  \____/ |__|_ \
//     \/       \/             \/             \/                            \/
//
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

        // criar mais objetos (classe, objeto, construtor)
        Pessoa kenny = new Pessoa();
        //declarar objeto
        Pessoa kyle;
        //instaciação do objeto
        kyle = new Pessoa();
        //definindo forma da pessoa
        kyle.nome = "Kyle";
        kyle.sobrenome = "Buttlowski";
        //definição de comportamento
        System.out.println(kyle.falar(" alto "));
        kyle.comer();
    }

}