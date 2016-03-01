package edu.iris.dmc.validation.rule;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.xml.datatype.XMLGregorianCalendar;

import edu.iris.dmc.validation.validator.EpochRangeValidator;
import edu.iris.dmc.validation.validator.SeedAsciiValidator;
import edu.iris.dmc.validation.validator.SeedFloatingValidator;
import edu.iris.dmc.validation.validator.SeedLatitudeValidator;
import edu.iris.dmc.validation.validator.SeedLongitudeValidator;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE) // on class level
@Constraint(validatedBy = { EpochRangeValidator.class })
public @interface EpochRange {
	String message() default "{edu.iris.dmc.validator.rule.EpochRange}";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
	boolean required() default false;
	String expression() default "[unassigned]";
}
