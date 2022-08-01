package model;

import java.io.Serializable;
import java.time.LocalDate;

public interface Conditions extends Serializable {
    double getRealMoney();

    LocalDate getShelfLife();
}
