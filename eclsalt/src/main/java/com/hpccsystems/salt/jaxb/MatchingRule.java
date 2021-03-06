//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.11 at 03:55:46 PM EDT 
//


package com.hpccsystems.salt.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for matching-rule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="matching-rule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bagofwords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="specificity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="force" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="abbr" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fuzzy">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="fielddef" type="{http://hpccsystems.com/SALT}field-def" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="context">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="fielddef" type="{http://hpccsystems.com/SALT}field-def" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "matching-rule", propOrder = {
    "name",
    "bagofwords",
    "specificity",
    "force",
    "initial",
    "abbr",
    "fuzzy",
    "context"
})
public class MatchingRule {

    @XmlElement(required = true)
    protected String name;
    protected String bagofwords;
    protected String specificity;
    protected String force;
    protected Boolean initial;
    protected Boolean abbr;
    @XmlElement(required = true)
    protected MatchingRule.Fuzzy fuzzy;
    @XmlElement(required = true)
    protected MatchingRule.Context context;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the bagofwords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBagofwords() {
        return bagofwords;
    }

    /**
     * Sets the value of the bagofwords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBagofwords(String value) {
        this.bagofwords = value;
    }

    /**
     * Gets the value of the specificity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificity() {
        return specificity;
    }

    /**
     * Sets the value of the specificity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificity(String value) {
        this.specificity = value;
    }

    /**
     * Gets the value of the force property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForce() {
        return force;
    }

    /**
     * Sets the value of the force property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForce(String value) {
        this.force = value;
    }

    /**
     * Gets the value of the initial property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInitial() {
        return initial;
    }

    /**
     * Sets the value of the initial property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInitial(Boolean value) {
        this.initial = value;
    }

    /**
     * Gets the value of the abbr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAbbr() {
        return abbr;
    }

    /**
     * Sets the value of the abbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAbbr(Boolean value) {
        this.abbr = value;
    }

    /**
     * Gets the value of the fuzzy property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingRule.Fuzzy }
     *     
     */
    public MatchingRule.Fuzzy getFuzzy() {
        return fuzzy;
    }

    /**
     * Sets the value of the fuzzy property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingRule.Fuzzy }
     *     
     */
    public void setFuzzy(MatchingRule.Fuzzy value) {
        this.fuzzy = value;
    }

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingRule.Context }
     *     
     */
    public MatchingRule.Context getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingRule.Context }
     *     
     */
    public void setContext(MatchingRule.Context value) {
        this.context = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="fielddef" type="{http://hpccsystems.com/SALT}field-def" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fielddef"
    })
    public static class Context {

        @XmlElement(required = true)
        protected List<FieldDef> fielddef;

        /**
         * Gets the value of the fielddef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fielddef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFielddef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FieldDef }
         * 
         * 
         */
        public List<FieldDef> getFielddef() {
            if (fielddef == null) {
                fielddef = new ArrayList<FieldDef>();
            }
            return this.fielddef;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="fielddef" type="{http://hpccsystems.com/SALT}field-def" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fielddef"
    })
    public static class Fuzzy {

        @XmlElement(required = true)
        protected List<FieldDef> fielddef;

        /**
         * Gets the value of the fielddef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fielddef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFielddef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FieldDef }
         * 
         * 
         */
        public List<FieldDef> getFielddef() {
            if (fielddef == null) {
                fielddef = new ArrayList<FieldDef>();
            }
            return this.fielddef;
        }

    }

}
