
package boletin13;


public class Boletin13 {


        public static void main(String[] args) {
        SeleccionFutbol equipo = new SeleccionFutbol();
        Xogador unXogador = new Xogador();
        Adestrador unAdestrador = new Adestrador();
        Masaxista unMasaxista = new Masaxista();
        
        unXogador.concentrarse();
        unAdestrador.concentrarse();
        unMasaxista.concentrarse();
        
        unXogador.viajar();
        unAdestrador.viajar();
        unMasaxista.viajar();

    }
    
}