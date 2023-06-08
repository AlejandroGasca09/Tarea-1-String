package org.example.modelo;


import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneroMusical {
    private int id;
    private String genero;
    private String artista;
    private String album;
    private String pais;
    private String url;

    public GeneroMusical() {
    }

    public GeneroMusical(int id, String genero, String artista, String album, String pais, String url) {
        this.id = id;
        this.genero = genero;
        this.artista = artista;
        this.album = album;
        this.pais = pais;
        this.url = url;
    }

    public String getId() {
        return String.valueOf(id);
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "GeneroMusical{" +
                "id=" + id +
                ", genero='" + genero + '\'' +
                ", artista='" + artista + '\'' +
                ", album='" + album + '\'' +
                ", pais='" + pais + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
    public ImageIcon getImagen() throws MalformedURLException {
        URL urlImage = new URL(this.url);
        return new ImageIcon(urlImage);
    }
}
