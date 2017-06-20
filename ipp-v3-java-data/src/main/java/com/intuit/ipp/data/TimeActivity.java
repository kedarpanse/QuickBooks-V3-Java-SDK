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
import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.intuit.sb.cdm.util.v3.DateAdapter;
import com.intuit.sb.cdm.util.v3.DateTimeAdapter;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * A record of time worked by a vendor or employee.
 * 			
 * 
 * <p>Java class for TimeActivity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeActivity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}IntuitEntity">
 *       &lt;sequence>
 *         &lt;element name="TimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TxnDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="NameOf" type="{http://schema.intuit.com/finance/v3}TimeActivityTypeEnum" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="EmployeeRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *           &lt;element name="VendorRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *           &lt;element name="OtherNameRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="CustomerRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;element name="DepartmentRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;element name="ItemRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;element name="ClassRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;element name="PayrollItemRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;element name="BillableStatus" type="{http://schema.intuit.com/finance/v3}BillableStatusEnum" minOccurs="0"/>
 *         &lt;element name="Taxable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HourlyRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Hours" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Minutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BreakHours" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BreakMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeActivityEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeActivity", propOrder = {
    "timeZone",
    "txnDate",
    "nameOf",
    "employeeRef",
    "vendorRef",
    "otherNameRef",
    "customerRef",
    "departmentRef",
    "itemRef",
    "classRef",
    "payrollItemRef",
    "billableStatus",
    "taxable",
    "hourlyRate",
    "hours",
    "minutes",
    "breakHours",
    "breakMinutes",
    "startTime",
    "endTime",
    "description",
    "timeActivityEx"
})
public class TimeActivity
    extends IntuitEntity
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TimeZone")
    protected String timeZone;
    @XmlElement(name = "TxnDate", type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date txnDate;
    @XmlElement(name = "NameOf")
    protected TimeActivityTypeEnum nameOf;
    @XmlElement(name = "EmployeeRef")
    protected ReferenceType employeeRef;
    @XmlElement(name = "VendorRef")
    protected ReferenceType vendorRef;
    @XmlElement(name = "OtherNameRef")
    protected ReferenceType otherNameRef;
    @XmlElement(name = "CustomerRef")
    protected ReferenceType customerRef;
    @XmlElement(name = "DepartmentRef")
    protected ReferenceType departmentRef;
    @XmlElement(name = "ItemRef")
    protected ReferenceType itemRef;
    @XmlElement(name = "ClassRef")
    protected ReferenceType classRef;
    @XmlElement(name = "PayrollItemRef")
    protected ReferenceType payrollItemRef;
    @XmlElement(name = "BillableStatus")
    protected BillableStatusEnum billableStatus;
    @XmlElement(name = "Taxable")
    protected Boolean taxable;
    @XmlElement(name = "HourlyRate")
    protected BigDecimal hourlyRate;
    @XmlElement(name = "Hours")
    protected Integer hours;
    @XmlElement(name = "Minutes")
    protected Integer minutes;
    @XmlElement(name = "BreakHours")
    protected Integer breakHours;
    @XmlElement(name = "BreakMinutes")
    protected Integer breakMinutes;
    @XmlElement(name = "StartTime", type = String.class)
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Date startTime;
    @XmlElement(name = "EndTime", type = String.class)
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Date endTime;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "TimeActivityEx")
    protected IntuitAnyType timeActivityEx;

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the txnDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getTxnDate() {
        return txnDate;
    }

    /**
     * Sets the value of the txnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnDate(Date value) {
        this.txnDate = value;
    }

    /**
     * Gets the value of the nameOf property.
     * 
     * @return
     *     possible object is
     *     {@link TimeActivityTypeEnum }
     *     
     */
    public TimeActivityTypeEnum getNameOf() {
        return nameOf;
    }

    /**
     * Sets the value of the nameOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeActivityTypeEnum }
     *     
     */
    public void setNameOf(TimeActivityTypeEnum value) {
        this.nameOf = value;
    }

    /**
     * Gets the value of the employeeRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getEmployeeRef() {
        return employeeRef;
    }

    /**
     * Sets the value of the employeeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setEmployeeRef(ReferenceType value) {
        this.employeeRef = value;
    }

    /**
     * Gets the value of the vendorRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getVendorRef() {
        return vendorRef;
    }

    /**
     * Sets the value of the vendorRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setVendorRef(ReferenceType value) {
        this.vendorRef = value;
    }

    /**
     * Gets the value of the otherNameRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getOtherNameRef() {
        return otherNameRef;
    }

    /**
     * Sets the value of the otherNameRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setOtherNameRef(ReferenceType value) {
        this.otherNameRef = value;
    }

    /**
     * Gets the value of the customerRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getCustomerRef() {
        return customerRef;
    }

    /**
     * Sets the value of the customerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setCustomerRef(ReferenceType value) {
        this.customerRef = value;
    }

    /**
     * Gets the value of the departmentRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getDepartmentRef() {
        return departmentRef;
    }

    /**
     * Sets the value of the departmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setDepartmentRef(ReferenceType value) {
        this.departmentRef = value;
    }

    /**
     * Gets the value of the itemRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getItemRef() {
        return itemRef;
    }

    /**
     * Sets the value of the itemRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setItemRef(ReferenceType value) {
        this.itemRef = value;
    }

    /**
     * Gets the value of the classRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getClassRef() {
        return classRef;
    }

    /**
     * Sets the value of the classRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setClassRef(ReferenceType value) {
        this.classRef = value;
    }

    /**
     * Gets the value of the payrollItemRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getPayrollItemRef() {
        return payrollItemRef;
    }

    /**
     * Sets the value of the payrollItemRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setPayrollItemRef(ReferenceType value) {
        this.payrollItemRef = value;
    }

    /**
     * Gets the value of the billableStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BillableStatusEnum }
     *     
     */
    public BillableStatusEnum getBillableStatus() {
        return billableStatus;
    }

    /**
     * Sets the value of the billableStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillableStatusEnum }
     *     
     */
    public void setBillableStatus(BillableStatusEnum value) {
        this.billableStatus = value;
    }

    /**
     * Gets the value of the taxable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxable() {
        return taxable;
    }

    /**
     * Sets the value of the taxable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxable(Boolean value) {
        this.taxable = value;
    }

    /**
     * Gets the value of the hourlyRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHourlyRate() {
        return hourlyRate;
    }

    /**
     * Sets the value of the hourlyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHourlyRate(BigDecimal value) {
        this.hourlyRate = value;
    }

    /**
     * Gets the value of the hours property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHours() {
        return hours;
    }

    /**
     * Sets the value of the hours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHours(Integer value) {
        this.hours = value;
    }

    /**
     * Gets the value of the minutes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinutes() {
        return minutes;
    }

    /**
     * Sets the value of the minutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinutes(Integer value) {
        this.minutes = value;
    }

    /**
     * Gets the value of the breakHours property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBreakHours() {
        return breakHours;
    }

    /**
     * Sets the value of the breakHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBreakHours(Integer value) {
        this.breakHours = value;
    }

    /**
     * Gets the value of the breakMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBreakMinutes() {
        return breakMinutes;
    }

    /**
     * Sets the value of the breakMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBreakMinutes(Integer value) {
        this.breakMinutes = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(Date value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(Date value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the timeActivityEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getTimeActivityEx() {
        return timeActivityEx;
    }

    /**
     * Sets the value of the timeActivityEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setTimeActivityEx(IntuitAnyType value) {
        this.timeActivityEx = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TimeActivity)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final TimeActivity that = ((TimeActivity) object);
        {
            String lhsTimeZone;
            lhsTimeZone = this.getTimeZone();
            String rhsTimeZone;
            rhsTimeZone = that.getTimeZone();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timeZone", lhsTimeZone), LocatorUtils.property(thatLocator, "timeZone", rhsTimeZone), lhsTimeZone, rhsTimeZone)) {
                return false;
            }
        }
        {
            Date lhsTxnDate;
            lhsTxnDate = this.getTxnDate();
            Date rhsTxnDate;
            rhsTxnDate = that.getTxnDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "txnDate", lhsTxnDate), LocatorUtils.property(thatLocator, "txnDate", rhsTxnDate), lhsTxnDate, rhsTxnDate)) {
                return false;
            }
        }
        {
            TimeActivityTypeEnum lhsNameOf;
            lhsNameOf = this.getNameOf();
            TimeActivityTypeEnum rhsNameOf;
            rhsNameOf = that.getNameOf();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nameOf", lhsNameOf), LocatorUtils.property(thatLocator, "nameOf", rhsNameOf), lhsNameOf, rhsNameOf)) {
                return false;
            }
        }
        {
            ReferenceType lhsEmployeeRef;
            lhsEmployeeRef = this.getEmployeeRef();
            ReferenceType rhsEmployeeRef;
            rhsEmployeeRef = that.getEmployeeRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "employeeRef", lhsEmployeeRef), LocatorUtils.property(thatLocator, "employeeRef", rhsEmployeeRef), lhsEmployeeRef, rhsEmployeeRef)) {
                return false;
            }
        }
        {
            ReferenceType lhsVendorRef;
            lhsVendorRef = this.getVendorRef();
            ReferenceType rhsVendorRef;
            rhsVendorRef = that.getVendorRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vendorRef", lhsVendorRef), LocatorUtils.property(thatLocator, "vendorRef", rhsVendorRef), lhsVendorRef, rhsVendorRef)) {
                return false;
            }
        }
        {
            ReferenceType lhsOtherNameRef;
            lhsOtherNameRef = this.getOtherNameRef();
            ReferenceType rhsOtherNameRef;
            rhsOtherNameRef = that.getOtherNameRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "otherNameRef", lhsOtherNameRef), LocatorUtils.property(thatLocator, "otherNameRef", rhsOtherNameRef), lhsOtherNameRef, rhsOtherNameRef)) {
                return false;
            }
        }
        {
            ReferenceType lhsCustomerRef;
            lhsCustomerRef = this.getCustomerRef();
            ReferenceType rhsCustomerRef;
            rhsCustomerRef = that.getCustomerRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customerRef", lhsCustomerRef), LocatorUtils.property(thatLocator, "customerRef", rhsCustomerRef), lhsCustomerRef, rhsCustomerRef)) {
                return false;
            }
        }
        {
            ReferenceType lhsDepartmentRef;
            lhsDepartmentRef = this.getDepartmentRef();
            ReferenceType rhsDepartmentRef;
            rhsDepartmentRef = that.getDepartmentRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "departmentRef", lhsDepartmentRef), LocatorUtils.property(thatLocator, "departmentRef", rhsDepartmentRef), lhsDepartmentRef, rhsDepartmentRef)) {
                return false;
            }
        }
        {
            ReferenceType lhsItemRef;
            lhsItemRef = this.getItemRef();
            ReferenceType rhsItemRef;
            rhsItemRef = that.getItemRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itemRef", lhsItemRef), LocatorUtils.property(thatLocator, "itemRef", rhsItemRef), lhsItemRef, rhsItemRef)) {
                return false;
            }
        }
        {
            ReferenceType lhsClassRef;
            lhsClassRef = this.getClassRef();
            ReferenceType rhsClassRef;
            rhsClassRef = that.getClassRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "classRef", lhsClassRef), LocatorUtils.property(thatLocator, "classRef", rhsClassRef), lhsClassRef, rhsClassRef)) {
                return false;
            }
        }
        {
            ReferenceType lhsPayrollItemRef;
            lhsPayrollItemRef = this.getPayrollItemRef();
            ReferenceType rhsPayrollItemRef;
            rhsPayrollItemRef = that.getPayrollItemRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "payrollItemRef", lhsPayrollItemRef), LocatorUtils.property(thatLocator, "payrollItemRef", rhsPayrollItemRef), lhsPayrollItemRef, rhsPayrollItemRef)) {
                return false;
            }
        }
        {
            BillableStatusEnum lhsBillableStatus;
            lhsBillableStatus = this.getBillableStatus();
            BillableStatusEnum rhsBillableStatus;
            rhsBillableStatus = that.getBillableStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "billableStatus", lhsBillableStatus), LocatorUtils.property(thatLocator, "billableStatus", rhsBillableStatus), lhsBillableStatus, rhsBillableStatus)) {
                return false;
            }
        }
        {
            Boolean lhsTaxable;
            lhsTaxable = this.isTaxable();
            Boolean rhsTaxable;
            rhsTaxable = that.isTaxable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxable", lhsTaxable), LocatorUtils.property(thatLocator, "taxable", rhsTaxable), lhsTaxable, rhsTaxable)) {
                return false;
            }
        }
        {
            BigDecimal lhsHourlyRate;
            lhsHourlyRate = this.getHourlyRate();
            BigDecimal rhsHourlyRate;
            rhsHourlyRate = that.getHourlyRate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hourlyRate", lhsHourlyRate), LocatorUtils.property(thatLocator, "hourlyRate", rhsHourlyRate), lhsHourlyRate, rhsHourlyRate)) {
                return false;
            }
        }
        {
            Integer lhsHours;
            lhsHours = this.getHours();
            Integer rhsHours;
            rhsHours = that.getHours();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hours", lhsHours), LocatorUtils.property(thatLocator, "hours", rhsHours), lhsHours, rhsHours)) {
                return false;
            }
        }
        {
            Integer lhsMinutes;
            lhsMinutes = this.getMinutes();
            Integer rhsMinutes;
            rhsMinutes = that.getMinutes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minutes", lhsMinutes), LocatorUtils.property(thatLocator, "minutes", rhsMinutes), lhsMinutes, rhsMinutes)) {
                return false;
            }
        }
        {
            Integer lhsBreakHours;
            lhsBreakHours = this.getBreakHours();
            Integer rhsBreakHours;
            rhsBreakHours = that.getBreakHours();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "breakHours", lhsBreakHours), LocatorUtils.property(thatLocator, "breakHours", rhsBreakHours), lhsBreakHours, rhsBreakHours)) {
                return false;
            }
        }
        {
            Integer lhsBreakMinutes;
            lhsBreakMinutes = this.getBreakMinutes();
            Integer rhsBreakMinutes;
            rhsBreakMinutes = that.getBreakMinutes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "breakMinutes", lhsBreakMinutes), LocatorUtils.property(thatLocator, "breakMinutes", rhsBreakMinutes), lhsBreakMinutes, rhsBreakMinutes)) {
                return false;
            }
        }
        {
            Date lhsStartTime;
            lhsStartTime = this.getStartTime();
            Date rhsStartTime;
            rhsStartTime = that.getStartTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startTime", lhsStartTime), LocatorUtils.property(thatLocator, "startTime", rhsStartTime), lhsStartTime, rhsStartTime)) {
                return false;
            }
        }
        {
            Date lhsEndTime;
            lhsEndTime = this.getEndTime();
            Date rhsEndTime;
            rhsEndTime = that.getEndTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endTime", lhsEndTime), LocatorUtils.property(thatLocator, "endTime", rhsEndTime), lhsEndTime, rhsEndTime)) {
                return false;
            }
        }
        {
            String lhsDescription;
            lhsDescription = this.getDescription();
            String rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription)) {
                return false;
            }
        }
        {
            IntuitAnyType lhsTimeActivityEx;
            lhsTimeActivityEx = this.getTimeActivityEx();
            IntuitAnyType rhsTimeActivityEx;
            rhsTimeActivityEx = that.getTimeActivityEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timeActivityEx", lhsTimeActivityEx), LocatorUtils.property(thatLocator, "timeActivityEx", rhsTimeActivityEx), lhsTimeActivityEx, rhsTimeActivityEx)) {
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
            String theTimeZone;
            theTimeZone = this.getTimeZone();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timeZone", theTimeZone), currentHashCode, theTimeZone);
        }
        {
            Date theTxnDate;
            theTxnDate = this.getTxnDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "txnDate", theTxnDate), currentHashCode, theTxnDate);
        }
        {
            TimeActivityTypeEnum theNameOf;
            theNameOf = this.getNameOf();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nameOf", theNameOf), currentHashCode, theNameOf);
        }
        {
            ReferenceType theEmployeeRef;
            theEmployeeRef = this.getEmployeeRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "employeeRef", theEmployeeRef), currentHashCode, theEmployeeRef);
        }
        {
            ReferenceType theVendorRef;
            theVendorRef = this.getVendorRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vendorRef", theVendorRef), currentHashCode, theVendorRef);
        }
        {
            ReferenceType theOtherNameRef;
            theOtherNameRef = this.getOtherNameRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "otherNameRef", theOtherNameRef), currentHashCode, theOtherNameRef);
        }
        {
            ReferenceType theCustomerRef;
            theCustomerRef = this.getCustomerRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customerRef", theCustomerRef), currentHashCode, theCustomerRef);
        }
        {
            ReferenceType theDepartmentRef;
            theDepartmentRef = this.getDepartmentRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "departmentRef", theDepartmentRef), currentHashCode, theDepartmentRef);
        }
        {
            ReferenceType theItemRef;
            theItemRef = this.getItemRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemRef", theItemRef), currentHashCode, theItemRef);
        }
        {
            ReferenceType theClassRef;
            theClassRef = this.getClassRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "classRef", theClassRef), currentHashCode, theClassRef);
        }
        {
            ReferenceType thePayrollItemRef;
            thePayrollItemRef = this.getPayrollItemRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "payrollItemRef", thePayrollItemRef), currentHashCode, thePayrollItemRef);
        }
        {
            BillableStatusEnum theBillableStatus;
            theBillableStatus = this.getBillableStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billableStatus", theBillableStatus), currentHashCode, theBillableStatus);
        }
        {
            Boolean theTaxable;
            theTaxable = this.isTaxable();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxable", theTaxable), currentHashCode, theTaxable);
        }
        {
            BigDecimal theHourlyRate;
            theHourlyRate = this.getHourlyRate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hourlyRate", theHourlyRate), currentHashCode, theHourlyRate);
        }
        {
            Integer theHours;
            theHours = this.getHours();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hours", theHours), currentHashCode, theHours);
        }
        {
            Integer theMinutes;
            theMinutes = this.getMinutes();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minutes", theMinutes), currentHashCode, theMinutes);
        }
        {
            Integer theBreakHours;
            theBreakHours = this.getBreakHours();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "breakHours", theBreakHours), currentHashCode, theBreakHours);
        }
        {
            Integer theBreakMinutes;
            theBreakMinutes = this.getBreakMinutes();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "breakMinutes", theBreakMinutes), currentHashCode, theBreakMinutes);
        }
        {
            Date theStartTime;
            theStartTime = this.getStartTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startTime", theStartTime), currentHashCode, theStartTime);
        }
        {
            Date theEndTime;
            theEndTime = this.getEndTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endTime", theEndTime), currentHashCode, theEndTime);
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription);
        }
        {
            IntuitAnyType theTimeActivityEx;
            theTimeActivityEx = this.getTimeActivityEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timeActivityEx", theTimeActivityEx), currentHashCode, theTimeActivityEx);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
