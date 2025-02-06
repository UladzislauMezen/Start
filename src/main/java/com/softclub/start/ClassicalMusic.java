package com.softclub.start;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Phantom of the Opera";

    }
}
