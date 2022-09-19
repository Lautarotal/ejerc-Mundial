public class Aplicacion {

    HashMap<String ,Equipo> equipos = new LinkedHashMap<String ,Equipo>();


    public void addEquipo(String equipoName) {
        Equipo equipo =  new Equipo(equipoName) ;
        equipos.put(equipoName ,equipo);
    }

    public void addJugador(String getNombre, String getApellido, double getMasa, double getInteligencia, double getReflejos) {
        Jugador jugador = new Jugador(getNombre, getApellido, getMasa, getInteligencia, getReflejos);
        Equipo equipo = equipos.get(equipoName) ;
        equipo.addJugador(jugador);
    }

    public void print(){
        for(Map.Entry<String , Equipo> entry : equipos.entrySet() ) {
            Equipo equipo = entry.getValue();
            System.out.println("Nombre del Equipo: " + equipo.getequipoName());
            System.out.println("Jugadores : " + equipo.getPlayers().toString());
        }
    }

    public static void main (String args[]) throws Exception{

        Aplicacion aplicacion = new Aplicacion();

        aplicacion.addEquipo("equipo1");
        aplicacion.addEquipo("equipo2");

        aplicacion.addJugador("equipo1","jug1","dor1",20);
        aplicacion.addJugador("equipo1","jug2","dor2",30);
        aplicacion.addJugador("equipo2","jug3","dor3",40);

        aplicacion.print();

    }
}