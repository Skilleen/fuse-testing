package com.redhat.fuse.boosters.rest.http;

import org.apache.camel.Header;
import org.springframework.stereotype.Service;

@Service("greetingsService")
public class GreetingsServiceImpl implements GreetingsService {

    private static final String THE_GREETINGS = "Hello, ";
    private static final String THE_ENDINGS = ", how are you?";

    @Override
    public Greetings getGreetings(@Header("name") String name ) {
        return new Greetings( THE_GREETINGS + name + THE_ENDINGS);
    }

}
