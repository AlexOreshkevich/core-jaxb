//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.21 at 10:39:14 AM EEST 
//


package by.prognoz.exjaxb.test.adhoc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dsb.param complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dsb.param">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ParamName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SourceBlockId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SourceProperty" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dsb.param")
public class DsbParam {

    @XmlAttribute(name = "ParamName", required = true)
    protected String paramName;
    @XmlAttribute(name = "Value")
    protected String value;
    @XmlAttribute(name = "SourceBlockId")
    protected String sourceBlockId;
    @XmlAttribute(name = "SourceProperty")
    protected String sourceProperty;

    /**
     * Gets the value of the paramName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamName() {
        return paramName;
    }

    /**
     * Sets the value of the paramName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamName(String value) {
        this.paramName = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the sourceBlockId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceBlockId() {
        return sourceBlockId;
    }

    /**
     * Sets the value of the sourceBlockId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceBlockId(String value) {
        this.sourceBlockId = value;
    }

    /**
     * Gets the value of the sourceProperty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceProperty() {
        return sourceProperty;
    }

    /**
     * Sets the value of the sourceProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceProperty(String value) {
        this.sourceProperty = value;
    }

}
