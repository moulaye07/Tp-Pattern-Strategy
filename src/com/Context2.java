package com;

import java.util.List;

public class Context2 {
    private final ObjectStrategy objectStrategy;

    public Context2(ObjectStrategy objectStrategy) {
        this.objectStrategy = objectStrategy;
    }

    public void arrange(List<Object> input){
        objectStrategy.sort(input);
    }
}
