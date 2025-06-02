package org.onlineshop;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// Аннотация применима к полям и будет доступна во время выполнения (runtime)
@Retention(RetentionPolicy.RUNTIME)  // Когда аннотация доступна
@Target(ElementType.FIELD) // Где можно её использовать (например, на поле)
public @interface VIP {
}
