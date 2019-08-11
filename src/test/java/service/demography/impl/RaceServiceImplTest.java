package service.demography.impl;

import Domain.demography.Race;
import Factory.demography.RaceFactory;
import Service.demography.impl.RaceServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import Service.demography.RaceService;

import java.util.Set;

public class RaceServiceImplTest {

    private RaceService service;

    @Before
    public void setUp() throws Exception {
        this.service = RaceServiceImpl.getService();
    }

    @Test
    public void getAll() {

        Set<Race> employeeSet = service.getAll();
        Assert.assertNotNull(employeeSet);
    }

    @Test
    public void create() {

        Race employee = RaceFactory.buildRace(1,"Brown");
        service.create(employee);
        Race inRepo = service.read(employee.getRaceNum());
        Assert.assertNotNull(inRepo);
    }

    @Test
    public void read() {

        Race employee = RaceFactory.buildRace(1,"Brown");
        service.create(employee);
        Race inRepo = service.read(employee.getRaceNum());
        Assert.assertNotNull(inRepo);
    }

    @Test
    public void update() {

        Race employee = RaceFactory.buildRace(1,"brown");
        service.create(employee);
        Race inRepo = service.read(employee.getRaceNum());
        employee.setDesc("Thabo");
        service.update(employee);
        Assert.assertEquals(employee.getRaceNum(), inRepo.getRaceNum());

    }

    @Test
    public void delete() {

        Race employee = RaceFactory.buildRace(1,"fa");
        service.create(employee);
        Race inRepo = service.read(employee.getRaceNum());
        Assert.assertNotNull(inRepo);
        service.delete(employee.getRaceNum());
        Race deleted = service.read(employee.getRaceNum());
        Assert.assertNull(deleted);
    }
}