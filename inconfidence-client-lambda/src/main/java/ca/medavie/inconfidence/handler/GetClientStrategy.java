package ca.medavie.inconfidence.handler;

import ca.medavie.aws.lambda.AbstractResourceMethodStrategy;
import ca.medavie.aws.lambda.MedavieAWSException;
import ca.medavie.inconfidence.domain.Client;


public class GetClientStrategy extends AbstractResourceMethodStrategy<Void, Client, GetClientParameters> {

	public GetClientStrategy() {
		super(Void.class, GetClientParameters.class);
	}

	@Override
	protected Client handleRequest(Void inputData, GetClientParameters params) throws MedavieAWSException {
		Client client = new Client();
		client.setId(params.getClientid());
		client.setCtlPlan("ATL");
		return client;
	}

}
