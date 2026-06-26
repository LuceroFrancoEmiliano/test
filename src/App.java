public class App {
    
    public static void main(String[] args) throws Exception {
        Nodo n1 = new Nodo ("1");
        Nodo n2 = new Nodo ("2");
        Nodo n3 = new Nodo ("3");
        Nodo n4 = new Nodo (n1,"4", n3);
        Nodo n5 = new Nodo (n2, "5", n4);
        Nodo n6 = new Nodo (n5, "6", null);

        ArbolBinario arbol = new ArbolBinario (n4);

        System.out.println("Cantidad de Nodos: " + arbol.contarNodos());
        System.out.println("Cantidad de Hojas: " +arbol.contarHojas());
            //a
        System.out.println("Recorridos: ");
        System.out.println("PreOrden --> "); arbol.preOrden();
        System.out.println("InOrden --> "); arbol.inOrden();
        System.out.println("PostOrden --> "); arbol.postOrden();


    }
}