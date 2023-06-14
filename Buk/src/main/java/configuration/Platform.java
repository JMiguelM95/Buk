package configuration;

public enum Platform {
	
	// Browsers to be able to use dynamically
	
	FIREFOX("firefox"),
    CHROME("chrome"),
	SAFARI("safari");
	public final String driver;

    Platform(String platformType) {
        this.driver = platformType;
    }

}
