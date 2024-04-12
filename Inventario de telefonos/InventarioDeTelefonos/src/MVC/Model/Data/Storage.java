package MVC.Model.Data;

public enum Storage {
    GB_64("64GB"),
    GB_128("128GB"),
    GB_256("256GB"),
    GB_512("512GB"),
    TB_1("1TB"),
    TB_2("2TB");

    private final String displayName;

    Storage(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static Storage getByDisplayName(String displayName) {
        for (Storage storage : values()) {
            if (storage.displayName.equals(displayName)) {
                return storage;
            }
        }
        throw new IllegalArgumentException("Invalid IPhoneModel display name: " + displayName);
    }
}
