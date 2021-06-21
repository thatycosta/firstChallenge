package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Coffee implements Serializable {
    private String name;
    private String description;

    public Coffee(){}

    public Coffee(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static List<Coffee> getAll(){
        ArrayList<Coffee> coffees = new ArrayList<>();
        coffees.add(new Coffee("Café espresso", "O espresso, receita tradicional, é o café puro e feito sob pressão, sem adição de leite ou qualquer outro ingrediente. Quando bem feito, ele apresenta duas camadas: a bebida e seu creme (espuma)."));
        coffees.add(new Coffee("Cappuccino", "O cappuccino é uma deliciosa invenção italiana, que mistura o café espresso com leite vaporizado, resultando em um creme bem consistente."));
        coffees.add(new Coffee("Irish coffee", "Receita criada na Irlanda, o Irish coffee leva, além do café, o tradicional uísque irlandês e uma camada de creme."));
        coffees.add(new Coffee("Café mocha", "O mocha ou mocaccino é para os fãs de chocolate, já que é feito com café espresso, leite vaporizado, espuma de leite e calda de chocolate."));
        coffees.add(new Coffee("Café macchiato", "O macchiato é uma versão adocicada do espresso com uma “macchia di latte” (mancha de leite) vaporizada, que traz cremosidade e valoriza os açúcares da bebida."));
        coffees.add(new Coffee("Caffè latte", "O caffè latte também tem origem italiana e nada mais é do que o café com leite, também conhecido como pingado em algumas regiões do Brasil."));
        return coffees;
    }
}
