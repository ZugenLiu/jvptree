package com.eatthepath.jvptree;

public class IntegerDistanceFunction implements DistanceFunction<Integer> {

    public double getDistance(final Integer firstPoint, final Integer secondPoint) {
        return Math.abs(firstPoint - secondPoint);
    }
}
