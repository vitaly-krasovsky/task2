package com.epam.training.domain;

import com.fasterxml.jackson.databind.JsonNode;

import static com.epam.training.service.parse.ParserConstants.PROPERTY_HEIGHT;
import static com.epam.training.service.parse.ParserConstants.PROPERTY_RADIUS;
import static com.epam.training.service.parse.ParserConstants.PROPERTY_SIDE_1;
import static com.epam.training.service.parse.ParserConstants.PROPERTY_SIDE_2;

/**
 * Factory for all figures in application.
 *
 * @author vkrasovsky
 */
public final class FiguresFactory {
    private FiguresFactory() {
    }

    /**
     * Build figure by concrete type and figure parameters from json.
     *
     * @param type     the type
     * @param jsonNode the json node
     * @return concrete figure based on type
     */
    public static AbstractFigure createFigure(FigureTypeEnum type, JsonNode jsonNode) {
        AbstractFigure figure;
        switch (type) {
            case CONE:
                figure = new Cone(jsonNode.get(PROPERTY_RADIUS).asLong(), jsonNode.get(PROPERTY_HEIGHT).asLong());
                break;
            case CUBE:
                figure = new Cube(jsonNode.get(PROPERTY_SIDE_1).asLong());
                break;
            case CYLINDER:
                figure = new Cylinder(jsonNode.get(PROPERTY_RADIUS).asLong(), jsonNode.get(PROPERTY_HEIGHT).asLong());
                break;
            case HALF_SPHERE:
                figure = new HalfSphere(jsonNode.get(PROPERTY_RADIUS).asLong(), jsonNode.get(PROPERTY_HEIGHT).asLong());
                break;
            case RECTANGULAR_PARALLELEPIPED:
                figure = new RectangularParallelepiped(jsonNode.get(PROPERTY_SIDE_1).asLong(), jsonNode.get(PROPERTY_SIDE_2).asLong(), jsonNode.get(PROPERTY_HEIGHT).asLong());
                break;
            default:
                throw new IllegalArgumentException("Unsupported figure type");
        }
        return figure;
    }
}
