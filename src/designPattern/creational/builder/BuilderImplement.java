package designPattern.creational.builder;

public class BuilderImplement {
    public static void main(String[] args) {
        House house = new HouseBuilderImpl()
            .setStructure("structure1")
            .setRoot("root1")
            .build();
        System.out.println(house);
    }
}

class House {
    String structure;
    String root;
    int area;

    public House() {
    }

    public House(String structure, String root, int area) {
        this.structure = structure;
        this.root = root;
        this.area = area;
    }
    // Setter
    public void setStructure(String structure) {
        this.structure = structure;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "House{" +
            "structure='" + structure + '\'' +
            ", root='" + root + '\'' +
            ", area=" + area +
            '}';
    }

    public String getStructure() {
        return structure;
    }

    public String getRoot() {
        return root;
    }

    public int getArea() {
        return area;
    }
}

interface IHouseBuilder {
    IHouseBuilder setStructure(String structure);
    IHouseBuilder setRoot(String root);
    IHouseBuilder setArea(int area);
    House build();
}

class HouseBuilderImpl implements IHouseBuilder {
    House house = new House();
    @Override
    public IHouseBuilder setStructure(String structure) {
        house.setStructure(structure);
        return this;
    }

    @Override
    public IHouseBuilder setRoot(String root) {
        house.setRoot(root);
        return this;
    }

    @Override
    public IHouseBuilder setArea(int area) {
        house.setArea(area);
        return this;
    }

    @Override
    public House build() {
        if (house.getStructure() == null) {
            throw new IllegalArgumentException("Structure is required");
        }
        return house;
    }
}
