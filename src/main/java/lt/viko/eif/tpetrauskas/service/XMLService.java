package lt.viko.eif.tpetrauskas.service;

import org.apache.fop.apps.FOPException;

import javax.xml.transform.TransformerException;
import java.io.IOException;

/**
 * XMLService is an interface which is implemented on XMLServiceImpl.
 */
public interface XMLService {
    void convertToPDF(String xsltFileName, String xmlSourceName, String convertedFileName) throws IOException, FOPException, TransformerException;
}
