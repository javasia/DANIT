package cw180629.task4;

public class CategoryRecord {
    private final String NAME;
    private final Categories NAME_OF_CATEGORY;

    public CategoryRecord(String NAME, Categories CATEGORY_NAME) {
        this.NAME = NAME;
        this.NAME_OF_CATEGORY = CATEGORY_NAME;
    }

    public String getNAME() {
        return NAME;
    }

    public Categories getNAME_OF_CATEGORY() {
        return NAME_OF_CATEGORY;
    }
}
