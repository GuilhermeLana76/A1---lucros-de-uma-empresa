package empresaPOO;

public class Calculo {

    private Double MediaCliente;
    private Double MediaGeral;

    public Calculo(Double mediaCliente, Double mediaGeral) {

    MediaCliente = mediaCliente;
    MediaGeral = mediaGeral;

    }

    public Double getMediaCliente() {
        return MediaCliente;
    }

    public void setMediaCliente(Double valor) {

        Double media = valor / 2;
        System.out.println("A media gasta por esse cliente é " + media + "R$");
        
    }

    public Double getMediaGeral() {
        return MediaGeral;
    }

    public void setMediaGeral(Double totalGastos, int nClientes){

        double MediaGeral = totalGastos / nClientes;
         System.out.println("Média gasto geral: " + MediaGeral + "R$");
    }


}
    
