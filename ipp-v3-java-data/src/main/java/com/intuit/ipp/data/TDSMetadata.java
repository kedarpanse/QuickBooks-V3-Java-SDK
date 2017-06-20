/*******************************************************************************
 * Copyright (c) 2017 Intuit
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.06 at 02:08:21 PM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * 
 * 				Product: QBO
 * 				Description: Describes metadata
 * 				associated with TDS entity.
 * 			
 * 
 * <p>Java class for TDSMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDSMetadata">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}IntuitEntity">
 *       &lt;sequence>
 *         &lt;element name="TDSEntityTypes" type="{http://schema.intuit.com/finance/v3}NameValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TDSSectionTypes" type="{http://schema.intuit.com/finance/v3}NameValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDSMetadata", propOrder = {
    "tdsEntityTypes",
    "tdsSectionTypes"
})
public class TDSMetadata
    extends IntuitEntity
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TDSEntityTypes")
    protected List<NameValue> tdsEntityTypes;
    @XmlElement(name = "TDSSectionTypes")
    protected List<NameValue> tdsSectionTypes;

    /**
     * Gets the value of the tdsEntityTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tdsEntityTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTDSEntityTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameValue }
     * 
     * 
     */
    public List<NameValue> getTDSEntityTypes() {
        if (tdsEntityTypes == null) {
            tdsEntityTypes = new ArrayList<NameValue>();
        }
        return this.tdsEntityTypes;
    }

    /**
     * Gets the value of the tdsSectionTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tdsSectionTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTDSSectionTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameValue }
     * 
     * 
     */
    public List<NameValue> getTDSSectionTypes() {
        if (tdsSectionTypes == null) {
            tdsSectionTypes = new ArrayList<NameValue>();
        }
        return this.tdsSectionTypes;
    }

    /**
     * Sets the value of the tdsEntityTypes property.
     * 
     * @param tdsEntityTypes
     *     allowed object is
     *     {@link NameValue }
     *     
     */
    public void setTDSEntityTypes(List<NameValue> tdsEntityTypes) {
        this.tdsEntityTypes = tdsEntityTypes;
    }

    /**
     * Sets the value of the tdsSectionTypes property.
     * 
     * @param tdsSectionTypes
     *     allowed object is
     *     {@link NameValue }
     *     
     */
    public void setTDSSectionTypes(List<NameValue> tdsSectionTypes) {
        this.tdsSectionTypes = tdsSectionTypes;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TDSMetadata)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final TDSMetadata that = ((TDSMetadata) object);
        {
            List<NameValue> lhsTDSEntityTypes;
            lhsTDSEntityTypes = (((this.tdsEntityTypes!= null)&&(!this.tdsEntityTypes.isEmpty()))?this.getTDSEntityTypes():null);
            List<NameValue> rhsTDSEntityTypes;
            rhsTDSEntityTypes = (((that.tdsEntityTypes!= null)&&(!that.tdsEntityTypes.isEmpty()))?that.getTDSEntityTypes():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tdsEntityTypes", lhsTDSEntityTypes), LocatorUtils.property(thatLocator, "tdsEntityTypes", rhsTDSEntityTypes), lhsTDSEntityTypes, rhsTDSEntityTypes)) {
                return false;
            }
        }
        {
            List<NameValue> lhsTDSSectionTypes;
            lhsTDSSectionTypes = (((this.tdsSectionTypes!= null)&&(!this.tdsSectionTypes.isEmpty()))?this.getTDSSectionTypes():null);
            List<NameValue> rhsTDSSectionTypes;
            rhsTDSSectionTypes = (((that.tdsSectionTypes!= null)&&(!that.tdsSectionTypes.isEmpty()))?that.getTDSSectionTypes():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tdsSectionTypes", lhsTDSSectionTypes), LocatorUtils.property(thatLocator, "tdsSectionTypes", rhsTDSSectionTypes), lhsTDSSectionTypes, rhsTDSSectionTypes)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            List<NameValue> theTDSEntityTypes;
            theTDSEntityTypes = (((this.tdsEntityTypes!= null)&&(!this.tdsEntityTypes.isEmpty()))?this.getTDSEntityTypes():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tdsEntityTypes", theTDSEntityTypes), currentHashCode, theTDSEntityTypes);
        }
        {
            List<NameValue> theTDSSectionTypes;
            theTDSSectionTypes = (((this.tdsSectionTypes!= null)&&(!this.tdsSectionTypes.isEmpty()))?this.getTDSSectionTypes():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tdsSectionTypes", theTDSSectionTypes), currentHashCode, theTDSSectionTypes);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
