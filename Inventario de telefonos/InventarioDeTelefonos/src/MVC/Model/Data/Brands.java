package MVC.Model.Data;

public enum Brands {
    IPHONE("iPhone"),
    SAMSUNG("Samsung");

    private final String displayName;

    Brands(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static Brands getByDisplayName(String displayName) {
        for (Brands brand : values()) {
            if (brand.displayName.equals(displayName)) {
                return brand;
            }
        }
        throw new IllegalArgumentException("Invalid IPhoneModel display name: " + displayName);
    }


}
