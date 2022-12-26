package OOP.seminar4.lesson.task1;

public class Triple<T1, T2, T3> {
    private T1 param1;
    private T2 param2;
    private T3 param3;

    public Triple(T1 param1, T2 param2, T3 param3) {
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
    }

    public T1 getParam1() {
        return param1;
    }

    public T2 getParam2() {
        return param2;
    }

    public T3 getParam3() {
        return param3;
    }

    @Override
    public String toString() {
        return "Triple [param1=" + param1 + ", param2=" + param2 + ", param3=" + param3 + "]";
    }
}
