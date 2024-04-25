package EstructurasNoLineales;

public class NodoArbol {
    private int valor;
    private NodoArbol nodoIzquierdo;
    private NodoArbol nodoDerecho;
    public NodoArbol(int valor){
    this.valor=valor;
    this.nodoIzquierdo=null;
    this.nodoDerecho=null;
    }

    public int getValor() {
        return valor;
    }

    public NodoArbol getNodoIzquierdo() {
        return nodoIzquierdo;
    }

    public NodoArbol getNodoDerecho() {
        return nodoDerecho;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void insertar(int _valor){
        if(_valor < this.valor){
            if(this.nodoIzquierdo == null){
                // insertar en el lado izquierdo
                this.nodoIzquierdo = new NodoArbol(_valor);
            }else{
               this.nodoDerecho.insertar(_valor);
            }
        }else{
            //insertar en el lado derecho
            if(this.nodoDerecho == null){
                this.nodoDerecho = new NodoArbol(_valor);
            }else{
                this.nodoDerecho.insertar(_valor);
            }
        }
    }
}