public class ListaDupla<T> {

    private NoListaDupla<T> primeiro;

    public ListaDupla() {
        this.primeiro = null;
    }

    public NoListaDupla<T> getPrimeiro() {
        return this.primeiro;
    }

    public void inserir(T info) {
        NoListaDupla<T> novo = new NoListaDupla<T>();
        novo.setInfo(info);
        novo.setProximo(this.primeiro);
        novo.setAnterior(null);
        if (this.primeiro != null) {
            this.primeiro.setAnterior(novo);
        }
        this.primeiro = novo;
    }

    public NoListaDupla<T> buscar(T info){
        NoListaDupla<T> aux = this.primeiro;
        while (aux != null) {
            if (aux.getInfo().equals(info)) {
                return aux;
            }
            aux = aux.getProximo();
        }
        return null;
    }

    public void retirar(T info) {
        NoListaDupla<T> aux = this.primeiro;
        while (aux != null) {
            if (aux.getInfo().equals(info)) {
                if (aux.getAnterior() != null) {
                    aux.getAnterior().setProximo(aux.getProximo());
                } else {
                    this.primeiro = aux.getProximo();
                }
                if (aux.getProximo() != null) {
                    aux.getProximo().setAnterior(aux.getAnterior());
                }
                return;
            }
            aux = aux.getProximo();
        }
    }

    public void exibirOrdemInversa() {
        NoListaDupla<T> aux = this.primeiro;
        while (aux.getProximo() != null) {
            aux = aux.getProximo();
        }
        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getAnterior();
        }
    }

    public void liberar(){
        NoListaDupla<T> aux = this.primeiro;
        while (aux != null) {
            NoListaDupla<T> aux2 = aux.getProximo();
            aux.setProximo(null);
            aux.setAnterior(null);
            aux = aux2;
        }
    }

    public String toString(){
        String valores = "";
        NoListaDupla<T> aux = this.primeiro;
        while (aux != null) {
            valores += aux.getInfo() + ", ";
            aux = aux.getProximo();
        }
        return valores;
    }
}
