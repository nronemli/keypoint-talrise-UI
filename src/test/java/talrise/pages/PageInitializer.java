package talrise.pages;


import talrise.utilities.Driver;

public class PageInitializer extends Driver {
    public static LoginPage loginPage;
    public static SignUpPage signUpPage;
    public static LanguagePage languagePage;
    public static UploadFilePage uploadFilePage;
    public static EducationPage educationStepDef;


    public static void initialize() {
        loginPage = new LoginPage();
        signUpPage = new SignUpPage();
        languagePage=new LanguagePage();
        uploadFilePage = new UploadFilePage();
        educationStepDef = new EducationPage();


    }

}
