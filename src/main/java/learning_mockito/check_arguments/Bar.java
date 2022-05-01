package learning_mockito.check_arguments;

public class Bar {
    private final Foo foo;
    public Bar(final Foo foo) {
        this.foo = foo;
    }
    public void doSmth() {
        foo.bla("val");
    }
}