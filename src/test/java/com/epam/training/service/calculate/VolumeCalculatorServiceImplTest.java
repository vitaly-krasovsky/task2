package com.epam.training.service.calculate;

import com.epam.training.domain.Cube;
import com.epam.training.domain.Cylinder;
import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author vkrasovsky
 */
public class VolumeCalculatorServiceImplTest {
    VolumeCalculatorService volumeCalculatorService;

    @Test
    public void shouldCalculateSummaryVolumeOfGivenFigures() {
        volumeCalculatorService = new VolumeCalculatorServiceImpl();

        double volume = volumeCalculatorService.calculateVolume(Lists.newArrayList(new Cube(4L), new Cylinder(3L, 4L)));

        Assert.assertEquals(177.09733552923257, volume, 0.0000000001);
    }
}
