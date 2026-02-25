public class Main {
    public static void main(String[] args) {
        objproducto[][] matriz1 = new objproducto[2][2];
        objproducto[][] matriz2 = new objproducto[2][2];
        objproducto[][] matriztotal = new objproducto[2][2];
        metodos m = new metodos();
        m.Llenarmatriz(matriz1);
        m.Llenarmatriz(matriz2);
        m.SumarStock(matriz1, matriz2, matriztotal);
        m.Mostrarmatriz(matriztotal);
    
        }
}