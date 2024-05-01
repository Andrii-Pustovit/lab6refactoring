package task1;

public class Car {
    private String makeModel;
    private String engineType;
    private String ownerName;

    public Car(String makeModel, String engineType, String ownerName) {
        this.makeModel = makeModel;
        this.engineType = engineType;
        this.ownerName = ownerName;
    }

    // Геттери та сеттери для доступу до полів

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    // Метод для відображення інформації про автомобіль
    public void displayCarInfo() {
        System.out.println("Make/Model: " + makeModel);
        System.out.println("Engine Type: " + engineType);
        System.out.println("Owner: " + ownerName);
    }
}

