public class Animales {
    private String nombre;
    private int vida;
    private String[] nombreAtaques;
    private int[] ataques;
    private boolean esAmigo;

    public Animales(String nombre, int vida, String[] nombreAtaques, int[] ataques, boolean esAmigo) {
        this.nombre = nombre;
        this.vida = vida;
        this.nombreAtaques = nombreAtaques;
        this.ataques = ataques;
        this.esAmigo = esAmigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String[] getNombreAtaques() {
        return nombreAtaques;
    }

    public void setNombreAtaques(String[] nombreAtaques) {
        this.nombreAtaques = nombreAtaques;
    }

    public int[] getAtaques() {
        return ataques;
    }

    public void setAtaques(int[] ataques) {
        this.ataques = ataques;
    }

    public boolean isEsAmigo() {
        return esAmigo;
    }

    public void setEsAmigo(boolean esAmigo) {
        this.esAmigo = esAmigo;
    }
}
