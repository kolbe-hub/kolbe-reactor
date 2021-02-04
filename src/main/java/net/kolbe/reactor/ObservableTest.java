package net.kolbe.reactor;

import rx.Observable;

public class ObservableTest {

    public static void main(String[] args) throws Exception {
        Observable.create(s -> {
            s.onNext("Hello World");
            s.onCompleted();
        }).subscribe(System.out::println);
    }

}
