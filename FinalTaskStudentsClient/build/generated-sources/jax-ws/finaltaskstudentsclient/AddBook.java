
package finaltaskstudentsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addBook complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addBook">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="book" type="{http://ws/}student" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addBook", propOrder = {
    "book"
})
public class AddBook {

    protected Student book;

    /**
     * Gets the value of the book property.
     * 
     * @return
     *     possible object is
     *     {@link Student }
     *     
     */
    public Student getBook() {
        return book;
    }

    /**
     * Sets the value of the book property.
     * 
     * @param value
     *     allowed object is
     *     {@link Student }
     *     
     */
    public void setBook(Student value) {
        this.book = value;
    }

}
