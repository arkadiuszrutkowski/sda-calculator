import org.junit.Assert;
import org.junit.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.mockito.verification.VerificationMode;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

public class MockitoTest {

    @Test
    public void mockitoTest() {
        // given
        List list = mock(List.class);
        when(list.get(anyInt())).thenReturn("test");

        // when
        String result = (String) list.get(1);
        String result1 = (String) list.get(2);
        String result2 = (String) list.get(6);

        // then
        assertThat(result).isEqualTo("test");
        assertThat(result1).isEqualTo("test");
        assertThat(result2).isEqualTo("test");
    }

    @Test
    public void mockitoTestDifferentReturnedValues() {
        // given
        List list = mock(List.class);
        when(list.get(eq(0))).thenReturn("test1");
        when(list.get(eq(2))).thenReturn("test2");
        when(list.get(eq(6))).thenReturn("test3");

        // when
        String result = (String) list.get(0);
        String result1 = (String) list.get(2);
        String result2 = (String) list.get(6);

        // then
        assertThat(result).isEqualTo("test1");
        assertThat(result1).isEqualTo("test2");
        assertThat(result2).isEqualTo("test3");
    }

    @Test
    public void mockitoVerifyAddMethodCall() {
        // given
        List list = mock(List.class);

        // when
        list.add("test1");
        list.add("test2");
        list.add("test3");
        list.add("test5");

        // then
        verify(list).add(eq("test1"));
        verify(list).add(eq("test2"));
        verify(list).add(eq("test3"));
        verify(list).add(eq("test4"));
    }

    @Test
    public void mockitoVerifyAddMethoCallWithVerificationModes() {
        // given
        List list = mock(List.class);

        // when
        list.add("test1");
        list.add("test2");
        list.add("test3");
        list.add("test4");
        // odkomentowac, gdy testuje sie funkcję never()
//        list.remove(5);

        // then
        verify(list, times(4)).add(anyString());
        verify(list, never()).remove(anyInt());
    }
}
