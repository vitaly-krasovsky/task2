package com.epam.training.service.display;

/**
 * Used for printing results.
 *
 * @author vkrasovsky
 */
public interface ResultService {
    String RESULT_STRING = "Volume of complex figure: ";

    /**
     * Prints result
     *
     * @param volume the volume
     */
    void printResult(double volume);
}
