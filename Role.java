public enum Role {
    STUDENT(0),
    PROFESSOR(1),
    STAFF(2),
    ADMIN(3);

    private final int value;

    Role(int value) {
        this.value = value;
    }

    public String getRole(int value) {
        return Role.values()[value].toString();
    }
}