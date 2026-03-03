package com.david.business;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class ListBDDTest {


    @Test
    void testMockingListWhenSizeIsCalledShouldReturnMultipleValues() {
        List<?> list = mock(List.class);

        given(list.size()).willReturn(10);

        assertThat(list.size(), is(10));
    }

    @Test
    void testMockingListWhenGetIsCalledShouldReturnDavid() {
        List<?> list = mock(List.class);
        String name = "David";
        when(list.get(anyInt())).thenReturn(name);

        assertEquals("David", list.get(0));
    }

    @Test
    void testMockingListWhenThrowsAnException() {
        List<?> list = mock(List.class);

        when(list.get(anyInt())).thenThrow(new RuntimeException("mensagem"));

        assertThrows(RuntimeException.class, () -> {
            list.get(0);
        }, "Should have thrown an runtimeException");
    }
}
