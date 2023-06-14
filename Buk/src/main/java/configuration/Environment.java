package configuration;

	// Interface to use specific enviroment
public enum Environment {
	TEST("test"),
    PROD("prod");
    public final String env;
    Environment(String env) {
        this.env = env;
    }
}
