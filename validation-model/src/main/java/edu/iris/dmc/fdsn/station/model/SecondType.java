//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.05 at 01:15:36 PM PST 
//


package edu.iris.dmc.fdsn.station.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A time value in seconds.
 * 
 * <p>Java class for SecondType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecondType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://www.fdsn.org/xml/station/1>FloatType">
 *       &lt;attGroup ref="{http://www.fdsn.org/xml/station/1}uncertaintyDouble"/>
 *       &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" fixed="SECONDS" />
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecondType")
public class SecondType
    extends Float
{


}
