package MVC.Model.Data.IPhone;

public enum IPhoneModels {
    IPHONE_X("X"),
    IPHONE_XS("Xs"),
    IPHONE_XS_MAX("Xs Max"),
    IPHONE_XR("Xr"),
    IPHONE_11("11"),
    IPHONE_11_PRO("11 Pro"),
    IPHONE_11_PRO_MAX("11 Pro Max"),
    IPHONE_SE_2ND_GENERATION("SE 2nd Generation"),
    IPHONE_12("12"),
    IPHONE_12_MINI("12 Mini"),
    IPHONE_12_PRO("12 Pro"),
    IPHONE_12_PRO_MAX("12 Pro Max"),
    IPHONE_13("13"),
    IPHONE_13_MINI("13 Mini"),
    IPHONE_13_PRO("13 Pro"),
    IPHONE_13_PRO_MAX("13 Pro Max"),
    IPHONE_SE_3RD_GENERATION("SE 3rd Generation"),
    IPHONE_14("14"),
    IPHONE_14_PLUS("14 Plus"),
    IPHONE_14_PRO("14 Pro"),
    IPHONE_14_PRO_MAX("14 Pro Max"),
    IPHONE_15("15"),
    IPHONE_15_PLUS("15 Plus"),
    IPHONE_15_PRO("15 Pro"),
    IPHONE_15_PRO_MAX("15 Pro Max");

    private final String displayName;

    IPhoneModels(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static IPhoneModels getByDisplayName(String displayName) {
        for (IPhoneModels model : values()) {
            if (model.displayName.equals(displayName)) {
                return model;
            }
        }
        throw new IllegalArgumentException("Invalid IPhoneModel display name: " + displayName);
    }
}
