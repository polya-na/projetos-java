package java_pilhas;

public class NoPilhas {
    private int dado;
    private NoPilhas refNo = null;

    public NoPilhas() {
    }

    public NoPilhas(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public NoPilhas getRefNo() {
        return refNo;
    }

    public void setRefNo(NoPilhas refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No [dado=" + dado + "]";
    }
}
