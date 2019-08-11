package Repository.demography.impl;

import Domain.demography.Gender;
import Repository.demography.GenderRepository;

import java.util.HashSet;
import java.util.Set;

public class GenderRepositoryImpl implements GenderRepository {


    private static GenderRepositoryImpl genderRepository = null;
    private Set<Gender> genders;

    public GenderRepositoryImpl(){

        genders = new HashSet<Gender>();

    }

    public static GenderRepositoryImpl getGenderRepository() {

        if(genderRepository == null){
            return new GenderRepositoryImpl();
        }

        return genderRepository;
    }


    @Override
    public Set<Gender> getAll(){

        return genders;

    }

    @Override
    public Gender create(Gender gender) {

        genders.add(gender);
        return gender;
    }

    @Override
    public Gender read(Integer integer) {

        return genders.stream().filter(gender -> gender.getId() == integer).findAny().orElse(null);

    }

    @Override
    public Gender update(Gender gender) {

        Gender genderToDelete = read(gender.getId());

        if(genderToDelete != null) {
            genders.remove(genderToDelete);
            return create(gender);
        }
        return null;

    }

    @Override
    public void delete(Integer integer) {

        Gender genderToDelete = read(integer);

        if(genderToDelete != null) {
            genders.remove(genderToDelete);
        }

    }




}
