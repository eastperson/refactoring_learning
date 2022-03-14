package me.whiteship.refactoring._11_primitive_obsession._31_replace_type_code_with_subclasses.indirect_inheritance;

import java.util.List;

public class Employee {

    private String name;

    private String typeValue;

    private EmployeeType type;

    public Employee(String name, String type) {
        this.validate(type);
        this.name = name;
        this.typeValue = type;
        this.type = this.employeeType(typeValue);
    }

    private EmployeeType employeeType(String typeValue) {
        return switch (typeValue) {
            case "engineer" -> new Engineer();
            case "manager" -> new Manager();
            case "salesman" -> new Salesman();
            default -> throw new IllegalArgumentException(typeValue);
        };
    }

    private void validate(String type) {
        List<String> legalTypes = List.of("engineer", "manager", "salesman");
        if (!legalTypes.contains(type)) {
            throw new IllegalArgumentException(type);
        }
    }

    public String capitalizedType() {
        return this.type.capitalizedType();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", type='" + typeValue + '\'' +
                '}';
    }
}
