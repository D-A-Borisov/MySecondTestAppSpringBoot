package ru.arkhipov.MySecondTestAppSrpringBoot.service;

import org.junit.jupiter.api.Test;
import ru.arkhipov.MySecondTestAppSrpringBoot.model.Positions;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
class AnnualQuarterlyBonusServiceImplTest {

    @Test
    void calculateQuarterlyBonus() {

        //given

        Positions positions = Positions.PM;

        double salary = 100000.00;
        double quarterlyBonus = 0.5;

        //when

        double result = new AnnualBonusServiceImpl().calculateQuarterlyBonus(positions, salary, quarterlyBonus);

        //then

        double expceted = salary * quarterlyBonus * positions.getPositionCoefficient();
        assertThat(result).isEqualTo(expceted);
    }
}