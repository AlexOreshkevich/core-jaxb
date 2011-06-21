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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for infoblock.visualizers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="infoblock.visualizers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Visualizers">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="HtmlTextVisualizer" type="{http://www.prognoz.ru/Adhoc}generic.visualizer" minOccurs="0"/>
 *                   &lt;element name="FusionChartVisualizer" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.prognoz.ru/Adhoc}generic.visualizer">
 *                           &lt;attribute name="Type" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="Bubble"/>
 *                                 &lt;enumeration value="Column3D"/>
 *                                 &lt;enumeration value="Doughnut2D"/>
 *                                 &lt;enumeration value="Doughnut3D"/>
 *                                 &lt;enumeration value="Line"/>
 *                                 &lt;enumeration value="MSArea"/>
 *                                 &lt;enumeration value="MSBar2D"/>
 *                                 &lt;enumeration value="MSBar3D"/>
 *                                 &lt;enumeration value="MSColumn2D"/>
 *                                 &lt;enumeration value="MSColumn3D"/>
 *                                 &lt;enumeration value="MSColumn3DLineDY"/>
 *                                 &lt;enumeration value="MSColumnLine3D"/>
 *                                 &lt;enumeration value="MSCombyDY2D"/>
 *                                 &lt;enumeration value="MSLine"/>
 *                                 &lt;enumeration value="MSStackedColumn2D"/>
 *                                 &lt;enumeration value="MSStackedColumn2DLineDY"/>
 *                                 &lt;enumeration value="Pie3D"/>
 *                                 &lt;enumeration value="StackedBar2D"/>
 *                                 &lt;enumeration value="StackedColumn2D"/>
 *                                 &lt;enumeration value="StackedColumn3D"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="FlashMapVisualizer" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.prognoz.ru/Adhoc}generic.visualizer">
 *                           &lt;attribute name="TopoBase" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="P5ExpressReportVisualizer" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.prognoz.ru/Adhoc}generic.visualizer">
 *                           &lt;attribute name="Type" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="Table"/>
 *                                 &lt;enumeration value="Chart"/>
 *                                 &lt;enumeration value="Map"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="P5ProceduralReportVisualizer" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.prognoz.ru/Adhoc}generic.visualizer">
 *                           &lt;attribute name="Sheet" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TableVisualizer" type="{http://www.prognoz.ru/Adhoc}generic.visualizer" minOccurs="0"/>
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
@XmlType(name = "infoblock.visualizers", propOrder = {
    "visualizers"
})
public class InfoblockVisualizers {

    @XmlElement(name = "Visualizers", required = true)
    protected InfoblockVisualizers.Visualizers visualizers;

    /**
     * Gets the value of the visualizers property.
     * 
     * @return
     *     possible object is
     *     {@link InfoblockVisualizers.Visualizers }
     *     
     */
    public InfoblockVisualizers.Visualizers getVisualizers() {
        return visualizers;
    }

    /**
     * Sets the value of the visualizers property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoblockVisualizers.Visualizers }
     *     
     */
    public void setVisualizers(InfoblockVisualizers.Visualizers value) {
        this.visualizers = value;
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
     *         &lt;element name="HtmlTextVisualizer" type="{http://www.prognoz.ru/Adhoc}generic.visualizer" minOccurs="0"/>
     *         &lt;element name="FusionChartVisualizer" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.prognoz.ru/Adhoc}generic.visualizer">
     *                 &lt;attribute name="Type" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="Bubble"/>
     *                       &lt;enumeration value="Column3D"/>
     *                       &lt;enumeration value="Doughnut2D"/>
     *                       &lt;enumeration value="Doughnut3D"/>
     *                       &lt;enumeration value="Line"/>
     *                       &lt;enumeration value="MSArea"/>
     *                       &lt;enumeration value="MSBar2D"/>
     *                       &lt;enumeration value="MSBar3D"/>
     *                       &lt;enumeration value="MSColumn2D"/>
     *                       &lt;enumeration value="MSColumn3D"/>
     *                       &lt;enumeration value="MSColumn3DLineDY"/>
     *                       &lt;enumeration value="MSColumnLine3D"/>
     *                       &lt;enumeration value="MSCombyDY2D"/>
     *                       &lt;enumeration value="MSLine"/>
     *                       &lt;enumeration value="MSStackedColumn2D"/>
     *                       &lt;enumeration value="MSStackedColumn2DLineDY"/>
     *                       &lt;enumeration value="Pie3D"/>
     *                       &lt;enumeration value="StackedBar2D"/>
     *                       &lt;enumeration value="StackedColumn2D"/>
     *                       &lt;enumeration value="StackedColumn3D"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="FlashMapVisualizer" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.prognoz.ru/Adhoc}generic.visualizer">
     *                 &lt;attribute name="TopoBase" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="P5ExpressReportVisualizer" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.prognoz.ru/Adhoc}generic.visualizer">
     *                 &lt;attribute name="Type" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="Table"/>
     *                       &lt;enumeration value="Chart"/>
     *                       &lt;enumeration value="Map"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="P5ProceduralReportVisualizer" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.prognoz.ru/Adhoc}generic.visualizer">
     *                 &lt;attribute name="Sheet" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TableVisualizer" type="{http://www.prognoz.ru/Adhoc}generic.visualizer" minOccurs="0"/>
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
        "htmlTextVisualizer",
        "fusionChartVisualizer",
        "flashMapVisualizer",
        "p5ExpressReportVisualizer",
        "p5ProceduralReportVisualizer",
        "tableVisualizer"
    })
    public static class Visualizers {

        @XmlElement(name = "HtmlTextVisualizer")
        protected GenericVisualizer htmlTextVisualizer;
        @XmlElement(name = "FusionChartVisualizer")
        protected InfoblockVisualizers.Visualizers.FusionChartVisualizer fusionChartVisualizer;
        @XmlElement(name = "FlashMapVisualizer")
        protected InfoblockVisualizers.Visualizers.FlashMapVisualizer flashMapVisualizer;
        @XmlElement(name = "P5ExpressReportVisualizer")
        protected InfoblockVisualizers.Visualizers.P5ExpressReportVisualizer p5ExpressReportVisualizer;
        @XmlElement(name = "P5ProceduralReportVisualizer")
        protected InfoblockVisualizers.Visualizers.P5ProceduralReportVisualizer p5ProceduralReportVisualizer;
        @XmlElement(name = "TableVisualizer")
        protected GenericVisualizer tableVisualizer;

        /**
         * Gets the value of the htmlTextVisualizer property.
         * 
         * @return
         *     possible object is
         *     {@link GenericVisualizer }
         *     
         */
        public GenericVisualizer getHtmlTextVisualizer() {
            return htmlTextVisualizer;
        }

        /**
         * Sets the value of the htmlTextVisualizer property.
         * 
         * @param value
         *     allowed object is
         *     {@link GenericVisualizer }
         *     
         */
        public void setHtmlTextVisualizer(GenericVisualizer value) {
            this.htmlTextVisualizer = value;
        }

        /**
         * Gets the value of the fusionChartVisualizer property.
         * 
         * @return
         *     possible object is
         *     {@link InfoblockVisualizers.Visualizers.FusionChartVisualizer }
         *     
         */
        public InfoblockVisualizers.Visualizers.FusionChartVisualizer getFusionChartVisualizer() {
            return fusionChartVisualizer;
        }

        /**
         * Sets the value of the fusionChartVisualizer property.
         * 
         * @param value
         *     allowed object is
         *     {@link InfoblockVisualizers.Visualizers.FusionChartVisualizer }
         *     
         */
        public void setFusionChartVisualizer(InfoblockVisualizers.Visualizers.FusionChartVisualizer value) {
            this.fusionChartVisualizer = value;
        }

        /**
         * Gets the value of the flashMapVisualizer property.
         * 
         * @return
         *     possible object is
         *     {@link InfoblockVisualizers.Visualizers.FlashMapVisualizer }
         *     
         */
        public InfoblockVisualizers.Visualizers.FlashMapVisualizer getFlashMapVisualizer() {
            return flashMapVisualizer;
        }

        /**
         * Sets the value of the flashMapVisualizer property.
         * 
         * @param value
         *     allowed object is
         *     {@link InfoblockVisualizers.Visualizers.FlashMapVisualizer }
         *     
         */
        public void setFlashMapVisualizer(InfoblockVisualizers.Visualizers.FlashMapVisualizer value) {
            this.flashMapVisualizer = value;
        }

        /**
         * Gets the value of the p5ExpressReportVisualizer property.
         * 
         * @return
         *     possible object is
         *     {@link InfoblockVisualizers.Visualizers.P5ExpressReportVisualizer }
         *     
         */
        public InfoblockVisualizers.Visualizers.P5ExpressReportVisualizer getP5ExpressReportVisualizer() {
            return p5ExpressReportVisualizer;
        }

        /**
         * Sets the value of the p5ExpressReportVisualizer property.
         * 
         * @param value
         *     allowed object is
         *     {@link InfoblockVisualizers.Visualizers.P5ExpressReportVisualizer }
         *     
         */
        public void setP5ExpressReportVisualizer(InfoblockVisualizers.Visualizers.P5ExpressReportVisualizer value) {
            this.p5ExpressReportVisualizer = value;
        }

        /**
         * Gets the value of the p5ProceduralReportVisualizer property.
         * 
         * @return
         *     possible object is
         *     {@link InfoblockVisualizers.Visualizers.P5ProceduralReportVisualizer }
         *     
         */
        public InfoblockVisualizers.Visualizers.P5ProceduralReportVisualizer getP5ProceduralReportVisualizer() {
            return p5ProceduralReportVisualizer;
        }

        /**
         * Sets the value of the p5ProceduralReportVisualizer property.
         * 
         * @param value
         *     allowed object is
         *     {@link InfoblockVisualizers.Visualizers.P5ProceduralReportVisualizer }
         *     
         */
        public void setP5ProceduralReportVisualizer(InfoblockVisualizers.Visualizers.P5ProceduralReportVisualizer value) {
            this.p5ProceduralReportVisualizer = value;
        }

        /**
         * Gets the value of the tableVisualizer property.
         * 
         * @return
         *     possible object is
         *     {@link GenericVisualizer }
         *     
         */
        public GenericVisualizer getTableVisualizer() {
            return tableVisualizer;
        }

        /**
         * Sets the value of the tableVisualizer property.
         * 
         * @param value
         *     allowed object is
         *     {@link GenericVisualizer }
         *     
         */
        public void setTableVisualizer(GenericVisualizer value) {
            this.tableVisualizer = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.prognoz.ru/Adhoc}generic.visualizer">
         *       &lt;attribute name="TopoBase" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class FlashMapVisualizer
            extends GenericVisualizer
        {

            @XmlAttribute(name = "TopoBase", required = true)
            protected String topoBase;

            /**
             * Gets the value of the topoBase property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTopoBase() {
                return topoBase;
            }

            /**
             * Sets the value of the topoBase property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTopoBase(String value) {
                this.topoBase = value;
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
         *     &lt;extension base="{http://www.prognoz.ru/Adhoc}generic.visualizer">
         *       &lt;attribute name="Type" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="Bubble"/>
         *             &lt;enumeration value="Column3D"/>
         *             &lt;enumeration value="Doughnut2D"/>
         *             &lt;enumeration value="Doughnut3D"/>
         *             &lt;enumeration value="Line"/>
         *             &lt;enumeration value="MSArea"/>
         *             &lt;enumeration value="MSBar2D"/>
         *             &lt;enumeration value="MSBar3D"/>
         *             &lt;enumeration value="MSColumn2D"/>
         *             &lt;enumeration value="MSColumn3D"/>
         *             &lt;enumeration value="MSColumn3DLineDY"/>
         *             &lt;enumeration value="MSColumnLine3D"/>
         *             &lt;enumeration value="MSCombyDY2D"/>
         *             &lt;enumeration value="MSLine"/>
         *             &lt;enumeration value="MSStackedColumn2D"/>
         *             &lt;enumeration value="MSStackedColumn2DLineDY"/>
         *             &lt;enumeration value="Pie3D"/>
         *             &lt;enumeration value="StackedBar2D"/>
         *             &lt;enumeration value="StackedColumn2D"/>
         *             &lt;enumeration value="StackedColumn3D"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class FusionChartVisualizer
            extends GenericVisualizer
        {

            @XmlAttribute(name = "Type", required = true)
            protected String type;

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
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
         *     &lt;extension base="{http://www.prognoz.ru/Adhoc}generic.visualizer">
         *       &lt;attribute name="Type" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="Table"/>
         *             &lt;enumeration value="Chart"/>
         *             &lt;enumeration value="Map"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class P5ExpressReportVisualizer
            extends GenericVisualizer
        {

            @XmlAttribute(name = "Type", required = true)
            protected String type;

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
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
         *     &lt;extension base="{http://www.prognoz.ru/Adhoc}generic.visualizer">
         *       &lt;attribute name="Sheet" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class P5ProceduralReportVisualizer
            extends GenericVisualizer
        {

            @XmlAttribute(name = "Sheet", required = true)
            protected String sheet;

            /**
             * Gets the value of the sheet property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSheet() {
                return sheet;
            }

            /**
             * Sets the value of the sheet property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSheet(String value) {
                this.sheet = value;
            }

        }

    }

}