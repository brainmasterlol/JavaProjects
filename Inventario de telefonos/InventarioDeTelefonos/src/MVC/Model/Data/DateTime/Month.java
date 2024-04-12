package MVC.Model.Data.DateTime;

public enum Month {
    JANUARY("January"),
    FEBRUARY("February"),
    MARCH("March"),
    APRIL("April"),
    MAY("May"),
    JUNE("June"),
    JULY("July"),
    AUGUST("August"),
    SEPTEMBER("September"),
    OCTOBER("October"),
    NOVEMBER("November"),
    DECEMBER("December");


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
