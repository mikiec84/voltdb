//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.15 at 06:22:05 PM EST 
//


package org.voltdb.compiler.deploymentfile;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clusterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clusterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="hostcount" type="{http://www.w3.org/2001/XMLSchema}int" default="1" />
 *       &lt;attribute name="sitesperhost" type="{http://www.w3.org/2001/XMLSchema}int" default="2" />
 *       &lt;attribute name="kfactor" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clusterType")
public class ClusterType {

    @XmlAttribute
    protected Integer hostcount;
    @XmlAttribute
    protected Integer sitesperhost;
    @XmlAttribute
    protected Integer kfactor;

    /**
     * Gets the value of the hostcount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getHostcount() {
        if (hostcount == null) {
            return  1;
        } else {
            return hostcount;
        }
    }

    /**
     * Sets the value of the hostcount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHostcount(Integer value) {
        this.hostcount = value;
    }

    /**
     * Gets the value of the sitesperhost property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getSitesperhost() {
        if (sitesperhost == null) {
            return  2;
        } else {
            return sitesperhost;
        }
    }

    /**
     * Sets the value of the sitesperhost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSitesperhost(Integer value) {
        this.sitesperhost = value;
    }

    /**
     * Gets the value of the kfactor property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getKfactor() {
        if (kfactor == null) {
            return  0;
        } else {
            return kfactor;
        }
    }

    /**
     * Sets the value of the kfactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKfactor(Integer value) {
        this.kfactor = value;
    }

}
