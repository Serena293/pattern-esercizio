package adapter;

import java.util.Date;

public class InfoAdapter implements DataSource {
    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        // Combina nome e cognome per ottenere il nome completo
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        // Calcola l'età dalla data di nascita
        int currentYear = java.time.Year.now().getValue();
        int birthYear = info.getDataDiNascita().getYear();
        return currentYear - birthYear;
    }
}
