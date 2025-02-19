package composite;

import java.util.List;

public class Libro  implements  ComponenteLibro{
    private String titolo;
    private Pagina pagina;
    private  double prezzo;
    private List<Autore> autori;
    private List<Sezione> sezione;

    public Libro(String titolo, Pagina pagina, double prezzo, List<Autore> autori, List<Sezione> sezione) {
        this.titolo = titolo;
        this.pagina = pagina;
        this.prezzo = prezzo;
        this.autori = autori;
        this.sezione = sezione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public List<Sezione> getSezione() {
        return sezione;
    }

    public void setSezione(List<Sezione> sezione) {
        this.sezione = sezione;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public Pagina getPagina() {
        return pagina;
    }

    public void setPagina(Pagina pagina) {
        this.pagina = pagina;
    }

    public List<Autore> getAutori() {
        return autori;
    }

    public void setAutori(List<Autore> autori) {
        this.autori = autori;
    }

    @Override
    public int getNumeroPagine() {
        return 0;
    }
}
