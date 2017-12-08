/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.core;

import com.google.common.math.DoubleMath;

import static com.f6car.base.constant.Constants.DOUBLE_EQUALE_GAP;

/**
 * @author qixiaobo
 */
public final class MathUtil {
    private MathUtil() {

    }

    public static boolean isEqual(double a, double b) {
        return isEqual(a, b, DOUBLE_EQUALE_GAP);
    }

    /**
     * Returns {@code true} if {@code a} and {@code b} are within {@code tolerance} of each other.
     * <p>
     * <p>Technically speaking, this is equivalent to
     * {@code Math.abs(a - b) <= tolerance || Double.valueOf(a).equals(Double.valueOf(b))}.
     * <p>
     * <p>Notable special cases include:
     * <ul>
     * <li>All NaNs are fuzzily equal.
     * <li>If {@code a == b}, then {@code a} and {@code b} are always fuzzily equal.
     * <li>Positive and negative zero are always fuzzily equal.
     * <li>If {@code tolerance} is zero, and neither {@code a} nor {@code b} is NaN, then
     * {@code a} and {@code b} are fuzzily equal if and only if {@code a == b}.
     * <li>With {@link Double#POSITIVE_INFINITY} tolerance, all non-NaN values are fuzzily equal.
     * <li>With finite tolerance, {@code Double.POSITIVE_INFINITY} and {@code
     * Double.NEGATIVE_INFINITY} are fuzzily equal only to themselves.
     * </li>
     * <p>
     * <p>This is reflexive and symmetric, but <em>not</em> transitive, so it is <em>not</em> an
     * equivalence relation and <em>not</em> suitable for use in {@link Object#equals}
     * implementations.
     *
     * @throws IllegalArgumentException if {@code tolerance} is {@code < 0} or NaN
     */
    public static boolean isEqual(double a, double b, double tolerance) {
        return DoubleMath.fuzzyEquals(a, b, tolerance);
    }

    /**
     * Compares {@code a} and {@code b} "fuzzily," with a tolerance for nearly-equal values.
     * <p>
     * <p>This method is equivalent to
     * {@code fuzzyEquals(a, b, tolerance) ? 0 : Double.compare(a, b)}. In particular, like
     * {@link Double#compare(double, double)}, it treats all NaN values as equal and greater than all
     * other values (including {@link Double#POSITIVE_INFINITY}).
     * <p>
     * <p>This is <em>not</em> a total ordering and is <em>not</em> suitable for use in
     * {@link Comparable#compareTo} implementations.  In particular, it is not transitive.
     *
     * @throws IllegalArgumentException if {@code tolerance} is {@code < 0} or NaN
     */
    public static int compare(double a, double b, double tolerance) {
        return DoubleMath.fuzzyCompare(a, b, tolerance);
    }

    public static int compare(double a, double b) {
        return compare(a, b, DOUBLE_EQUALE_GAP);
    }


}
