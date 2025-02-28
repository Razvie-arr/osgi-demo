# osgi-demo
Part of master thesis.

The calculator application is intentionally simple to focus on OSGi concepts such as *service registration* and *service consumption*. The application workflow is:

1. *Calculator Bundle* registers a `CalculatorService` in the OSGi Service Registry.
2. *Calculator Client Bundle* retrieves this service from the registry and calls its methods to perform arithmetic.
