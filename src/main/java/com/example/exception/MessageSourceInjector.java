package com.example.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MessageSourceInjector {
    @Autowired
    private MessageSource ms;

    @PostConstruct
    public void inject(){
        BusinessException.setMessageSource(ms);
    }
}
