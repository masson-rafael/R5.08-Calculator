package com.rafael.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @ParameterizedTest(name = "Test {index}: {0} + {1} = {2}")
    @CsvSource({
            "0, 1, 1",
            "1, 2, 3",
            "-2, 2, 0",
            "0, 0, 0",
            "-1, -2, -3"
    })
    void devrait_renvoyer_le_resultat_de_toutes_les_additions(int opG, int opD, int resultatAttendu) {
        // WHEN
        int res = Calculator.add(opG, opD);

        // THEN
        assertThat(res).isEqualTo(resultatAttendu);
    }

    @Test
    void devrait_renvoyer_additionner_les_deux_nombres() {
        // GIVEN
        int opG = 2;
        int opD = 3;

        // WHEN
        int res = Calculator.add(opG,opD);

        // THEN
        assertThat(res).isEqualTo(5);
    }

    @Test
    void devrait_renvoyer_soustraire_les_deux_nombres() {
        // GIVEN
        int opG = 2;
        int opD = -3;

        // WHEN
        int res = Calculator.add(opG,opD);

        // THEN
        assertThat(res).isEqualTo(-1);
    }

    @Test
    void devrait_renvoyer_diviser_les_deux_nombres() {
        // GIVEN
        int opG = 4;
        int opD = 2;

        // WHEN
        int res = Calculator.divide(opG,opD);

        // THEN
        assertThat(res).isEqualTo(2);
    }
}