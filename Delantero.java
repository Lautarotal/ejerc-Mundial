class Delantero extends Jugador{
    Delantero(){
        super();

        @override
        public double potencialTotal() {
            return potencialOfensivo() * 2 + potencialDefensivo();
        }
    }
}