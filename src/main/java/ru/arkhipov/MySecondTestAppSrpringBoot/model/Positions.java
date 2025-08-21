package ru.arkhipov.MySecondTestAppSrpringBoot.model;

import lombok.Getter;

@Getter
public enum Positions {
    DEV(2.2, false),        //Developer
    HR(1.2, false),         //HR-Specialist
    TL(2.6, true),          //Manager
    PM(2.4, true),          //Project Manager
    QA(1.8, false),         //Quality Assuranse
    UX_UI(1.5, false),      //UX/UI Designer
    CEO(3.0, true);         //Chief Executive Officer

    private final double positionCoefficient;
    private final boolean isManager;

    Positions(double positionCoefficient, boolean isManager){

        this.positionCoefficient = positionCoefficient;
        this.isManager = isManager;
    }
}