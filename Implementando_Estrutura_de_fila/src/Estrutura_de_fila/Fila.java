package Estrutura_de_fila;

public class Fila <T> {
	
    private No <T> refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    public void enqueue(T object) {
        No novoNo = new No(object);
        novoNo.setRefno(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public T first() {
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getRefno() != null) {
                    primeiroNo = primeiroNo.getRefno();
                }else {
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public T dequeue() {
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getRefno() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefno();
                }else {
                    noAuxiliar.setRefno(null);
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public boolean isEmpty() {
        return refNoEntradaFila == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaFila;

        if(refNoEntradaFila != null) {
            while (true) {
                stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]--->";
                if(noAuxiliar.getRefno() != null) {
                    noAuxiliar = noAuxiliar.getRefno();
                } else {
                    stringRetorno += "null";
                    break;
                }
            }
        } else {
            stringRetorno = "null";
        }
        return stringRetorno;
    }

}
