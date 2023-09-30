package hexlet.code;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(name = "gendiff", version = "gendiff 1.0", mixinStandardHelpOptions = true,
            description = "Compares two configuration files and shows a difference.")
    class App implements Runnable {

        @Option(names = {"-h", "--help"}, description = "Show this @|blue help|@ message and exit.")
        private String help;
//        @Option(names = {"-V", "--version"}, description = "Print version information and exit.")
//        private String version;

        @Override
        public void run() {
            System.out.println("Hello World!");
        }

        public static void main(String[] args) {
            System.exit(new CommandLine(new App()).execute(args));

        }
    }
