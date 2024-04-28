package tests.sax.greeting;

public class FemaleGreetingProvider extends AbstractGreetingProvider {

    public FemaleGreetingProvider(String name, String prefix, String suffix) {
        super(name, prefix, suffix);
    }

    @Override
    public String provideGreeting() {
        StringBuilder greeting = new StringBuilder("Sehr geehrte Frau ");
        if (super.prefix != null) {
            greeting.append(super.prefix).append(" ");
        }
        greeting.append(super.name);
        if (super.suffix != null) {
            greeting.append(" ").append(super.suffix);
        }
        return greeting.toString();
    }
}
