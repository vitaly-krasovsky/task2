package com.epam.training.service.display;

/**
 * Console printer implementation.
 *
 * @author vkrasovsky
 */
public class ResultServiceConsoleImpl implements ResultService {
    /**
     * {@inheritDoc}
     */
    @Override
    public void printResult(double volume) {
        System.out.println(RESULT_STRING + volume);
    }
}
