package practice;

class poke1{

    int health = 100;
    int moves = 5;
    String name = "";
    String type = "";



    public poke1(String name, String type){

        this.name = name;
        this.type = type;
    }


    public poke1(int health, int moves){

        this.health = health;
        this.moves = moves;

    }


    public poke1(String name, String type, int health, int moves){

        this.name = name;
        this.moves = moves;
        this.type = type;
        this.health = health;
    }


    public String toString(){

        return ("Name: " +  this.name + "\n" + " Type: " + this.type + "\n" + " Health: " + this.health + "\n" + " Moves: " + this.moves);
    }



    public static void main(String[] args){

        poke1 charmander = new poke1("charmander", "fire");
        System.out.println(charmander);

        poke1 charmander2 = new poke1("charmander", "fire", 39, 4);
        System.out.print(charmander2);
    }
}