package com.david;

import com.david.service.IPersonService;
import com.david.service.PersonService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TestPersonService {

    @DisplayName("When creating a person with succes should return a person object")
    @Test
    void testCreatingPersonReturnsPersonObject() {

        IPersonService service = new PersonService();

    }
}
