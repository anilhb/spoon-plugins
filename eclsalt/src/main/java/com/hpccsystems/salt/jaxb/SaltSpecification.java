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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="module-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="file-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ridfield" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fields">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="fielddef" type="{http://hpccsystems.com/SALT}field-def" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="matching-rules">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="rule" type="{http://hpccsystems.com/SALT}matching-rule" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="hygiene-rules">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="rule" type="{http://hpccsystems.com/SALT}hygiene-rule" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="hygiene-rule-map">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="map" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="fielddef" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="hygienerule" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="matching-rule-map">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="map" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="fielddef" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="matchingrule" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlType(name = "", propOrder = {
    "moduleName",
    "fileName",
    "idname",
    "ridField",
    "sourcefield",
    "fields",
    "matchingRules",
    "hygieneRules",
    "hygieneRuleMap",
    "matchingRuleMap"
})
@XmlRootElement(name = "salt-specification")
public class SaltSpecification {

    @XmlElement(name = "module-name", required = true)
    protected String moduleName;
    @XmlElement(name = "file-name", required = true)
    protected String fileName;
    
    //@XmlElement(name = "idfield", required = true)
    //protected String idfield;
    
    @XmlElement(name = "idname", required = false)
    protected String idname;
    
    @XmlElement(name = "ridfield", required = true)
    protected String ridField;
    
    @XmlElement(name = "sourcefield", required = false)
    protected String sourcefield;
    
    
    @XmlElement(required = true)
    protected SaltSpecification.Fields fields;
    @XmlElement(name = "matching-rules", required = true)
    protected SaltSpecification.MatchingRules matchingRules;
    @XmlElement(name = "hygiene-rules", required = true)
    protected SaltSpecification.HygieneRules hygieneRules;
    @XmlElement(name = "hygiene-rule-map", required = true)
    protected SaltSpecification.HygieneRuleMap hygieneRuleMap;
    @XmlElement(name = "matching-rule-map", required = true)
    protected SaltSpecification.MatchingRuleMap matchingRuleMap;

    /**
     * Gets the value of the moduleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleName() {
        return moduleName;
    }

    /**
     * Sets the value of the moduleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleName(String value) {
        this.moduleName = value;
    }

   

	/**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link SaltSpecification.Fields }
     *     
     */
    public SaltSpecification.Fields getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaltSpecification.Fields }
     *     
     */
    public void setFields(SaltSpecification.Fields value) {
        this.fields = value;
    }

    /**
     * Gets the value of the matchingRules property.
     * 
     * @return
     *     possible object is
     *     {@link SaltSpecification.MatchingRules }
     *     
     */
    public SaltSpecification.MatchingRules getMatchingRules() {
        return matchingRules;
    }

    /**
     * Sets the value of the matchingRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaltSpecification.MatchingRules }
     *     
     */
    public void setMatchingRules(SaltSpecification.MatchingRules value) {
        this.matchingRules = value;
    }

    /**
     * Gets the value of the hygieneRules property.
     * 
     * @return
     *     possible object is
     *     {@link SaltSpecification.HygieneRules }
     *     
     */
    public SaltSpecification.HygieneRules getHygieneRules() {
        return hygieneRules;
    }

    /**
     * Sets the value of the hygieneRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaltSpecification.HygieneRules }
     *     
     */
    public void setHygieneRules(SaltSpecification.HygieneRules value) {
        this.hygieneRules = value;
    }

    /**
     * Gets the value of the hygieneRuleMap property.
     * 
     * @return
     *     possible object is
     *     {@link SaltSpecification.HygieneRuleMap }
     *     
     */
    public SaltSpecification.HygieneRuleMap getHygieneRuleMap() {
        return hygieneRuleMap;
    }

    /**
     * Sets the value of the hygieneRuleMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaltSpecification.HygieneRuleMap }
     *     
     */
    public void setHygieneRuleMap(SaltSpecification.HygieneRuleMap value) {
        this.hygieneRuleMap = value;
    }

    /**
     * Gets the value of the matchingRuleMap property.
     * 
     * @return
     *     possible object is
     *     {@link SaltSpecification.MatchingRuleMap }
     *     
     */
    public SaltSpecification.MatchingRuleMap getMatchingRuleMap() {
        return matchingRuleMap;
    }

    /**
     * Sets the value of the matchingRuleMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaltSpecification.MatchingRuleMap }
     *     
     */
    public void setMatchingRuleMap(SaltSpecification.MatchingRuleMap value) {
        this.matchingRuleMap = value;
    }

    

    //public String getIdfield() {
	//	return idfield;
	//}

	//public void setIdfield(String idfield) {
	//	this.idfield = idfield;
	//}

	public String getIdname() {
		return idname;
	}

	public void setIdname(String idname) {
		this.idname = idname;
	}

	public String getSourcefield() {
		return sourcefield;
	}

	public void setSourcefield(String sourcefield) {
		this.sourcefield = sourcefield;
	}
	
	

	public String getRidField() {
		return ridField;
	}

	public void setRidField(String ridField) {
		this.ridField = ridField;
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
     *         &lt;element name="fielddef" type="{http://hpccsystems.com/SALT}field-def" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class Fields {

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
     *         &lt;element name="map" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="fielddef" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="hygienerule" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    @XmlType(name = "", propOrder = {
        "map"
    })
    public static class HygieneRuleMap {

        protected List<SaltSpecification.HygieneRuleMap.Map> map;

        /**
         * Gets the value of the map property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the map property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMap().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SaltSpecification.HygieneRuleMap.Map }
         * 
         * 
         */
        public List<SaltSpecification.HygieneRuleMap.Map> getMap() {
            if (map == null) {
                map = new ArrayList<SaltSpecification.HygieneRuleMap.Map>();
            }
            return this.map;
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
         *         &lt;element name="fielddef" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="hygienerule" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "fielddef",
            "hygienerule"
        })
        public static class Map {

            @XmlElement(required = true)
            protected String fielddef;
            @XmlElement(required = true)
            protected String hygienerule;

            /**
             * Gets the value of the fielddef property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFielddef() {
                return fielddef;
            }

            /**
             * Sets the value of the fielddef property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFielddef(String value) {
                this.fielddef = value;
            }

            /**
             * Gets the value of the hygienerule property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHygienerule() {
                return hygienerule;
            }

            /**
             * Sets the value of the hygienerule property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHygienerule(String value) {
                this.hygienerule = value;
            }

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
     *         &lt;element name="rule" type="{http://hpccsystems.com/SALT}hygiene-rule" maxOccurs="unbounded" minOccurs="0"/>
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
        "rule"
    })
    public static class HygieneRules {

        protected List<HygieneRule> rule;

        /**
         * Gets the value of the rule property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rule property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HygieneRule }
         * 
         * 
         */
        public List<HygieneRule> getRule() {
            if (rule == null) {
                rule = new ArrayList<HygieneRule>();
            }
            return this.rule;
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
     *         &lt;element name="map" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="fielddef" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="matchingrule" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    @XmlType(name = "", propOrder = {
        "map"
    })
    public static class MatchingRuleMap {

        protected List<SaltSpecification.MatchingRuleMap.Map> map;

        /**
         * Gets the value of the map property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the map property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMap().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SaltSpecification.MatchingRuleMap.Map }
         * 
         * 
         */
        public List<SaltSpecification.MatchingRuleMap.Map> getMap() {
            if (map == null) {
                map = new ArrayList<SaltSpecification.MatchingRuleMap.Map>();
            }
            return this.map;
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
         *         &lt;element name="fielddef" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="matchingrule" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "fielddef",
            "matchingrule"
        })
        public static class Map {

            @XmlElement(required = true)
            protected String fielddef;
            @XmlElement(required = true)
            protected String matchingrule;

            /**
             * Gets the value of the fielddef property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFielddef() {
                return fielddef;
            }

            /**
             * Sets the value of the fielddef property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFielddef(String value) {
                this.fielddef = value;
            }

            /**
             * Gets the value of the matchingrule property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMatchingrule() {
                return matchingrule;
            }

            /**
             * Sets the value of the matchingrule property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMatchingrule(String value) {
                this.matchingrule = value;
            }

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
     *         &lt;element name="rule" type="{http://hpccsystems.com/SALT}matching-rule" maxOccurs="unbounded" minOccurs="0"/>
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
        "rule"
    })
    public static class MatchingRules {

        protected List<MatchingRule> rule;

        /**
         * Gets the value of the rule property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rule property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MatchingRule }
         * 
         * 
         */
        public List<MatchingRule> getRule() {
            if (rule == null) {
                rule = new ArrayList<MatchingRule>();
            }
            return this.rule;
        }

    }

}
