package Repository.demography;

import Domain.demography.Gender;
import Repository.Repository;

import java.util.Set;

public interface GenderRepository extends Repository<Gender, Integer> {
    Set<Gender> getAll();
}
