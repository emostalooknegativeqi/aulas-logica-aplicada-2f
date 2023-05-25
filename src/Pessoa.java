//                                  __           .__                    __
//  ____    _____    ____   _______/  |_ _____   |  |    ____    ____  |  | __
//_/ __ \  /     \  /  _ \ /  ___/\   __\\__  \  |  |   /  _ \  /  _ \ |  |/ /
//\  ___/ |  Y Y  \(  <_> )\___ \  |  |   / __ \_|  |__(  <_> )(  <_> )|    <
// \___  >|__|_|  / \____//____  > |__|  (____  /|____/ \____/  \____/ |__|_ \
//     \/       \/             \/             \/                            \/
//
public class Pessoa extends Animal {

    //atributos da classe

    String sobrenome;

    //metodo da classe
    public void falar(){
        System.out.println("omg they killed kenny kk");
    }

    public String falar(String volume){
        return "your bastards" + volume;
    }
    //sobreescrita do metodo
    public void comer(){
        System.out.println("pessoa comeu ");
    }
}
