package osgi.demo.client;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import osgi.demo.calculator.CalculatorService;

public class Activator implements BundleActivator {

	@Override
	public void start(BundleContext context) throws Exception {
        ServiceReference<CalculatorService> ref =
                context.getServiceReference(CalculatorService.class);

            if (ref != null) {
                CalculatorService service = context.getService(ref);
                System.out.println("Calculator Service successfully retrieved from OSGi Service Registry");
                // Pass the service to our separate client class
                CalculatorClient client = new CalculatorClient(service);
                client.performArithmetic();
            } else {
                System.out.println("Calculator Service not found.");
            }
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
        System.out.println("Client bundle stopped.");
	}

}
