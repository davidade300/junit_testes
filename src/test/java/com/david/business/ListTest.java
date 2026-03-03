package com.david.business;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class ListTest {


    @Test
    void testMockingListWhenSizeIsCalledShouldReturnMultipleValues() {
        List<?> list = mock(List.class);

        when(list.size()).thenReturn(10).thenReturn(20);

        assertEquals(10, list.size());
        assertEquals(20, list.size());
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
