package Generics;

public class Child_Class<T> implements Parent_Interface<T> {

    private T name;

    @Override
    public T getName() {
        return name;
    }

    @Override
    public void setName(T name) {
        this.name = name;
    }
}
