public class main {
    public static void main(String[] args) {

        //Criando um objeto
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da Folha";
        naruto.idade = 12;
        naruto.mensagem();
        naruto.golpeNinja();

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.idade = 13;
        sasuke.altura = 1.4;
        sasuke.sharinganAtivado();
        sasuke.golpeNinja();


    }
}
