package Music;

public class Canzone {
    private String artista;
    private String titolo;
    private String album;
    private int ascolti;

    public Canzone(String artista, String titolo,String album, int ascolti){
        this.artista = artista;
        this.titolo = titolo;
        this.album = album;
        this.ascolti = ascolti;
    }

    public String getArtista(){ return artista;}
    public String getTitolo() { return titolo;}
    public int getAscolti(){ return ascolti;}
    public String getAlbum() { return album;}
    public void setArtista(String artista){ this.artista = artista;}
    public void setTitolo(String titolo){ this.titolo = titolo;}
    public void setAlbum(String album){ this.album = album;}
    public void setAscolti(int ascolti){ this.ascolti = ascolti;}



}
