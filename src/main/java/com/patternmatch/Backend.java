package com.patternmatch;

import com.cdyne.ws.*;
import io.reactivex.Observable;
import io.reactivex.Completable;
import java.util.List;


public class Backend {
    private EmailVerNoTestEmailSoap emailVerNoTestEmailSoap;
    
    public Backend() {
        EmailVerNoTestEmail service = new EmailVerNoTestEmail();
        emailVerNoTestEmailSoap = service.getEmailVerNoTestEmailSoap();
    }
    
    public Observable<Integer> verifyMXRecord(
        String email,
        String licenseKey) {
        return Observable.fromCallable(() -> emailVerNoTestEmailSoap.verifyMXRecord(email, licenseKey));
    }

    public Observable<ReturnIndicator> advancedVerifyEmail(
        String email,
        int timeout,
        String licenseKey) {
        return Observable.fromCallable(() -> emailVerNoTestEmailSoap.advancedVerifyEmail(email, timeout, licenseKey));
    }

    public Observable<ReturnIndicator> verifyEmail(
        String email,
        String licenseKey) {
        return Observable.fromCallable(() -> emailVerNoTestEmailSoap.verifyEmail(email, licenseKey));
    }

    public Observable<ArrayOfAnyType> returnCodes() {
        return Observable.fromCallable(() -> emailVerNoTestEmailSoap.returnCodes());
    }

}
