package edu.iris.dmc.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.hibernate.validator.constraintvalidation.HibernateConstraintValidatorContext;

import edu.iris.dmc.fdsn.station.model.Units;
import edu.iris.dmc.validation.rule.Severity;
import edu.iris.dmc.validation.rule.Unit;
import edu.iris.dmc.validation.rule.UnitTable;

public class UnitValidator implements ConstraintValidator<Unit, Units> {

	private Unit unit;
	// [As of 2016-05-06]
	public static UnitTable unitTable = new UnitTable();

	@Override
	public void initialize(Unit unit) {
		this.unit = unit;
	}

	@Override
	public boolean isValid(Units units, ConstraintValidatorContext context) {
		if (unit.required()) {
			if (units == null || units.getName() == null) {
				return false;
			}
		}

		if (units == null || units.getName() == null) {
			return true;
		}
		boolean result = unitTable.contains(units.getName());
		if (result) {
			return true;
		}
		if (unitTable.containsCaseInsensitive(units.getName())) {
			//String originalMessage = context.getDefaultConstraintMessageTemplate();
			// context.disableDefaultConstraintViolation();
			HibernateConstraintValidatorContext hibernateContext = context
					.unwrap(HibernateConstraintValidatorContext.class);
			hibernateContext.withDynamicPayload(Severity.WARN);
			// context.buildConstraintViolationWithTemplate(originalMessage).addPropertyNode("warning")
			// .addConstraintViolation();
		}
		return false;
	}
}
