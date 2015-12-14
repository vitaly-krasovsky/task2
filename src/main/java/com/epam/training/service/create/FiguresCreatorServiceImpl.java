package com.epam.training.service.create;

import com.epam.training.domain.AbstractFigure;
import com.epam.training.domain.FigureTypeEnum;
import com.epam.training.domain.FiguresFactory;
import com.epam.training.service.parse.ParserServiceImpl;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;

import java.util.ArrayList;
import java.util.List;

import static com.epam.training.service.parse.ParserConstants.FILE_NAME;
import static com.epam.training.service.parse.ParserConstants.PROPERTY_FIGURES;
import static com.epam.training.service.parse.ParserConstants.PROPERTY_TYPE;

/**
 * Default implementation of FiguresCreatorService.
 *
 * @author vkrasovsky
 */
public class FiguresCreatorServiceImpl implements FiguresCreatorService {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<AbstractFigure> buildFigures() {
        ParserServiceImpl parserServiceImpl = new ParserServiceImpl(FILE_NAME);

        List<AbstractFigure> figures = new ArrayList<>();

        ArrayNode figuresArrayNode;

        figuresArrayNode = (ArrayNode) parserServiceImpl.parse().get(PROPERTY_FIGURES);

        if (figuresArrayNode == null)
            return new ArrayList<>();

        for (int i = 0; i < figuresArrayNode.size(); i++) {
            JsonNode jsonNode = figuresArrayNode.get(i);
            FigureTypeEnum type = FigureTypeEnum.getType(jsonNode.get(PROPERTY_TYPE).asText());
            figures.add(FiguresFactory.createFigure(type, jsonNode));
        }

        return figures;
    }
}
