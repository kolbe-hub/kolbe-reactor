package net.kolbe.reactor.chapter02;


import rx.Observable;

import java.util.Arrays;

/**
 * Observable 创建示例
 */
public class ObservableCreate {

    public static void main(String[] args) throws Exception {
        /**
         * Observable.just(value) 创建一个可以发布1到9个对象的事件流
         */
        Observable<Integer> i = Observable.just(1);
        i.subscribe(System.out::println);

        /**
         * Observable.from(values) 通过Iterable或Array来创建一个事件流
         */
        Observable<Integer> t = Observable.from(Arrays.asList(1,2,3));
        t.subscribe(System.out::println);

        /**
         * Observable.rang(start, count) 生成一个从start开始的count个整数
         */
        Observable<Integer> r = Observable.range(0, 10);
        r.subscribe(System.out::println);

        /**
         * 创建一个订阅后立即完成的，不发布任何值的事件流
         */
        Observable.empty();

        /**
         * 创建一个不发布任务通知，无论是值还是完成或失败
         */
        Observable.never();

        /**
         * 创建一个异常的事件流，触发onError()通知
         */
        Observable.error(new NullPointerException());
    }




}
