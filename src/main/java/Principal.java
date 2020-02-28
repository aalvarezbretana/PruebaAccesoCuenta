import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        GitHub github = GitHubBuilder.fromPropertyFile("/home/local/DANIELCASTELAO/aalvarezbretana/IdeaProjects/PluginNetbeans/.github").build();
        GHRepository repo = github.createRepository(
                "PruebasAccesoFile", "repositorio de prueba",
                "https://www.google.es/", false/*private*/);
        repo.addCollaborators(github.getUser("damiancastelao"));

    }
}
