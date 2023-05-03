public class Principal {
    public static void main(String[] args) {
        Bike bike = new Bike("Magrela","Monarcosa","Preto Perolado", 2007) ;
        System.out.println("Bike");
        System.out.println("Nome: "+bike.getNome());
        System.out.println("Modelo: "+bike.getModelo());
        System.out.println("Cor: "+bike.getCor());
        System.out.println("Ano: "+bike.getAno());
        System.out.println();


        Mobila mobila = new Mobila("Mobilosa","Caloi","Preto Perolado", 2000) ;
        System.out.println("Mobila");
        System.out.println("Nome: "+mobila.getNome());
        System.out.println("Modelo: "+mobila.getModelo());
        System.out.println("Cor: "+mobila.getCor());
        System.out.println("Ano: "+mobila.getAno());
        System.out.println();


        Patinete patinete = new Patinete("Patinhas","Dinheiro","Preto Perolado", 2010) ;
        System.out.println("Patinete");
        System.out.println("Nome: "+patinete.getNome());
        System.out.println("Modelo: "+patinete.getModelo());
        System.out.println("Cor: "+patinete.getCor());
        System.out.println("Ano: "+patinete.getAno());
        System.out.println();
    }
}