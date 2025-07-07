package de.unibayreuth.se.observer;

public class ConcreteObserver implements Observer {
    private static int counter = 1;
    private int id;
    private Subject subject;
    public ConcreteObserver(Subject subject) {
        id = counter++;
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update(Subject subject) {
        System.out.println("Observer" + id + " updated from Subject " + subject.getClass().getSimpleName() +":"+ subject.getValue());
    }

    public void detach() {
        subject.detach(this);
    }
}
