package com.epam.training.service.create;

import com.epam.training.domain.AbstractFigure;
import com.epam.training.domain.Cube;
import com.epam.training.domain.Cylinder;
import com.epam.training.service.parse.ParserServiceImpl;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

/**
 * @author vkrasovsky
 */
public class FiguresCreatorServiceImplTest {

    FiguresCreatorService figuresCreatorService;

    @Test
    public void shouldBuildListWithCubeAndCylinderWhenTheyPresentInFile() {
        figuresCreatorService = new FiguresCreatorServiceImpl();

        //given
        ParserServiceImpl mock = Mockito.mock(ParserServiceImpl.class);
        ObjectNode cubeRaw = new ObjectNode(JsonNodeFactory.instance);
        cubeRaw.put("type", "CUBE");
        cubeRaw.put("side1", 4);

        ObjectNode cylinderRaw = new ObjectNode(JsonNodeFactory.instance);
        cylinderRaw.put("type", "CUBE");
        cylinderRaw.put("side1", 4);

        ArrayNode arrayNode = new ArrayNode(JsonNodeFactory.instance);
        arrayNode.add(cubeRaw);
        arrayNode.add(cylinderRaw);

        Mockito.when(mock.parse()).thenReturn(arrayNode);

        //when
        List<AbstractFigure> figures = figuresCreatorService.buildFigures();

        //then
        Assert.assertEquals(new Cube(4L).getSide1(), ((Cube) figures.get(0)).getSide1());
        Assert.assertEquals(new Cylinder(12L, 3L).getRadius(), ((Cylinder) figures.get(1)).getRadius());
        Assert.assertEquals(new Cylinder(12L, 3L).getHeight(), ((Cylinder) figures.get(1)).getHeight());
    }
}
