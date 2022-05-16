package lt.viko.eif.tpetrauskas;

import lt.viko.eif.tpetrauskas.service.XMLServiceImpl;
import org.apache.fop.apps.FOPException;

import javax.xml.transform.TransformerException;
import java.io.IOException;

/**
 * Main method.
 *
 */
public class Main
{
    public static void main( String[] args ) {
        XMLServiceImpl xmlService = new XMLServiceImpl();
        String xsltFileName = "cars-to-pdf.xsl";
        String xmlSourceName = "cars-to-pdf.xml";
        String convertedFileName = "cars.pdf";

        try {
            xmlService.convertToPDF(xsltFileName, xmlSourceName, convertedFileName);
        } catch (FOPException | IOException | TransformerException e) {
            System.out.println(e.getMessage());
        }
    }
}
