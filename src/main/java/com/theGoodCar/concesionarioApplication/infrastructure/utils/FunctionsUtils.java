package com.theGoodCar.concesionarioApplication.infrastructure.utils;

import com.theGoodCar.concesionarioApplication.domain.Car;
import com.theGoodCar.concesionarioApplication.domain.actions.CarsAction;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.LinkedList;
import java.util.Map;

public class FunctionsUtils {

    @Autowired
    private CarsAction carsAction;

    public static LinkedList<Car> createDefaultCars() {
        LinkedList<Car> listCars = new LinkedList<Car>();

        LinkedList<String> interiorFeatures = interiorFeatures();
        LinkedList<String> exteriorFeatures = exteriorFeatures();
        LinkedList<String> safetyFeatures = safetyFeatures();

        listCars.add(Car.builder()
                .serialNumber(1)
                .brand("Audi")
                .bodyType("Sedan")
                .model("A8 L")
                .yearManufacturer(2015)
                .carDetails("Body Type: Sedan, Year of Manufacturer: 2015, Drive Type: FWD, Engine: 2.0L Turbo I4 190hp 236ft. Lbs, Fuel Type: Gasoline")
                .interiorFeatures(interiorFeatures)
                .exteriorFeatures(exteriorFeatures)
                .safetyFeatures(safetyFeatures)
                .othersFeatures("")
                .color("Black")
                .transmision("Manual")
                .description("")
                .price("$37.700,00")
                .image("audiA8.jpg")
                .build()
                );

        listCars.add(Car.builder()
                .serialNumber(2)
                .brand("BMW")
                .bodyType("Sedan")
                .model("M3")
                .yearManufacturer(2018)
                .carDetails("Body Type: Sedan, Year of Manufacturer: 2018, Drive Type: FWD, Engine: 2.0L Turbo I4 190hp 236ft. Lbs, Fuel Type: Gasoline")
                .interiorFeatures(interiorFeatures)
                .exteriorFeatures(exteriorFeatures)
                .safetyFeatures(safetyFeatures)
                .othersFeatures("")
                .color("Dark Blue")
                .transmision("automatic")
                .description("Un bonito coche")
                .price("$30.400,00")
                .image("bmwM3.jpg")
                .build()
        );

        listCars.add(Car.builder()
                .serialNumber(3)
                .brand("Ford")
                .bodyType("Sedan")
                .model("Taurus")
                .yearManufacturer(2019)
                .carDetails("Body Type: Sedan, Year of Manufacturer: 2018, Drive Type: FWD, Engine: 2.0L Turbo I4 190hp 236ft. Lbs, Fuel Type: Gasoline")
                .interiorFeatures(interiorFeatures)
                .exteriorFeatures(exteriorFeatures)
                .safetyFeatures(safetyFeatures)
                .othersFeatures("")
                .color("Crimson red")
                .transmision("automatic")
                .description("Un coche genial")
                .price("$27.000,00")
                .image("fordTaurus.jpg")
                .build()
        );

        listCars.add(Car.builder()
                .serialNumber(4)
                .brand("Hyundai")
                .bodyType("Sedan")
                .model("Sonata")
                .yearManufacturer(2017)
                .carDetails("Body Type: Sedan, Year of Manufacturer: 2018, Drive Type: FWD, Engine: 2.0L Turbo I4 190hp 236ft. Lbs, Fuel Type: Gasoline")
                .interiorFeatures(interiorFeatures)
                .exteriorFeatures(exteriorFeatures)
                .safetyFeatures(safetyFeatures)
                .othersFeatures("")
                .color("Red")
                .transmision("automatic")
                .description("Un precioso coche coreano")
                .price("$23.000,00")
                .image("hyundaiSonata.jpg")
                .build()
        );

        listCars.add(Car.builder()
                .serialNumber(5)
                .brand("Toyota")
                .bodyType("Crossover")
                .model("Tacoma")
                .yearManufacturer(2018)
                .carDetails("Body Type: Sedan, Year of Manufacturer: 2018, Drive Type: FWD, Engine: 2.0L Turbo I4 190hp 236ft. Lbs, Fuel Type: Gasoline")
                .interiorFeatures(interiorFeatures)
                .exteriorFeatures(exteriorFeatures)
                .safetyFeatures(safetyFeatures)
                .othersFeatures("")
                .color("White Smoke")
                .transmision("automatic")
                .description("Conquista el campo")
                .price("$30.000,00")
                .image("toyotaTacoma.jpg")
                .build()
        );

        listCars.add(Car.builder()
                .serialNumber(6)
                .brand("Nissan")
                .bodyType("Crossover")
                .model("Frontier")
                .yearManufacturer(2018)
                .carDetails("Body Type: Sedan, Year of Manufacturer: 2018, Drive Type: FWD, Engine: 2.0L Turbo I4 190hp 236ft. Lbs, Fuel Type: Gasoline")
                .interiorFeatures(interiorFeatures)
                .exteriorFeatures(exteriorFeatures)
                .safetyFeatures(safetyFeatures)
                .othersFeatures("")
                .color("metallic black")
                .transmision("automatic")
                .description("Conquista el campo")
                .price("$22.000,00")
                .image("nissanFrontier.jpg")
                .build()
        );

        listCars.add(Car.builder()
                .serialNumber(7)
                .brand("Nissan")
                .bodyType("Crossover")
                .model("Armada")
                .yearManufacturer(2018)
                .carDetails("Body Type: Sedan, Year of Manufacturer: 2018, Drive Type: FWD, Engine: 2.0L Turbo I4 190hp 236ft. Lbs, Fuel Type: Gasoline")
                .interiorFeatures(interiorFeatures)
                .exteriorFeatures(exteriorFeatures)
                .safetyFeatures(safetyFeatures)
                .othersFeatures("")
                .color("metallic black")
                .transmision("automatic")
                .description("Conquista el campo")
                .price("$39.000,00")
                .image("nissanArmada.jpg")
                .build()
        );

        listCars.add(Car.builder()
                .serialNumber(8)
                .brand("Mitsubishi")
                .bodyType("Sedan")
                .model("Outlander")
                .yearManufacturer(2014)
                .carDetails("Body Type: Sedan, Year of Manufacturer: 2018, Drive Type: FWD, Engine: 2.0L Turbo I4 190hp 236ft. Lbs, Fuel Type: Gasoline")
                .interiorFeatures(interiorFeatures)
                .exteriorFeatures(exteriorFeatures)
                .safetyFeatures(safetyFeatures)
                .othersFeatures("")
                .color("mate blue")
                .transmision("automatic")
                .description("Conquista el campo")
                .price("$35.000,00")
                .image("mitsubishiOutlander.jpg")
                .build()
        );

        listCars.add(Car.builder()
                .serialNumber(9)
                .brand("Toyota")
                .bodyType("Crossover")
                .model("RAV4")
                .yearManufacturer(2018)
                .carDetails("Body Type: Sedan, Year of Manufacturer: 2018, Drive Type: FWD, Engine: 2.0L Turbo I4 190hp 236ft. Lbs, Fuel Type: Gasoline")
                .interiorFeatures(interiorFeatures)
                .exteriorFeatures(exteriorFeatures)
                .safetyFeatures(safetyFeatures)
                .othersFeatures("")
                .color("lead")
                .transmision("manual")
                .description("Conquista el campo")
                .price("$22.400,00")
                .image("toyotaRav4.jpg")
                .build()
        );

        return listCars;
    }

    public static LinkedList<Car> paginationCars(int numPagination, int numCards) {
        LinkedList<Car> listCars = createDefaultCars();
        LinkedList<Car> carsPagination = new LinkedList<>();

        for (int i = (numPagination-1)*numCards+1; i <= numPagination*numCards; i++) {
            if (i <= listCars.size()) {
                carsPagination.add(listCars.get(i-1));
            }
        }

        return carsPagination;
    }

    public static int calculateNumberPages(int numPagination) {
        LinkedList<Car> listCars = createDefaultCars();
        int numberCars = listCars.size();
        if (numberCars%numPagination == 0) {
            return numberCars/numPagination;
        } else {
            return numberCars/numPagination + 1;
        }
    }

    public static LinkedList<String> interiorFeatures() {
        LinkedList<String> interiorFeatures = new LinkedList<String>();

        interiorFeatures.add("Bluetooth");
        interiorFeatures.add("iPod / Aux Input");
        interiorFeatures.add("Leather Seats");
        interiorFeatures.add("Navigation System");
        interiorFeatures.add("Premium Audio System");

        return interiorFeatures;
    }

    public static LinkedList<String> exteriorFeatures() {
        LinkedList<String> exteriorFeatures = new LinkedList<String>();

        exteriorFeatures.add("Premium Wheels");
        exteriorFeatures.add("Spoiler");

        return exteriorFeatures;
    }

    public static LinkedList<String> safetyFeatures() {
        LinkedList<String> safetyFeatures = new LinkedList<String>();

        safetyFeatures.add("Lane Departure Warning System");
        safetyFeatures.add("Blind Spot Detection");
        safetyFeatures.add("Blind Spot Detection");
        safetyFeatures.add("Parking Sensors");

        return safetyFeatures;
    }

    public static Car createCar(Map<String, String> allParams) {
        int newSerialNumber = createDefaultCars().getLast().getSerialNumber() + 1;
        LinkedList<String> interiorFeatures = interiorFeatures();
        LinkedList<String> exteriorFeatures = exteriorFeatures();
        LinkedList<String> safetyFeatures = safetyFeatures();

        Car car = Car.builder()
                .serialNumber(newSerialNumber)
                .brand(allParams.get("brand"))
                .bodyType(allParams.get("bodyType"))
                .model(allParams.get("model"))
                .yearManufacturer(Integer.parseInt(allParams.get("yearManufacturer")))
                .carDetails(allParams.get("carDetails"))
                .interiorFeatures(interiorFeatures)
                .exteriorFeatures(exteriorFeatures)
                .safetyFeatures(safetyFeatures)
                .othersFeatures(allParams.get("otherFeatures"))
                .color(allParams.get("color"))
                .transmision(allParams.get("transmission"))
                .description(allParams.get("description"))
                .price(allParams.get("price"))
                .image("audiA8.jpg")
                .build();

        return car;
    }

}
