package fpt.edu.apartment.enums;

public enum EnumRole {

    ADMIN(1), EMPLOYEE(2),APPROVE(3),MENTOR(4), MANAGER(5);
    private final int roleId;

    EnumRole(int roleId) {
        this.roleId = roleId;
    }

    public int getRoleId(){
        return this.roleId;
    }
}
