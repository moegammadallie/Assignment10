package Factory.demography;

import Domain.demography.Gender;

public class GenderFactory {

    public static Gender buildGender(int genderId, String gender) {
        return new Gender.Builder()
                .id(genderId)
                .desc(gender)
                .build();
    }
}
