package adapter;

import java.util.Date;

public class InfoAdapter implements DataSource {
    private final Info info;

    //costruttore
    public InfoAdapter(Info info) {
        this.info = info;
    }

    //metodo dell'interfaccia che otteniamo adattando i valori di info
    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    //uguale per l'età
    @Override
    public int getEta() {
             int currentYear = java.time.Year.now().getValue();
        int birthYear = info.getDataDiNascita().getYear();
        return currentYear - birthYear;
    }
}
