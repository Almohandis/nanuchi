package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserTests {
    @Test
    public void testUser() {
        User user = new User();
        assertThrows(IllegalArgumentException.class, () -> {
            user.getValue(null);
        });
        assert (user.getValue("Hello").equals("World"));
        assert (user.getValue("World").equals("Hello"));
        user.setId(3);
        assert (user.getId() == 3);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Hello", "World"})
    public void testUserInput(String str){
        User user = new User();
        assert (user.getValue(str).equals("World"));
    }
}
