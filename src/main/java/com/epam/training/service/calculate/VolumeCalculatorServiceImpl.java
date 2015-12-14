package com.epam.training.service.calculate;

import com.epam.training.domain.AbstractFigure;

import java.util.List;

/**
 * Default implementation of VolumeCalculatorService.
 *
 * @author Vitaly_Krasovsky.
 */
public class VolumeCalculatorServiceImpl implements VolumeCalculatorService {
    /**
     * {@inheritDoc}
     */
    @Override
    public double calculateVolume(List<AbstractFigure> figures) {
        double result = 0.0;
        for (AbstractFigure figure : figures) {
            result += figure.calculateVolume();
        }
        return result;
    }
}
