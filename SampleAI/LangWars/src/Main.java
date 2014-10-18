
public class Main {
	public static final String JAVA_CMD = "java -cp bin ";
	public static final Class<?> PLAYER_0 = YourAI.class;
	public static final Class<?> PLAYER_1 = SampleAI.class;
	public static final Class<?> PLAYER_2 = SampleAI.class;
	public static final Class<?> PLAYER_3 = SampleAI.class;

	public static void main(String[] args) {
		net.aicomp.Main.main(new String[] {
				"-a", JAVA_CMD + PLAYER_0.getName(),
				"-a", JAVA_CMD + PLAYER_1.getName(),
				"-a", JAVA_CMD + PLAYER_2.getName(),
				"-a", JAVA_CMD + PLAYER_3.getName()});
	}
}
