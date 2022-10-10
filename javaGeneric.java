import java.lang.*;

class Data<T> {
    private T obj;

    public void setData(T v) {
        obj = v;
    }

    public T getdata() {
        return obj;
    }
}

public class javaGeneric {
    public static void main(String args[]) {
        Data<Integer> d = new Data<>();
        d.setData(10);
        System.out.print(d.getdata());
    }
}
