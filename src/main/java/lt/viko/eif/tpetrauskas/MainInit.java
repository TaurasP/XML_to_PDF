package lt.viko.eif.tpetrauskas;

import lombok.Getter;
import lt.viko.eif.tpetrauskas.service.XMLServiceImpl;

/**
 * MainInit entity is used to create and initialize data for Main method to run this application.
 */
@Getter
public class MainInit {
    private XMLServiceImpl xmlService = new XMLServiceImpl();
    private String xsltFileName = "cars-to-pdf.xsl";
    private String xmlSourceName = "cars-to-pdf.xml";
    private String convertedFileName = "cars.pdf";
}
