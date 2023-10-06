package hexlet.code;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

import java.io.File;

@Command(name = "gendiff", version = "gendiff 1.0", mixinStandardHelpOptions = true,
            description = "Compares two configuration files and shows a difference.")
    class App implements Runnable {

        @Option(names = {"-h", "--help"}, usageHelp = true,
                description = "Show this @|blue help|@ message and exit.")
        private boolean helpRequested = false;

        @Option(names = { "-V", "--version" }, versionHelp = true,
                description = "Print version information and exit.")
        boolean versionRequested;

        @Option(names = { "-f", "--format=format" },
                defaultValue = "stylish",
                description = "output format [default: stylish]")
        String format;

        @Parameters(index = "0", description = "path to first file")
        private File filepath1;

        @Parameters(index = "1", description = "path to second file")
        private File filepath2;

        @Override
        public void run() {
            System.out.println("Hello World!");
        }

        public static void main(String[] args) {
            System.exit(new CommandLine(new App()).execute(args));

        }
    }
