public class Equipo {
    String equipoName ;

    List<Jugador> jugadores = new ArrayList<Jugador>() ; ;

    public Equipo(String equipoName){
        this.equipoName = equipoName;
    }

    public void addJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public String getequipoName(){
        return equipoName;
    }

    public List<Jugador> getJugadores(){
        return  jugadores ;
    }

    public void potencialdeJuego(){
        return System.out.println("El potencial de juego del equipo es" + potencialdeJuego());
    }
}



