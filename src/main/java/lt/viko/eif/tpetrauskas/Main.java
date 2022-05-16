package lt.viko.eif.tpetrauskas;

import org.apache.fop.apps.FOPException;

import javax.xml.transform.TransformerException;
import java.io.IOException;

/**
 * This is a main entity for a main method of this application.
 */
public class Main {
    /**
     * This is a main method of this application.
     * It reads xsltFileName (.xsl) and xmlSourceName (.xml) files and converts xmlSourceName (.xml) to convertedFileName (.pdf) file.
     */
    public static void main( String[] args ) {
        MainInit init = new MainInit();

        try {
            init.getXmlService().convertToPDF(init.getXsltFileName(), init.getXmlSourceName(), init.getConvertedFileName());
        } catch (FOPException | IOException | TransformerException e) {
            System.out.println(e.getMessage());
        }
    }
}
