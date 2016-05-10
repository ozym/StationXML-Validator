//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.05 at 01:15:36 PM PST 
//

package edu.iris.dmc.fdsn.station.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import edu.iris.dmc.validation.rule.Unit;

/**
 * Sensitivity and frequency ranges. The FrequencyRangeGroup is an optional
 * construct that defines a pass band in Hertz (FrequencyStart and FrequencyEnd)
 * in which the SensitivityValue is valid within the number of decibels
 * specified in FrequencyDBVariation.
 * 
 * <p>
 * Java class for SensitivityType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="SensitivityType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fdsn.org/xml/station/1}GainType">
 *       &lt;sequence>
 *         &lt;element name="InputUnits" type="{http://www.fdsn.org/xml/station/1}UnitsType"/>
 *         &lt;element name="OutputUnits" type="{http://www.fdsn.org/xml/station/1}UnitsType"/>
 *         &lt;group ref="{http://www.fdsn.org/xml/station/1}FrequencyRangeGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SensitivityType", propOrder = { "inputUnits", "outputUnits", "frequencyStart", "frequencyEnd",
		"frequencyDBVariation" })
public class Sensitivity extends Gain {

	@Unit(message = "{sensitivity.input.unit}", required = true)
	@XmlElement(name = "InputUnits", required = true)
	protected Units inputUnits;
	@Unit(message = "{sensitivity.output.unit}", required = true)
	@XmlElement(name = "OutputUnits", required = true)
	protected Units outputUnits;
	@XmlElement(name = "FrequencyStart")
	protected Double frequencyStart;
	@XmlElement(name = "FrequencyEnd")
	protected Double frequencyEnd;
	@XmlElement(name = "FrequencyDBVariation")
	protected Double frequencyDBVariation;

	/**
	 * Gets the value of the inputUnits property.
	 * 
	 * @return possible object is {@link Units }
	 * 
	 */
	public Units getInputUnits() {
		return inputUnits;
	}

	/**
	 * Sets the value of the inputUnits property.
	 * 
	 * @param value
	 *            allowed object is {@link Units }
	 * 
	 */
	public void setInputUnits(Units value) {
		this.inputUnits = value;
	}

	/**
	 * Gets the value of the outputUnits property.
	 * 
	 * @return possible object is {@link Units }
	 * 
	 */
	public Units getOutputUnits() {
		return outputUnits;
	}

	/**
	 * Sets the value of the outputUnits property.
	 * 
	 * @param value
	 *            allowed object is {@link Units }
	 * 
	 */
	public void setOutputUnits(Units value) {
		this.outputUnits = value;
	}

	/**
	 * Gets the value of the frequencyStart property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getFrequencyStart() {
		return frequencyStart;
	}

	/**
	 * Sets the value of the frequencyStart property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setFrequencyStart(Double value) {
		this.frequencyStart = value;
	}

	/**
	 * Gets the value of the frequencyEnd property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getFrequencyEnd() {
		return frequencyEnd;
	}

	/**
	 * Sets the value of the frequencyEnd property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setFrequencyEnd(Double value) {
		this.frequencyEnd = value;
	}

	/**
	 * Gets the value of the frequencyDBVariation property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getFrequencyDBVariation() {
		return frequencyDBVariation;
	}

	/**
	 * Sets the value of the frequencyDBVariation property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setFrequencyDBVariation(Double value) {
		this.frequencyDBVariation = value;
	}

}
