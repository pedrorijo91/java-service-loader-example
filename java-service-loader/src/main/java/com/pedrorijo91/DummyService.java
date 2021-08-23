package com.pedrorijo91;

import com.google.auto.service.AutoService;

@AutoService(MyService.class)
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
