package edu.iris.dmc;

import java.io.InputStream;
import java.util.List;

import javax.xml.transform.stream.StreamSource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Controller;

import edu.iris.dmc.fdsn.station.model.FDSNStationXML;
import edu.iris.dmc.fdsn.station.model.Network;
import edu.iris.dmc.validation.Errors;
import edu.iris.dmc.validation.LEVEL;
import edu.iris.dmc.validation.ValidatorService;

@Controller
public class ValidStationController {

	private static final Logger LOG = Logger.getLogger(ValidStationController.class);

	@Autowired
	private ValidatorService validatorService;

	@Autowired
	private Jaxb2Marshaller theMarshaller;

	public void run(InputStream is, Errors errors) {System.out.println("1////////");
		FDSNStationXML document = (FDSNStationXML) theMarshaller.unmarshal(new StreamSource(is));

		List<Network> networks = document.getNetwork();
		if (networks == null || networks.isEmpty()) {
			// throw exception or null
		}System.out.println("////////");
		validatorService.run(document.getNetwork(), LEVEL.RESPONSE, errors);
	}
}
