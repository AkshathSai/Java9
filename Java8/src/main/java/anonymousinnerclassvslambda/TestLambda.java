package anonymousinnerclassvslambda;

public class TestLambda {

    int x = 999; //instance variable

    public void m2() {

        Interf i = () -> {

            int x = 999; //acts as local variable

            /**In lambda exprn this refers to outer class members
             * because there is no object store available */
            System.out.println(this.x);

        };

        i.m1();
    }

}
