package edu.iris.dmc.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import edu.iris.dmc.fdsn.station.model.BaseNodeType;
import edu.iris.dmc.fdsn.station.model.Network;
import edu.iris.dmc.fdsn.station.model.NodeType;
import edu.iris.dmc.validation.rule.GreaterThan;

public class GreaterThanValidator implements ConstraintValidator<GreaterThan, NodeType> {
	private GreaterThan constraintAnnotation;

	@Override
	public void initialize(GreaterThan constraintAnnotation) {
		this.constraintAnnotation = constraintAnnotation;

	}

	@Override
	public boolean isValid(NodeType node, ConstraintValidatorContext context) {
		if (node.getStartDate() == null && node.getEndDate() == null) {
			return true;
		}

		if (node.getEndDate() == null) {
			return true;
		}

		if (node.getStartDate() == null) {
			return false;
		}

		if (node.getStartDate().after(node.getEndDate())) {
			return false;
		}
		return true;
	}

}
