package pattern.strategy;

public class AObj {
    Ainterface ainterface;

    public AObj() {
        ainterface = new AinterfaceImpl();
    }

    public void funcAA() {
        ainterface.funcA();
        ainterface.funcA();
    }
}
