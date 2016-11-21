package ca.medavie.inconfidence.handler;

import ca.medavie.aws.lambda.BaseLambdaHandler;
import ca.medavie.aws.lambda.ResourceMethodKey;

public class InconfidenceClientHandler extends BaseLambdaHandler {
	
	public InconfidenceClientHandler() {
		super();
		this.addResourceMethodMapEntry(new ResourceMethodKey("GET", "/client/{clientid}"), new GetClientStrategy());
		this.addResourceMethodMapEntry(new ResourceMethodKey("POST", "/client"), new AddClientStrategy());
	}


}
