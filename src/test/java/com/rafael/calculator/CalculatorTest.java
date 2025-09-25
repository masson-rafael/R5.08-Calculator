package com.rafael.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Set;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    // Méthode statique qui fournit les données de test
    static Stream<Arguments> donneesTestsAddition() {
        return Stream.of(
                Arguments.of(0, 1, 1),
                Arguments.of(1, 2, 3),
                Arguments.of(-2, 2, 0),
                Arguments.of(0, 0, 0),
                Arguments.of(-1, -2, -3)
        );
    }

    @ParameterizedTest(name = "Test {index}: {0} + {1} = {2}")
    @MethodSource("donneesTestsAddition")
    void devrait_renvoyer_le_resultat_de_toutes_les_additions(int opG, int opD, int resultatAttendu) {
        // WHEN
        int res = Calculator.add(opG, opD);

        // THEN
        assertThat(res).isEqualTo(resultatAttendu);
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