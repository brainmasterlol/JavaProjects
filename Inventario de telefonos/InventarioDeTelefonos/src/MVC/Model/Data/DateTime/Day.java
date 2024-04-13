package MVC.Model.Data.DateTime;

public enum Day {
    DAY_1("01"),
    DAY_2("02"),
    DAY_3("03"),
    DAY_4("04"),
    DAY_5("05"),
    DAY_6("06"),
    DAY_7("07"),
    DAY_8("08"),
    DAY_9("09"),
    DAY_10("10"),
    DAY_11("11"),
    DAY_12("12"),
    DAY_13("13"),
    DAY_14("14"),
    DAY_15("15"),
    DAY_16("16"),
    DAY_17("17"),
    DAY_18("18"),
    DAY_19("19"),
    DAY_20("20"),
    DAY_21("21"),
    DAY_22("22"),
    DAY_23("23"),
    DAY_24("24"),
    DAY_25("25"),
    DAY_26("26"),
    DAY_27("27"),
    DAY_28("28"),
    DAY_29("29"),
    DAY_30("30"),
    DAY_31("31");

    private final String displayName;

    Day(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static Day getByDisplayName(String displayName) {
        for (Day day : values()) {
            if (day.displayName.equals(displayName)) {
                return day;
            }
        }
        throw new IllegalArgumentException("Invalid IPhoneModel display name: " + displayName);
    }
}
