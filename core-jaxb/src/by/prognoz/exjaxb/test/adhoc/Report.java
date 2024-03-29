//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.21 at 10:39:14 AM EEST 
//


package by.prognoz.exjaxb.test.adhoc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for report complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="report">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Report.Views">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Views">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="View" type="{http://www.prognoz.ru/Adhoc}view" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="DefaultView" type="{http://www.prognoz.ru/Adhoc}idType" default="0" />
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
 *       &lt;attribute name="Id" use="required" type="{http://www.prognoz.ru/Adhoc}idType" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ThemeId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DefaultThemeId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "report", propOrder = {
    "reportViews"
})
public class Report {

    @XmlElement(name = "Report.Views", required = true)
    protected Report.ReportViews reportViews;
    @XmlAttribute(name = "Id", required = true)
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Description")
    protected String description;
    @XmlAttribute(name = "ThemeId")
    protected String themeId;
    @XmlAttribute(name = "DefaultThemeId")
    protected String defaultThemeId;

    /**
     * Gets the value of the reportViews property.
     * 
     * @return
     *     possible object is
     *     {@link Report.ReportViews }
     *     
     */
    public Report.ReportViews getReportViews() {
        return reportViews;
    }

    /**
     * Sets the value of the reportViews property.
     * 
     * @param value
     *     allowed object is
     *     {@link Report.ReportViews }
     *     
     */
    public void setReportViews(Report.ReportViews value) {
        this.reportViews = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

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
     * Gets the value of the themeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThemeId() {
        return themeId;
    }

    /**
     * Sets the value of the themeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThemeId(String value) {
        this.themeId = value;
    }

    /**
     * Gets the value of the defaultThemeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultThemeId() {
        return defaultThemeId;
    }

    /**
     * Sets the value of the defaultThemeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultThemeId(String value) {
        this.defaultThemeId = value;
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
     *         &lt;element name="Views">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="View" type="{http://www.prognoz.ru/Adhoc}view" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="DefaultView" type="{http://www.prognoz.ru/Adhoc}idType" default="0" />
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
        "views"
    })
    public static class ReportViews {

        @XmlElement(name = "Views", required = true)
        protected Report.ReportViews.Views views;

        /**
         * Gets the value of the views property.
         * 
         * @return
         *     possible object is
         *     {@link Report.ReportViews.Views }
         *     
         */
        public Report.ReportViews.Views getViews() {
            return views;
        }

        /**
         * Sets the value of the views property.
         * 
         * @param value
         *     allowed object is
         *     {@link Report.ReportViews.Views }
         *     
         */
        public void setViews(Report.ReportViews.Views value) {
            this.views = value;
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
         *         &lt;element name="View" type="{http://www.prognoz.ru/Adhoc}view" maxOccurs="unbounded"/>
         *       &lt;/sequence>
         *       &lt;attribute name="DefaultView" type="{http://www.prognoz.ru/Adhoc}idType" default="0" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "view"
        })
        public static class Views {

            @XmlElement(name = "View", required = true)
            protected List<View> view;
            @XmlAttribute(name = "DefaultView")
            protected String defaultView;

            /**
             * Gets the value of the view property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the view property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getView().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link View }
             * 
             * 
             */
            public List<View> getView() {
                if (view == null) {
                    view = new ArrayList<View>();
                }
                return this.view;
            }

            /**
             * Gets the value of the defaultView property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefaultView() {
                if (defaultView == null) {
                    return "0";
                } else {
                    return defaultView;
                }
            }

            /**
             * Sets the value of the defaultView property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefaultView(String value) {
                this.defaultView = value;
            }

        }

    }

}
