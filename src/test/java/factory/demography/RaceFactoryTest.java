package factory.demography;

import Domain.demography.Race;
import Factory.demography.RaceFactory;
import org.junit.Assert;
import org.junit.Test;

public class RaceFactoryTest {

    @Test
    public void buildRace() {

        Race race = RaceFactory.buildRace(1, "Brown");
        Assert.assertNotNull(race);

    }
}