package guru.qa.pages;


import com.codeborne.selenide.SelenideElement;
import guru.qa.pages.components.CalendarComponent;

import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {

    CalendarComponent calendar = new CalendarComponent();

    SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            genderInput = $("#genterWrapper"),
            userNumberInput = $("#userNumber"),
            birthDateInput = $("#dateOfBirthInput"),
            subjectsInput = $("#subjectsInput"),
            hobbyInput = $("#hobbiesWrapper"),
            pictureUpload = $("#uploadPicture"),
            addressInput = $("#currentAddress"),
            stateInput = $("#state"),
            stateCityInput = $("#stateCity-wrapper"),
            city = $("#stateCity-wrapper #city"),
            cityInput = $("#city"),
            submitButton = $("#submit"),
            overTable = $(".table-responsive"),
            titleRegistrationForm = $(".practice-form-wrapper");

    public RegistrationPage openPage() {
        open("/automation-practice-form");
        titleRegistrationForm.shouldHave(text("Student Registration Form"));
        deleteBanners();
        return this;
    }
    public void deleteBanners() {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
    }

    public RegistrationPage removeFixedBanner() {
        executeJavaScript("$('#fixedban').remove()");

        return this;
    }

    public RegistrationPage removeFooter() {
        executeJavaScript("$('footer').remove()");

        return this;
    }

    public RegistrationPage setFirstName(String value) {
        firstNameInput.setValue(value);

        return this;
    }

    public RegistrationPage setLastName(String value) {
        lastNameInput.setValue(value);

        return this;
    }

    public  RegistrationPage setUserEmail(String value) {
        userEmailInput.setValue(value);

        return this;
    }

    public  RegistrationPage setGender(String value) {
        genderInput.$(byText(value)).click();

        return this;
    }

    public RegistrationPage setUserNumber(String value) {
        userNumberInput.setValue(value);

        return this;
    }

    public RegistrationPage setBirthDay(String month, String year, String day) {
        birthDateInput.click();
        calendar.setCalendarDate(month, year, day);

        return this;
    }


    public RegistrationPage setSubjects(String value) {
        subjectsInput.setValue(value).pressEnter();

        return this;
    }

    public RegistrationPage setHobby(String value) {
        hobbyInput.$(byText(value)).click();

        return this;
    }

    public RegistrationPage uploadPicture(String value) {
        pictureUpload.uploadFromClasspath(value);

        return this;
    }

    public RegistrationPage setAddress(String value) {
        addressInput.setValue(value);

        return this;
    }

    public RegistrationPage setState(String value) {
        stateInput.click();
        stateCityInput.$(byText(value)).click();

        return this;
    }

    public RegistrationPage setCity(String value) {
        city.click();
        cityInput.$(byText(value)).click();

        return this;
    }

    public void clickOnSubmitButton() {
        submitButton.click();
    }

    public RegistrationPage checkOverResults(String value, String valueCheck) {
        overTable.$(byText(value)).parent().shouldHave(text(valueCheck));

        return this;
    }

}