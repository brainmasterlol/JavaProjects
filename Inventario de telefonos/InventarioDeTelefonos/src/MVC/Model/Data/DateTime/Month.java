package MVC.Model.Data.DateTime;

public enum Month {
    JANUARY("01"),
    FEBRUARY("02"),
    MARCH("03"),
    APRIL("04"),
    MAY("05"),
    JUNE("06"),
    JULY("07"),
    AUGUST("08"),
    SEPTEMBER("09"),
    OCTOBER("10"),
    NOVEMBER("11"),
    DECEMBER("12");


    private final String displayName;

    Month(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static Month getByDisplayName(String displayName) {
        for (Month month : values()) {
            if (month.displayName.equals(displayName)) {
                return month;
            }
        }
        throw new IllegalArgumentException("Invalid IPhoneModel display name: " + displayName);
    }
}
