//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.28 at 11:02:57 AM PST 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceLevelTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PriceLevelTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FixedPercentage"/>
 *     &lt;enumeration value="PerItem"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PriceLevelTypeEnum")
@XmlEnum
public enum PriceLevelTypeEnum {

    @XmlEnumValue("FixedPercentage")
    FIXED_PERCENTAGE("FixedPercentage"),
    @XmlEnumValue("PerItem")
    PER_ITEM("PerItem");
    private final String value;

    PriceLevelTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PriceLevelTypeEnum fromValue(String v) {
        for (PriceLevelTypeEnum c: PriceLevelTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
