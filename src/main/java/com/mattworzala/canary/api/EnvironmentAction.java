package com.mattworzala.canary.api;

import com.mattworzala.canary.platform.util.hint.EnvType;
import com.mattworzala.canary.platform.util.hint.Environment;
import org.intellij.lang.annotations.Pattern;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Environment(EnvType.MINESTOM)
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface EnvironmentAction {
    @Pattern("[a-z][a-z_]*")
    String value();
}
