
public class MatrizMZ {

    public int matrizcuadrada;
    public int matriztriangular;

    public MatrizMZ(int matrizcuadrada, int matriztriangular) {
        this.matrizcuadrada = matrizcuadrada;
        this.matriztriangular = matriztriangular;
    }

    public int getMatrizcuadrada() {
        return matrizcuadrada;
    }

    public void setMatrizcuadrada(int matrizcuadrada) {
        this.matrizcuadrada = matrizcuadrada;
    }

    public int getMatriztriangular() {
        return matriztriangular;
    }

    public void setMatriztriangular(int matriztriangular) {
        this.matriztriangular = matriztriangular;
    }

    public boolean Matriz(int n, int m){
        int Matriz = n * m;

        for (int i = n; i >=0; i++){
            System.out.println("Introduce el valor de n:" + n);
            return true;
        }
        for (int i = m; i >= 0; i++){
            System.out.println("Introduce el valor de m:" + m);
            return true;
        }
        return false;

    }

    public boolean esCuadrada(int m, int n){
        if (n == m){
            return true;
        }return false;
    }

    public boolean esTriangular(int m, int n){
        if (m >= 0 ){
            return false;
        } else if (n >= 0){
            return false;
        }
        return true;
    }

}
