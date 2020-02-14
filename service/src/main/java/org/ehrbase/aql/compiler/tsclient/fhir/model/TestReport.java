//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.26 at 01:33:12 PM CET 
//


package org.ehrbase.aql.compiler.tsclient.fhir.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for TestReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestReport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}DomainResource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" minOccurs="0"/>
 *         &lt;element name="name" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}TestReportStatus"/>
 *         &lt;element name="testScript" type="{http://hl7.org/fhir}Reference"/>
 *         &lt;element name="result" type="{http://hl7.org/fhir}TestReportResult"/>
 *         &lt;element name="score" type="{http://hl7.org/fhir}decimal" minOccurs="0"/>
 *         &lt;element name="tester" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="issued" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="participant" type="{http://hl7.org/fhir}TestReport.Participant" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="setup" type="{http://hl7.org/fhir}TestReport.Setup" minOccurs="0"/>
 *         &lt;element name="test" type="{http://hl7.org/fhir}TestReport.Test" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="teardown" type="{http://hl7.org/fhir}TestReport.Teardown" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestReport", propOrder = {
    "identifier",
    "name",
    "status",
    "testScript",
    "result",
    "score",
    "tester",
    "issued",
    "participant",
    "setup",
    "test",
    "teardown"
})
public class TestReport
    extends DomainResource
{

    protected Identifier identifier;
    protected String name;
    @XmlElement(required = true)
    protected TestReportStatus status;
    @XmlElement(required = true)
    protected Reference testScript;
    @XmlElement(required = true)
    protected TestReportResult result;
    protected Decimal score;
    protected String tester;
    protected DateTime issued;
    protected List<TestReportParticipant> participant;
    protected TestReportSetup setup;
    protected List<TestReportTest> test;
    protected TestReportTeardown teardown;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setIdentifier(Identifier value) {
        this.identifier = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TestReportStatus }
     *     
     */
    public TestReportStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestReportStatus }
     *     
     */
    public void setStatus(TestReportStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the testScript property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getTestScript() {
        return testScript;
    }

    /**
     * Sets the value of the testScript property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setTestScript(Reference value) {
        this.testScript = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link TestReportResult }
     *     
     */
    public TestReportResult getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestReportResult }
     *     
     */
    public void setResult(TestReportResult value) {
        this.result = value;
    }

    /**
     * Gets the value of the score property.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setScore(Decimal value) {
        this.score = value;
    }

    /**
     * Gets the value of the tester property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTester() {
        return tester;
    }

    /**
     * Sets the value of the tester property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTester(String value) {
        this.tester = value;
    }

    /**
     * Gets the value of the issued property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getIssued() {
        return issued;
    }

    /**
     * Sets the value of the issued property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setIssued(DateTime value) {
        this.issued = value;
    }

    /**
     * Gets the value of the participant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestReportParticipant }
     * 
     * 
     */
    public List<TestReportParticipant> getParticipant() {
        if (participant == null) {
            participant = new ArrayList<TestReportParticipant>();
        }
        return this.participant;
    }

    /**
     * Gets the value of the setup property.
     * 
     * @return
     *     possible object is
     *     {@link TestReportSetup }
     *     
     */
    public TestReportSetup getSetup() {
        return setup;
    }

    /**
     * Sets the value of the setup property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestReportSetup }
     *     
     */
    public void setSetup(TestReportSetup value) {
        this.setup = value;
    }

    /**
     * Gets the value of the test property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the test property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestReportTest }
     * 
     * 
     */
    public List<TestReportTest> getTest() {
        if (test == null) {
            test = new ArrayList<TestReportTest>();
        }
        return this.test;
    }

    /**
     * Gets the value of the teardown property.
     * 
     * @return
     *     possible object is
     *     {@link TestReportTeardown }
     *     
     */
    public TestReportTeardown getTeardown() {
        return teardown;
    }

    /**
     * Sets the value of the teardown property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestReportTeardown }
     *     
     */
    public void setTeardown(TestReportTeardown value) {
        this.teardown = value;
    }

}
