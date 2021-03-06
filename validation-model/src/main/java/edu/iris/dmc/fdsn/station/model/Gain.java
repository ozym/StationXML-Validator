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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import edu.iris.dmc.validation.rule.NonZero;

/**
 * Complex type for sensitivity and frequency ranges.This complex type can be
 * used to represent both overall sensitivities and individual stage gains. The
 * FrequencyRangeGroup is an optional construct that defines a pass band in
 * Hertz ( FrequencyStart and FrequencyEnd) in which the SensitivityValue is
 * valid within the number of decibels specified in FrequencyDBVariation.
 * 
 * <p>
 * Java class for GainType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="GainType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Frequency" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GainType", propOrder = { "value", "frequency" })
@XmlSeeAlso({ Sensitivity.class })
public class Gain {

	@XmlElement(name = "Value")
	@NonZero(message = "{gain.value}")
	protected Double value;
	@XmlElement(name = "Frequency")
	protected Double frequency;

	@XmlTransient
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the value of the value property.
	 * 
	 */
	public Double getValue() {
		return value;
	}

	/**
	 * Sets the value of the value property.
	 * 
	 */
	public void setValue(Double value) {
		this.value = value;
	}

	/**
	 * Gets the value of the frequency property.
	 * 
	 */
	public Double getFrequency() {
		return frequency;
	}

	/**
	 * Sets the value of the frequency property.
	 * 
	 */
	public void setFrequency(Double value) {
		this.frequency = value;
	}

}
