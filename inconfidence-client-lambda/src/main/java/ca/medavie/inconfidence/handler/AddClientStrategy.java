package ca.medavie.inconfidence.handler;

import java.util.Random;

import ca.medavie.aws.lambda.AbstractResourceMethodStrategy;
import ca.medavie.aws.lambda.MedavieAWSException;
import ca.medavie.inconfidence.domain.Client;

public class AddClientStrategy extends AbstractResourceMethodStrategy<Client, Client, Void> {

	public  AddClientStrategy() {
		super(Client.class, Void.class);
	}
	
	@Override
	
	protected Client handleRequest(Client inputData, Void params) throws MedavieAWSException {
		inputData.setId(new Random().nextLong());
		return inputData;
	}

}
