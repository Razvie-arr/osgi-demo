package osgi.demo.calculator;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	private ServiceRegistration<CalculatorService> registration;

	public void start(BundleContext bundleContext) throws Exception {
		CalculatorService calculatorService = new CalculatorServiceImpl();
        registration = bundleContext.registerService(
                CalculatorService.class,
                calculatorService,
                null
            );
        System.out.println("Calculator Service registered.");
	}

	public void stop(BundleContext bundleContext) throws Exception {
        if (registration != null) {
            registration.unregister();
            System.out.println("Calculator Service unregistered.");
        }
	}

}
