package com.epam.training.service.parse;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import org.junit.Assert;
import org.junit.Test;

import static com.epam.training.service.parse.ParserConstants.PROPERTY_FIGURES;

/**
 * @author vkrasovsky
 */
public class ParserServiceImplTest {

    ParserService parserService;

    @Test
    public void shouldWriteIntoLogWhenFileCorruptedAndReturnNull() {
        parserService = new ParserServiceImpl("splitted-figures-corrupted.json");
        JsonNode jsonNode = parserService.parse();
        Assert.assertEquals(null, jsonNode);
    }

    @Test
    public void shouldReturnProperJsonNodeWhenFileIsOk() {
        parserService = new ParserServiceImpl("splitted-figures.json");
        JsonNode jsonNode = parserService.parse();
        ArrayNode figuresArrayNode = (ArrayNode) jsonNode.get(PROPERTY_FIGURES);

        Assert.assertEquals("CUBE", figuresArrayNode.get(0).get(ParserConstants.PROPERTY_TYPE).asText());
        Assert.assertEquals(4, figuresArrayNode.get(0).get(ParserConstants.PROPERTY_SIDE_1).asLong());
    }
}
