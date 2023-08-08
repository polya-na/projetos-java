package java_pilhas;

public class Main {
    public static void main(String[] args) {
        Pilha minhaPilha = new Pilha();

        minhaPilha.push(new NoPilhas(1));
        minhaPilha.push(new NoPilhas(2));
        minhaPilha.push(new NoPilhas(3));
        minhaPilha.push(new NoPilhas(4));
        minhaPilha.push(new NoPilhas(5));
        minhaPilha.push(new NoPilhas(6));

        System.out.println(minhaPilha);
    }
}
