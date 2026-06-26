public class ArbolBinario {
    protected Nodo raiz;

    // constructor vacío
    public ArbolBinario () {
        raiz = null;
    }

    // constructir con nodo
    public ArbolBinario (Nodo raiz) {
        this.raiz = raiz;
    }

    boolean esVacío () {
        return raiz == null;
    }

    public static Nodo nuevoArbol (Nodo ramaIzq, Object dato, Nodo ramaDer) {
        return new Nodo(ramaIzq, dato, ramaDer);
    }

    // Contador de Nodos y Contador de Hojas
    public int contarNodos () {
        return contarNodos (raiz);
    }
    
    private int contarNodos (Nodo n) {
        if (n==null) {
            return 0;
        }
        return 1 + contarNodos (n.subIzq()) + contarNodos (n.subDer());
    }

    public int contarHojas () {
        return contarHojas(raiz);
    }

    private int contarHojas (Nodo n) {
        if (n == null) {
            return 0;
        }
        if(n.subIzq()==null && n.subDer()==null) {
            return 1;
        }
        return contarHojas(n.subIzq()) + contarHojas(n.subDer());
    }

    // Recorridos
    public void preOrden () {
        preOrden (raiz);
    }

    private void preOrden (Nodo n) {
        if (n != null) {
            System.out.println(n.valorNodo() + " ");
            preOrden (n.subIzq());
            preOrden (n.subDer());            
        }
    }

    public void inOrden () {
        inOrden (raiz);
    }

    private void inOrden (Nodo n) {
        if (n != null) {
            inOrden (n.subIzq());
            System.out.println(n.valorNodo() + " ");
            inOrden (n.subDer());
        }
    }

    public void postOrden() {
        postOrden (raiz);
    }

    private void postOrden (Nodo n) {
        if (n != null) {
            postOrden (n.subIzq());
            postOrden(n.subDer());
            System.out.println(n.valorNodo() + " ");
        }
    }


}