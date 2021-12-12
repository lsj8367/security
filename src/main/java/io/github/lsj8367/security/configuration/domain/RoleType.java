package io.github.lsj8367.security.configuration.domain;

public enum RoleType {
    USER("ROLE_USER"),
    ADMIN("ROLE_ADMIN");

    private final String role;

    RoleType(final String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
