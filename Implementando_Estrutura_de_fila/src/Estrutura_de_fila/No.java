package Estrutura_de_fila;

public class No <T>{
	
    private T object;
    private No <T> refno;

    public No(){

    }

    public No ( T object){
        this.refno = null;
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public No getRefno() {
        return refno;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public void setRefno(No refno) {
        this.refno = refno;
    }

    @Override
    public String toString() {
        return "No{" +
                "object=" + object +
                '}';
    }

}
