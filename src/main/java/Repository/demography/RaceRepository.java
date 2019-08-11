package Repository.demography;

import Domain.demography.Race;
import Repository.Repository;

import java.util.Set;

public interface RaceRepository extends Repository<Race, Integer> {
    Set<Race> getAll();
}
