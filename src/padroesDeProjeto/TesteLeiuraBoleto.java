package padroesDeProjeto;

public class TesteLeiuraBoleto {
    public static void main(String[] args) {
        ProcessarBoletos processador = new ProcessarBoletos(ProcessarBoletos::lerBancoBradesco);
        String nomeArquivo = TesteLeiuraBoleto.class.getResource("/bradesco-1.csv").getPath();
        processador.processar(nomeArquivo);
    }
}
