package ru.arkhipov.MySecondTestAppSrpringBoot.service;

import org.springframework.stereotype.Service;
import ru.arkhipov.MySecondTestAppSrpringBoot.model.Positions;

import java.time.Year;

@Service
public class AnnualBonusServiceImpl implements AnnualBonusService {

    @Override
    public double calculate(Positions positions, double salary, double bonus, int workDays) {
        int daysInYear = getDaysInYear(Year.now().getValue());
        return salary * bonus * 365 * positions.getPositionCoefficient() / workDays ;
    }

    private int getDaysInYear(int year) {
        return Year.of(year).length();
    }


    public double calculateQuarterlyBonus(Positions positions, double salary, double quarterlyBonus) {

        if(!positions.isManager()) {
            throw new IllegalArgumentException("Квартальная премия доступна только для менеджеров" + "Сотрудник с должностью "
                    + positions.name() + "не является менеджером.");
        }
        return salary * quarterlyBonus * positions.getPositionCoefficient();
    }
}