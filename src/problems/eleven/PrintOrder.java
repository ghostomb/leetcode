package problems.eleven;

public class PrintOrder {
}

class Foo {

    private boolean firstHasExecuted = false;
    private boolean secondHasExecuted = false;

    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        firstHasExecuted = true;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (!firstHasExecuted){
            Thread.sleep(1);
        }
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        secondHasExecuted = true;
    }

    public void third(Runnable printThird) throws InterruptedException {

        while (!secondHasExecuted){
            Thread.sleep(1);
        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}