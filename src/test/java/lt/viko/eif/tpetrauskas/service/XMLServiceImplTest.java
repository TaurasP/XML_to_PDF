package lt.viko.eif.tpetrauskas.service;

import lt.viko.eif.tpetrauskas.MainInit;
import org.apache.fop.apps.*;
import org.junit.jupiter.api.Test;

import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;

import static org.junit.jupiter.api.Assertions.*;

class XMLServiceImplTest {

    private MainInit init = new MainInit();
    private String xsltFileName = "cars-to-pdf.xsl";
    private String xmlSourceName = "cars-to-pdf.xml";
    private String convertedFileName = "cars.pdf";
    private XMLServiceImpl xmlService = new XMLServiceImpl();

    private File xsltFile = new File(init.getXsltFileName());
    private StreamSource xmlSource = new StreamSource(new File(init.getXmlSourceName()));
    private FopFactory fopFactory = FopFactory.newInstance(new File(".").toURI());
    private FOUserAgent foUserAgent = fopFactory.newFOUserAgent();
    private OutputStream out = new java.io.FileOutputStream(init.getConvertedFileName());
    private Fop fop = fopFactory.newFop(MimeConstants.MIME_PDF, foUserAgent, out);
    private TransformerFactory factory = TransformerFactory.newInstance();
    private Transformer transformer = factory.newTransformer(new StreamSource(xsltFile));
    private Result res = new SAXResult(fop.getDefaultHandler());

    XMLServiceImplTest() throws FileNotFoundException, FOPException, TransformerConfigurationException {
    }

    @Test
    void convertToPDF() {
        assertNotNull(xsltFile);
        assertNotNull(xmlSource);
        assertNotNull(out);

        assertEquals(xsltFileName, init.getXsltFileName());
        assertEquals(xmlSourceName, init.getXmlSourceName());
        assertEquals(convertedFileName, init.getConvertedFileName());

        assertNotNull(fop);
        assertNotNull(factory);
        assertNotNull(transformer);
        assertNotNull(res);
    }
}