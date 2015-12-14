package com.epam.training.service.display;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;

/**
 * File printer implementation.
 *
 * @author vkrasovsky
 */
public class ResultServiceFileImpl implements ResultService {
    /**
     * {@inheritDoc}
     */
    @Override
    public void printResult(double volume) {
        try {
            Files.write(RESULT_STRING + volume, new File("result.txt"), Charsets.UTF_8);
        } catch (IOException e) {
            //log exception
        }
    }
}
