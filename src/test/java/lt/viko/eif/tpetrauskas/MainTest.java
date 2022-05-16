package lt.viko.eif.tpetrauskas;

import lt.viko.eif.tpetrauskas.service.XMLServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private MainInit init = new MainInit();
    private XMLServiceImpl xmlService = new XMLServiceImpl();
    private String xsltFileName = "cars-to-pdf.xsl";
    private String xmlSourceName = "cars-to-pdf.xml";
    private String convertedFileName = "cars.pdf";

    @Test
    void main() {
        assertNotNull(init.getXsltFileName());
        assertNotNull(init.getXmlSourceName());
        assertNotNull(init.getConvertedFileName());
        assertEquals(xsltFileName, init.getXsltFileName());
        assertEquals(xmlSourceName, init.getXmlSourceName());
        assertEquals(convertedFileName, init.getConvertedFileName());
    }
}