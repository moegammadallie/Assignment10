package service.demography.impl;

import Domain.demography.Gender;
import Factory.demography.GenderFactory;
import Service.demography.impl.GenderServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import Service.demography.GenderService;

import java.util.Set;

public class GenderServiceImplTest {

    private GenderService service;

    @Before
    public void setUp() throws Exception {
        this.service = GenderServiceImpl.getService();
    }

    @Test
    public void getAll() {

        Set<Gender> employeeSet = service.getAll();
        Assert.assertNotNull(employeeSet);

    }

    @Test
    public void create() {

        Gender employee = GenderFactory.buildGender(1, "M");

        service.create(employee);

        Gender inRepo = service.read(employee.getId());

        Assert.assertNotNull(inRepo);

    }

    @Test
    public void read() {

        Gender employee = GenderFactory.buildGender(1, "M");

        service.create(employee);

        Gender inRepo = service.read(employee.getId());

        Assert.assertNotNull(inRepo);
    }

    @Test
    public void update() {

        Gender employee = GenderFactory.buildGender(1, "M");

        service.create(employee);
        Gender inRepo = service.read(employee.getId());

        employee.setDesc("Thabo");

        service.update(employee);

        Assert.assertEquals(employee.getId(), inRepo.getId());

    }

    @Test
    public void delete() {

        Gender employee = GenderFactory.buildGender(1, "M");

        service.create(employee);

        Gender inRepo = service.read(employee.getId());

        Assert.assertNotNull(inRepo);

        service.delete(employee.getId());

        Gender deleted = service.read(employee.getId());

        Assert.assertNull(deleted);

    }
}