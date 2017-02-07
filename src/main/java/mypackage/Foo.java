package mypackage;

import mypackage.fns.FooFns;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sujayjayaram on 07/02/2017.
 * Main class to be tested. This class one public method
 * 'callMe(String s)' and two private methods 'pvt1()' and 'pvt2()'.
 * 'pvt1()' cannot be directly tested by JUnit as it is private.
 * 'pvt2()' is also not directly testable however it just delegates
 * to a FunctionDefs class which is fully testable.
 */
public class Foo {

    private List<String> list = new ArrayList<>();

    public void callMe(String s) {

        if ( "Bar".equals(s) ) {
            pvt1();
            pvt2();
        }
    }

    private void pvt1() {
        list.add("pvt1");
    }

    private void pvt2() {
        FooFns.pvt2(list);
    }
}
