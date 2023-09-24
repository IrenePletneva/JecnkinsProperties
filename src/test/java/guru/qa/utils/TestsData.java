package guru.qa.utils;

import static guru.qa.utils.RandomUtils.*;

public class TestsData {
    public static String[] birthdayDate = getRandomDate(14, 99);
    public static String
            firstName = getRandomFirstName(),
            lastName = getRandomLastName(),
            userEmail = getRandomEmail(),
            userGender = getRandomGender(),
            userNumber = getRandomPhone(),
            birthDay = birthdayDate[0],
            birthdayMonth = birthdayDate[1],
            birthdayYear = birthdayDate[2],
            subject = getRandomSubject(),
            hobby = getRandomHobbies(),
            fileName = "img.png",
            streetAddress = getRandomAddress(),
            state = getRandomState(),
            city = getRandomCity(state);
}
