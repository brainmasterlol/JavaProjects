package MVC.Model.Data.Samsung;

public enum SamsungModels {
    SAMSUNG_GALAXY_S23("Galaxy S23"),
    SAMSUNG_GALAXY_S23_PLUS("Galaxy S23 Plus"),
    SAMSUNG_GALAXY_S23_ULTRA("Galaxy S23 Ultra"),
    SAMSUNG_GALAXY_S24("Galaxy S24"),
    SAMSUNG_GALAXY_S24_PLUS("Galaxy S24 Plus"),
    SAMSUNG_GALAXY_S24_ULTRA("Galaxy S24 Ultra");

    private final String displayName;

    SamsungModels(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static SamsungModels getByDisplayName(String displayName) {
        for (SamsungModels model : values()) {
            if (model.displayName.equals(displayName)) {
                return model;
            }
        }
        throw new IllegalArgumentException("Invalid Samsung Model display name: " + displayName);
    }
}
