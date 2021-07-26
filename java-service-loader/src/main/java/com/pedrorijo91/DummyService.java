package com.pedrorijo91;

public class DummyService implements MyService {

    @Override
    public String getName() {
        return "dummy";
    }

    @Override
    public int doManyThings(int limit) {
        return 0;
    }
}
