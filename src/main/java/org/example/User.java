package org.example;

import lombok.*;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Data
public class User {
    private Integer id;
    private String name;
    private String email;
    private String password;
    private String phone;

    public String getValue(String value) throws IllegalArgumentException {
        if (value == null) {
            throw new IllegalArgumentException("Value cannot be null");
        }
        if (value.equals("Hello")) {
            return "World";
        }
        return "Hello";
    }
}
