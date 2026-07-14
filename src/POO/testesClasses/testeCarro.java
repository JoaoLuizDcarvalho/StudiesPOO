package POO.testesClasses;

import POO.Dominio.ClasseCarro;

public class testeCarro {
    static void main(String[] args) {

        ClasseCarro Carro1 = new ClasseCarro();
            Carro1.marca = "Porche";
            Carro1.modelo = "911";
            Carro1.ano = 2020;
            Carro1.rodagem = 72.000F;

          ClasseCarro Carro2 = new ClasseCarro();

            Carro2.marca = "Mercedes-Benz";
            Carro2.modelo = "G63";
            Carro2.ano = 2017;
            Carro2.rodagem = 92.000F;

          ClasseCarro Carro3 = new ClasseCarro();
            Carro3.marca = "BMW";
            Carro3.modelo = "I8";
            Carro3.ano = 2016;
            Carro3.rodagem =  62.000F;

        System.out.println("Opções disponvieis:");
        System.out.println("\n" + Carro1.marca + " Modelo: "+ Carro1.modelo + "," + " com: " + Carro1.rodagem + "Km's" + " rodados," + " no Ano de: "+ Carro1.ano);
        System.out.println(Carro2.marca + " Modelo: "+ Carro2.modelo + "," + " com: " + Carro2.rodagem + "Km's" + " rodados," + " no Ano de: "+ Carro2.ano);
        System.out.println(Carro3.marca + " Modelo: "+ Carro3.modelo + "," + " com: " + Carro3.rodagem + "Km's" + " rodados," + " no Ano de: "+ Carro3.ano);
    }

}
