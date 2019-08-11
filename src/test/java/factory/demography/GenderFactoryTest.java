package factory.demography;

import Domain.demography.Gender;
import Factory.demography.GenderFactory;
import org.junit.Assert;
import org.junit.Test;

public class GenderFactoryTest {

    @Test
    public void getGender() {

        Gender gender = GenderFactory.buildGender(1, "M");
        Assert.assertNotNull(gender);

    }
}