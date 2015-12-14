package com.epam.training.service.parse;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * Default implementation of ParserService.
 *
 * @author Vitaly_Krasovsky.
 */
public class ParserServiceImpl implements ParserService {

    private String fileName;

    public ParserServiceImpl(String fileName) {
        this.fileName = fileName;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonNode parse() {
        JsonNode jsonNode = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            jsonNode = mapper.readTree(getClass().getClassLoader().getResourceAsStream(fileName));
        } catch (IOException e) {
            //log
        }

        return jsonNode;
    }
}
