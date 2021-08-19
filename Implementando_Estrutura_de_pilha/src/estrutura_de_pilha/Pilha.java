package estrutura_de_pilha;

public class Pilha {
	
    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push (No novoNo){
        No refauxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refauxiliar);
    }

    public No pop (){
        if(!this.isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    public No top(){
        return refNoEntradaPilha;
    }

    public boolean isEmpty(){
        // return refNoEntradaPilha == null ? true : false;
        if (refNoEntradaPilha == null) {
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        String stringRetorno = "-----------------\n";
        stringRetorno += "      Pilha\n";
        stringRetorno += "-----------------\n";

        No noAuxiliar = refNoEntradaPilha;

        while (true){
            if(noAuxiliar != null){
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }else{
                break;
            }
        }
        stringRetorno += "==============\n";
        return stringRetorno;

    }

}
