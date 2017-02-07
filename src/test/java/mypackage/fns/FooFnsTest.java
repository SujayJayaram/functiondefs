package mypackage.fns;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

/**
 * Created by sujayjayaram on 07/02/2017.
 */
public class FooFnsTest {
    @Test
    public void pvt2() throws Exception {

        List<String> list = new ArrayList<>();
        assertThat(list.size(), equalTo(0));

        FooFns.pvt2(list);
        assertThat(list.size(), equalTo(1));
    }

}