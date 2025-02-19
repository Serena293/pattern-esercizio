package org.example;

import adapter.DataSource;
import adapter.Info;
import adapter.InfoAdapter;
import adapter.UserData;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Info
        Info info = new Info("Serena", "Rossi", LocalDate.of(2000, 6, 15)); // Anno 1990, Giugno 15
        DataSource ds = new InfoAdapter(info);

        // UserData
        UserData user = new UserData("", 0);
        user.getData(ds);

        System.out.println("Nome Completo: " + user.getNomeCompleto());
        System.out.println("Età: " + user.getEta());
    }
}
