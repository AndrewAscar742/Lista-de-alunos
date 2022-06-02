import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class GravacaoAlunoTxt {
	
	public static void gravarArq(String aluno, String nomeArq) {
		Path p = Paths.get("C:\\Users\\Sony\\Desktop\\" + nomeArq);
		
			try {
				Files.write(p, aluno.getBytes(StandardCharsets.UTF_8));
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	public static List<String> lerArq(String nomeArq) {
		Path p = Paths.get("C:\\Users\\Sony\\Desktop\\" + nomeArq);
		
		try {
			return Files.readAllLines(p, StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
