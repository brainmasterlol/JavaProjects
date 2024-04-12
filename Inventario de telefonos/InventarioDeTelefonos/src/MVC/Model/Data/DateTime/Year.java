package MVC.Model.Data.DateTime;

public enum Year {
    YEAR_2024("2024"),
    YEAR_2025("2025"),
    YEAR_2026("2026"),
    YEAR_2027("2027"),
    YEAR_2028("2028"),
    YEAR_2029("2029"),
    YEAR_2030("2030"),
    YEAR_2031("2031"),
    YEAR_2032("2032"),
    YEAR_2033("2033"),
    YEAR_2034("2034"),
    YEAR_2035("2035"),
    YEAR_2036("2036"),
    YEAR_2037("2037"),
    YEAR_2038("2038"),
    YEAR_2039("2039"),
    YEAR_2040("2040");


    private final String displayName;

    Year(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static Year getByDisplayName(String displayName) {
        for (Year year : values()) {
            if (year.displayName.equals(displayName)) {
                return year;
            }
        }
        throw new IllegalArgumentException("Invalid IPhoneModel display name: " + displayName);
    }
}
