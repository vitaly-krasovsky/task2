package com.epam.training.service.create;

import com.epam.training.domain.AbstractFigure;

import java.util.List;

/**
 * Used for creating figures list.
 *
 * @author vkrasovsky
 */
public interface FiguresCreatorService {
    List<AbstractFigure> buildFigures();
}
