package es.ieslavereda.juegodados;

public enum Dado {
    UNO(R.mipmap.ic_uno_foreground),
    DOS(R.mipmap.ic_dos_foreground),
    TRES(R.mipmap.ic_tres_foreground),
    CUATRO(R.mipmap.ic_cuatro_foreground),
    CINCO(R.mipmap.ic_cinco_foreground),
    SEIS(R.mipmap.ic_seis_foreground);

    private int imagen;
    Dado(int imagen){
        this.imagen=imagen;
    }

    public int getImagen() {
        return imagen;
    }
}
