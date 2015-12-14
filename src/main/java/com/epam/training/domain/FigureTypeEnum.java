package com.epam.training.domain;

/**
 * This enum holds all possible types of the figures.
 *
 * @author Vitaly_Krasovsky.
 */
public enum FigureTypeEnum {
    CONE,
    CUBE,
    CYLINDER,
    HALF_SPHERE,
    RECTANGULAR_PARALLELEPIPED;

    /**
     * @param type the type
     * @return figure enum type
     */
    public static FigureTypeEnum getType(String type) {
        FigureTypeEnum figure = null;
        try {
            figure = FigureTypeEnum.valueOf(type);

        } catch (Exception e) {
            //log
        }
        return figure;
    }
}
