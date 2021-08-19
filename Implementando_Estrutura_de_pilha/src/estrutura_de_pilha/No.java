package estrutura_de_pilha;

public class No {
	
    private int dado;
    private No refNo = null;

    public No() {

    }

    public No(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public void setRefNo(No reNo) {
        this.refNo = reNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                '}';
    }

}
