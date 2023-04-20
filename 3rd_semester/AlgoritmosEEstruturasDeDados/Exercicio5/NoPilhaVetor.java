public class NoPilhaVetor<T> {
    private T info;
    private NoPilhaVetor<T> proximo;


    public NoPilhaVetor() {
         
    }


    public T getInfo() {
        return info;
    }


    public void setInfo(T info) {
        this.info = info;
    }


    public NoPilhaVetor<T> getProximo() {
        return proximo;
    }


    public void setProximo(NoPilhaVetor<T> proximo) {
        this.proximo = proximo;
    }
}
