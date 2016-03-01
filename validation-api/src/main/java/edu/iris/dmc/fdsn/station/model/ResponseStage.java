//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.05 at 01:15:36 PM PST 
//

package edu.iris.dmc.fdsn.station.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;

import edu.iris.dmc.validation.rule.MissingDecimation;
import edu.iris.dmc.validation.rule.StageUnits;

/**
 * This complex type represents channel response and covers SEED blockettes 53
 * to 56.
 * 
 * <p>
 * Java class for ResponseStageType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseStageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="PolesZeros" type="{http://www.fdsn.org/xml/station/1}PolesZerosType" minOccurs="0"/>
 *           &lt;element name="Coefficients" type="{http://www.fdsn.org/xml/station/1}CoefficientsType" minOccurs="0"/>
 *           &lt;element name="ResponseList" type="{http://www.fdsn.org/xml/station/1}ResponseListType" minOccurs="0"/>
 *           &lt;element name="FIR" type="{http://www.fdsn.org/xml/station/1}FIRType" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="Polynomial" type="{http://www.fdsn.org/xml/station/1}PolynomialType" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="Decimation" type="{http://www.fdsn.org/xml/station/1}DecimationType" minOccurs="0"/>
 *         &lt;element name="StageGain" type="{http://www.fdsn.org/xml/station/1}GainType"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="number" use="required" type="{http://www.fdsn.org/xml/station/1}CounterType" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseStageType", propOrder = { "polesZeros", "coefficients", "responseList", "fir", "polynomial",
		"decimation", "stageGain", "any" })
@MissingDecimation(message = "Response stages having Coefficient, FIR ResponseList or a PolesZeros with with transfer function type Digital, must include a Decimation element.")
public class ResponseStage {

	@XmlElement(name = "PolesZeros")
	protected PolesZeros polesZeros;
	@XmlElement(name = "Coefficients")
	protected Coefficients coefficients;
	@XmlElement(name = "ResponseList")
	protected ResponseList responseList;
	@XmlElement(name = "FIR")
	protected FIR fir;
	@XmlElement(name = "Polynomial")
	protected Polynomial polynomial;
	@XmlElement(name = "Decimation")
	protected Decimation decimation;
	@XmlElement(name = "StageGain", required = true)
	protected Gain stageGain;
	@XmlAnyElement(lax = true)
	protected List<Object> any;
	@XmlAttribute(name = "number", required = true)
	protected BigInteger number;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	public Units[] getUnits() {
		if (polesZeros != null) {
			return new Units[] { polesZeros.getInputUnits(), polesZeros.getOutputUnits() };
		}
		if (responseList != null) {
			return new Units[] { responseList.getInputUnits(), responseList.getOutputUnits() };
		}
		if (fir != null) {
			return new Units[] { fir.getInputUnits(), fir.getOutputUnits() };
		}
		if (polynomial != null) {
			return new Units[] { polynomial.getInputUnits(), polynomial.getOutputUnits() };
		}
		return null;
	}

	/**
	 * Gets the value of the polesZeros property.
	 * 
	 * @return possible object is {@link PolesZeros }
	 * 
	 */
	public PolesZeros getPolesZeros() {
		return polesZeros;
	}

	/**
	 * Sets the value of the polesZeros property.
	 * 
	 * @param value
	 *            allowed object is {@link PolesZeros }
	 * 
	 */
	public void setPolesZeros(PolesZeros value) {
		this.polesZeros = value;
	}

	/**
	 * Gets the value of the coefficients property.
	 * 
	 * @return possible object is {@link Coefficients }
	 * 
	 */
	public Coefficients getCoefficients() {
		return coefficients;
	}

	/**
	 * Sets the value of the coefficients property.
	 * 
	 * @param value
	 *            allowed object is {@link Coefficients }
	 * 
	 */
	public void setCoefficients(Coefficients value) {
		this.coefficients = value;
	}

	/**
	 * Gets the value of the responseList property.
	 * 
	 * @return possible object is {@link ResponseList }
	 * 
	 */
	public ResponseList getResponseList() {
		return responseList;
	}

	/**
	 * Sets the value of the responseList property.
	 * 
	 * @param value
	 *            allowed object is {@link ResponseList }
	 * 
	 */
	public void setResponseList(ResponseList value) {
		this.responseList = value;
	}

	/**
	 * Gets the value of the fir property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the fir property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getFIR().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link FIR }
	 * 
	 * 
	 */
	public FIR getFIR() {
		return this.fir;
	}

	public void setFIR(FIR value) {
		this.fir = value;
	}

	/**
	 * Gets the value of the polynomial property.
	 * 
	 * @return possible object is {@link Polynomial }
	 * 
	 */
	public Polynomial getPolynomial() {
		return polynomial;
	}

	/**
	 * Sets the value of the polynomial property.
	 * 
	 * @param value
	 *            allowed object is {@link Polynomial }
	 * 
	 */
	public void setPolynomial(Polynomial value) {
		this.polynomial = value;
	}

	/**
	 * Gets the value of the decimation property.
	 * 
	 * @return possible object is {@link Decimation }
	 * 
	 */
	public Decimation getDecimation() {
		return decimation;
	}

	/**
	 * Sets the value of the decimation property.
	 * 
	 * @param value
	 *            allowed object is {@link Decimation }
	 * 
	 */
	public void setDecimation(Decimation value) {
		this.decimation = value;
	}

	/**
	 * Gets the value of the stageGain property.
	 * 
	 * @return possible object is {@link Gain }
	 * 
	 */
	public Gain getStageGain() {
		return stageGain;
	}

	/**
	 * Sets the value of the stageGain property.
	 * 
	 * @param value
	 *            allowed object is {@link Gain }
	 * 
	 */
	public void setStageGain(Gain value) {
		this.stageGain = value;
	}

	/**
	 * Gets the value of the any property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the any property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAny().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Element }
	 * {@link Object }
	 * 
	 * 
	 */
	public List<Object> getAny() {
		if (any == null) {
			any = new ArrayList<Object>();
		}
		return this.any;
	}

	/**
	 * Gets the value of the number property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getNumber() {
		return number;
	}

	/**
	 * Sets the value of the number property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setNumber(BigInteger value) {
		this.number = value;
	}

	/**
	 * Gets a map that contains attributes that aren't bound to any typed
	 * property on this class.
	 * 
	 * <p>
	 * the map is keyed by the name of the attribute and the value is the string
	 * value of the attribute.
	 * 
	 * the map returned by this method is live, and you can add new attribute by
	 * updating the map directly. Because of this design, there's no setter.
	 * 
	 * 
	 * @return always non-null
	 */
	public Map<QName, String> getOtherAttributes() {
		return otherAttributes;
	}

	public void add(Filter filter) {
		if (filter == null) {
			return;
		}
		if (filter instanceof PolesZeros) {
			this.setPolesZeros((PolesZeros) filter);
		} else if (filter instanceof Coefficients) {
			this.setCoefficients((Coefficients) filter);
		} else if (filter instanceof ResponseList) {
			this.setResponseList((ResponseList) filter);
		} else if (filter instanceof FIR) {
			this.setFIR((FIR) filter);
		} else if (filter instanceof Polynomial) {
			this.setPolynomial((Polynomial) filter);
		} else if (filter instanceof Decimation) {
			this.setDecimation((Decimation) filter);
		} else {
			// :TODO what should be done here, throw an exception????????
		}
	}

}
