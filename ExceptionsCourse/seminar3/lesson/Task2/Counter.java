package ExceptionsCourse.seminar3.lesson.Task2;

import java.io.IOException;

public class Counter implements AutoCloseable {
    int i;
    boolean isClosed;
    
    public Counter() {
        i = 0;
        isClosed = false;
    }

    public boolean closed() {
        return isClosed;
    }

    public void add() throws IOException {
        if (isClosed) {
            throw new IOException("IO error.");
        }
        this.i++;
    }

    @Override
    public String toString() {
        return "Counter [i=" + i + "]";
    }

    @Override
    public void close() {    //throws Exception {
        isClosed = true;
        //throw new UnsupportedOperationException("Unimplemented method 'close'");
    }
   
}
