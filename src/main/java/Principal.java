import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es tu usuario?");
        String usuario = sc.nextLine();
        System.out.println("Cual es tu contraseña?");
        String contras = sc.nextLine();
        GitHub github = new GitHubBuilder().withPassword(usuario, contras).build();
        GHRepository repo = github.createRepository(
                "PruebasAcceso", "repositorio de prueba",
                "https://www.google.es/", false/*private*/);
        repo.addCollaborators(github.getUser("damiancastelao"));

    }
}
