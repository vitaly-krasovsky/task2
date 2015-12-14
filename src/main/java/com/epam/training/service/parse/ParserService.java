package com.epam.training.service.parse;

import com.fasterxml.jackson.databind.JsonNode;

/**
 * Used for parsing files with volumes of primitive figures.
 *
 * @author vkrasovsky
 */
public interface ParserService {
    /**
     * Parse file from resources.
     *
     * @return json node
     */
    JsonNode parse();
}
