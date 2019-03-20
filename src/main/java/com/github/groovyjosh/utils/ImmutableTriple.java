package com.github.groovyjosh.utils;

public class ImmutableTriple<X, Y, Z> {

    private final X first;
    private final Y second;
    private final Z third;

    public ImmutableTriple(X first, Y second, Z third) {
        this.first  = first;
        this.second = second;
        this.third  = third;
    }

    public X getFirst() {
        return this.first;
    }

    public Y getSecond() {
        return this.second;
    }

    public Z getThird() {
        return this.third;
    }

}
