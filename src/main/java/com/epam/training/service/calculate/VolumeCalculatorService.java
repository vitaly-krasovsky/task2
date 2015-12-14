package com.epam.training.service.calculate;

import com.epam.training.domain.AbstractFigure;

import java.util.List;

/**
 * Used for volume calculations.
 *
 * @author vkrasovsky
 */
public interface VolumeCalculatorService {
    /**
     * @param figures the list of the figures
     * @return volume
     */
    double calculateVolume(List<AbstractFigure> figures);
}
