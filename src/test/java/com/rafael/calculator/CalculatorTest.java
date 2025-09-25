package com.rafael.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void devrait_renvoyer_additionner_les_deux_nombres() {
        // GIVEN
        Calculator calculator = new Calculator();
        int opG = 2;
        int opD = 3;

        // WHEN
        int res = calculator.add(opG,opD);

        // THEN
        assertThat(res).isEqualTo(5);
    }

    @Test
    void devrait_renvoyer_soustraire_les_deux_nombres() {
        // GIVEN
        Calculator calculator = new Calculator();
        int opG = 2;
        int opD = -3;

        // WHEN
        int res = calculator.add(opG,opD);

        // THEN
        assertThat(res).isEqualTo(-1);
    }

    @Test
    void devrait_renvoyer_diviser_les_deux_nombres() {
        // GIVEN
        Calculator calculator = new Calculator();
        int opG = 4;
        int opD = 2;

        // WHEN
        int res = calculator.divide(opG,opD);

        // THEN
        assertThat(res).isEqualTo(2);
    }
}