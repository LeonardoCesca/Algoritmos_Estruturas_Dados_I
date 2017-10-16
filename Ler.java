import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Ler {
     Path caminho = Paths.get("C:\\Users\\leonardo-flach\\Documents\\NetBeansProjects\\leitor\\src\\exemplo.txt");
        
     public void ler(){
        try {
        
        byte[] texto = Files.readAllBytes(caminho);
        String leitura = new String(texto);
        
            System.out.println(leitura);
        
        }catch (Exception erro){
        
        
        }
     }
     }
