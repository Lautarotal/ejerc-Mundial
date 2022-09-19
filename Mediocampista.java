class Mediocampista extends Jugador{
    Mediocampista() {
        super();

        @override
        public double potencialTotal() {
            return potencialOfensivo() + 30 + potencialDefensivo() + 15;
        }
    }
}