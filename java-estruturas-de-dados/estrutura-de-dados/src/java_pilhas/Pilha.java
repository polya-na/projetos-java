package java_pilhas;

public class Pilha {
    NoPilhas refNoEntradaPilha = null;

    public void push(NoPilhas novoNo){
        NoPilhas refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public NoPilhas pop(){
        if(!isEmpty()){
            NoPilhas noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    public NoPilhas top(){
        return refNoEntradaPilha;
    }

    public boolean isEmpty(){
        return refNoEntradaPilha == null ? true : false;
    }

   @Override
    public String toString() {
        String stringRetorno = "------------\n";
        stringRetorno += "   Pilha\n";
        stringRetorno += "------------\n";
        NoPilhas noAuxiliar = refNoEntradaPilha;
        while(true){
            if(noAuxiliar != null) {
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            } else {
                break;
            }
        }
        stringRetorno += "============";
        return stringRetorno;
    }
}
