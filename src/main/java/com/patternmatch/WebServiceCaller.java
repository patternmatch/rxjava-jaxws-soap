package com.patternmatch;

import com.cdyne.ws.ReturnIndicator;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class WebServiceCaller {
    public static void main(String[] args) {
        Backend backend = new Backend();
        Observable<ReturnIndicator> integerObservable = backend.verifyEmail("myprivateemail@yahoo.com", "somelicense");
        integerObservable.subscribe(new Observer<ReturnIndicator>() {
            @Override
            public void onSubscribe(Disposable d) {
            }

            @Override
            public void onNext(ReturnIndicator returnIndicator) {
                System.out.println("Got results:");
                System.out.println(returnIndicator.getResponseText());
            }

            @Override
            public void onError(Throwable e) {
            }

            @Override
            public void onComplete() {
            }
        });
    }
}
