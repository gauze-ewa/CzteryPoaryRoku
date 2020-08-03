package FourSeanson;

public enum Seasons {
    SPRING("wiosna"),
    SUMMER("lato"),
    AUTUMN("jesień"),
    WINTER("zima");

    private String translation;

    Seasons(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }
}
