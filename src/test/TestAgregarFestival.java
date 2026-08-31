package test;


import negocio.FestivalAbm;

import java.time.LocalDate;

public class TestAgregarFestival {

    public static void main(String[] args) {

        try {
            FestivalAbm.getInstance().agregarFestival("Globos", "Verano",
                    LocalDate.of(2026, 8, 31),LocalDate.of(2026, 10, 1),
                    50000f, 20000f, 30000f, 20000f);

            FestivalAbm.getInstance().agregarFestival("Lollapalooza", "Otoño",
                    LocalDate.of(2026, 3, 15), LocalDate.of(2026, 3, 18),
                    150000f, 80000f, 40000f, 30000f);

            FestivalAbm.getInstance().agregarFestival("Oktoberfest", "Primavera",
                    LocalDate.of(2026, 10, 5), LocalDate.of(2026, 10, 15),
                    90000f, 35000f, 30000f, 25000f);

            FestivalAbm.getInstance().agregarFestival("Cosquín Rock", "Invierno",
                    LocalDate.of(2026, 7, 10), LocalDate.of(2026, 7, 12),
                    75000.50f, 30505.2f, 25000f, 20000f);
            System.out.println("Festivales agregados exitosamente!!!");
        } catch (Exception e) {
            e.getMessage();
        }

    }

}
