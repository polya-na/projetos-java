package java_no;

public class Main {
    public static void main(String[] args) {
        No<String> no1 = new No<>("Conteúdo do 1° nó");
        No<String> no2 = new No<>("Conteúdo do 2° nó");
        No<String> no3 = new No<>("Conteúdo do 3° nó");
        No<String> no4 = new No<>("Conteudo do 4° nó");
        no1.setProximoNo(no2);
        no2.setProximoNo(no3);
        no3.setProximoNo(no4);

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
    }
}
