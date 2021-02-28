package mflix;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MflixStarterApplication {

	public static void main(String[] args) {
        SpringApplication.run(MflixStarterApplication.class, args);

        String welcomeMessage =
                ""
                        + "\n"
                        + " __          __  _                            _          __  __ ______ _ _      \n"
                        + " \\ \\        / / | |                          | |        |  \\/  |  ____| (_)     \n"
                        + "  \\ \\  /\\  / /__| | ___ ___  _ __ ___   ___  | |_ ___   | \\  / | |__  | |___  __\n"
                        + "   \\ \\/  \\/ / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\ | __/ _ \\  | |\\/| |  __| | | \\ \\/ /\n"
                        + "    \\  /\\  /  __/ | (_| (_) | | | | | |  __/ | || (_) | | |  | | |    | | |>  < \n"
                        + "     \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___|  \\__\\___/  |_|  |_|_|    |_|_/_/\\_\\\n"
                        + "                                                                                \n"
                        + "                                                                                \n"
                        + "     ^\n"
                        + "   /'|'\\\n"
                        + "  / \\|/ \\\n"
                        + "  | \\|/ |\n"
                        + "   \\ | /\n"
                        + "    \\|/\n"
                        + "     |\n"
                        + "                       \n";
        System.out.println(welcomeMessage);		
	}

}
