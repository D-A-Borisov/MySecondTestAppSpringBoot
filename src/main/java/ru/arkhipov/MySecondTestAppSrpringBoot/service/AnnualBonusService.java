package ru.arkhipov.MySecondTestAppSrpringBoot.service;

import org.springframework.stereotype.Service;
import ru.arkhipov.MySecondTestAppSrpringBoot.model.Positions;

@Service
public interface AnnualBonusService {

    double calculate(Positions positions, double salary, double bonus, int workDays);
}