import java.util.*;
import java.util.stream.Collectors;


public class Laptop {
    private String model;
    private int ramSizeGB;
    private int storageSizeGB;
    private String operatingSystem;
    private String color;

    public Laptop(String model, int ramSizeGB, int storageSizeGB, String operatingSystem, String color) {
        this.model = model;
        this.ramSizeGB = ramSizeGB;
        this.storageSizeGB = storageSizeGB;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public int getRamSizeGB() {
        return ramSizeGB;
    }

    public int getStorageSizeGB() {
        return storageSizeGB;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getColor() {
        return color;
    }

    public static Set<Laptop> createLaptops() {
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop("Samsung", 8, 512, "Windows", "Белый"));
        laptops.add(new Laptop("Appl", 16, 1024, "MacOS", "Серый"));
        laptops.add(new Laptop("Razor", 12, 256, "Linux", "Черный"));
        laptops.add(new Laptop("Xiomi", 14, 512, "Windows", "Белый"));
        laptops.add(new Laptop("Dragon", 12, 1024, "Linux", "Синий"));
        laptops.add(new Laptop("Invidia", 16, 512, "MacOS", "Синий"));
        return laptops;
    }

    public static Set<Laptop> filterLaptops(Set<Laptop> laptops, Map<String, Object> criteria) {
        return laptops.stream()
                .filter(laptop -> checkCriteria(laptop, criteria))
                .collect(Collectors.toSet());
    }

    private static boolean checkCriteria(Laptop laptop, Map<String, Object> criteria) {
        for (Map.Entry<String, Object> entry : criteria.entrySet()) {
            switch (entry.getKey()) {
                case "ramSizeGB":
                    if (laptop.getRamSizeGB() < (int) entry.getValue()) {
                        return false;
                    }
                    break;
                case "storageSizeGB":
                    if (laptop.getStorageSizeGB() < (int) entry.getValue()) {
                        return false;
                    }
                    break;
                case "operatingSystem":
                    if (!laptop.getOperatingSystem().equalsIgnoreCase((String) entry.getValue())) {
                        return false;
                    }
                    break;
                case "color":
                    if (!laptop.getColor().equalsIgnoreCase((String) entry.getValue())) {
                        return false;
                    }
                    break;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Set<Laptop> laptops = createLaptops();

        Map<String, Object> filterCriteria = requestFilterCriteria();

        Set<Laptop> filteredLaptops = filterLaptops(laptops, filterCriteria);

        displayFilteredLaptops(filteredLaptops);
    }

    private static Map<String, Object> requestFilterCriteria() {
        Scanner scanner = new Scanner(System.in);
        Map<String, Object> criteria = new HashMap<>();

        System.out.println("Введите цифру, соответствующую критерию фильтрации:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");

        String[] selectedCriteria = scanner.nextLine().split(" ");

        for (String selectedCriterion : selectedCriteria) {
            switch (selectedCriterion) {
                case "1":
                    System.out.println("Введите минимальный объем ОЗУ (в ГБ):");
                    int minRamSize = scanner.nextInt();
                    criteria.put("ramSizeGB", minRamSize);
                    break;
                case "2":
                    System.out.println("Введите минимальный объем ЖД (в ГБ):");
                    int minStorageSize = scanner.nextInt();
                    criteria.put("storageSizeGB", minStorageSize);
                    break;
                case "3":
                    System.out.println("Введите операционную систему:");
                    String operatingSystem = scanner.next();
                    criteria.put("operatingSystem", operatingSystem);
                    break;
                case "4":
                    System.out.println("Введите цвет:");
                    String color = scanner.next();
                    criteria.put("color", color);
                    break;
                default:
                    System.out.println("Некорректный выбор критерия: " + selectedCriterion);
            }
        }

        return criteria;
    }

    private static void displayFilteredLaptops(Set<Laptop> laptops) {
        if (laptops.isEmpty()) {
            System.out.println("Ноутбуки не найдены.");
        } else {
            System.out.println("Найденные ноутбуки:");
            laptops.forEach(laptop -> System.out.println("Модель: " + laptop.getModel() +
                    ", ОЗУ: " + laptop.getRamSizeGB() + " ГБ" +
                    ", Объем ЖД: " + laptop.getStorageSizeGB() + " ГБ" +
                    ", ОС: " + laptop.getOperatingSystem() +
                    ", Цвет: " + laptop.getColor()));
        }
    }
}

