package com.epam.training;


import com.epam.training.service.calculate.VolumeCalculatorService;
import com.epam.training.service.calculate.VolumeCalculatorServiceImpl;
import com.epam.training.service.create.FiguresCreatorService;
import com.epam.training.service.create.FiguresCreatorServiceImpl;
import com.epam.training.service.display.ResultService;
import com.epam.training.service.display.ResultServiceConsoleImpl;
import com.epam.training.service.display.ResultServiceFileImpl;

/**
 * Main application.
 *
 * @author vkrasovsky
 */
public class App {

    /**
     * @param args the args
     */
    public static void main(String[] args) {
        VolumeCalculatorService volumeCalculatorServiceImpl = new VolumeCalculatorServiceImpl();
        FiguresCreatorService figuresCreatorServiceImpl = new FiguresCreatorServiceImpl();

        double volume = volumeCalculatorServiceImpl.calculateVolume(figuresCreatorServiceImpl.buildFigures());

        ResultService resultService = new ResultServiceConsoleImpl();
        resultService.printResult(volume);

        resultService = new ResultServiceFileImpl();
        resultService.printResult(volume);
    }

}
