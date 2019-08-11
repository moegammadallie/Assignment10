package Service.demography;

import Domain.demography.Race;
import Service.Service;

import java.util.Set;

public interface RaceService extends Service<Race,Integer> {
    Set<Race> getAll();
}
