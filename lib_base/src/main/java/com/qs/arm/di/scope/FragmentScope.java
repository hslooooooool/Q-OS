package com.qs.arm.di.scope;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * A scoping annotation to permit objects whose lifetime should
 * conform to the life of the fragment to be memorized in the
 * correct component.
 *
 * @author 华清松
 */
@Scope
@Documented
@Retention(RUNTIME)
public @interface FragmentScope {
}
