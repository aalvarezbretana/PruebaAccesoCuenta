import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        GitHub github = new GitHubBuilder().withOAuthToken("5112fd8e2008ef780c7cc8b8b3d910708d862b0b").build();
        GHRepository repo = github.createRepository(
                "PruebasAcceso", "repositorio de prueba",
                "https://www.google.es/", false/*private*/);
        repo.addCollaborators(github.getUser("damiancastelao"));

    }
}
