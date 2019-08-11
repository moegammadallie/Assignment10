package Service.demography;

import Domain.demography.Gender;
import Service.Service;

import java.util.Set;

public interface GenderService extends Service<Gender, Integer> {
    Set<Gender> getAll();
}
