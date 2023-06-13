public class Solo {

    //atributos
    String tipo;
    String cor;
    String substancia;
    boolean fertil;

    //metodos
    public Planta gerarPlanta(Semente s1){
        Planta p1 = new Planta(s1);
        return p1;
    }
}
