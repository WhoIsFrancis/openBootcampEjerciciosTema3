public class Auto {
    int numPuertas;

    Auto(int numPuertas){
        this.numPuertas = numPuertas;
    }


    public int incrementarPuertas(){
        return numPuertas += 1;
    }

}
