mport java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class YearlyReport {
    private final List<String> listReport;
    private final List<String> month;
    private final List<String> amount;
    private final List<String> isExpense;
    private String year;
    private String nameMonth;
    private int count;
    public YearlyReport() {
        this.month = new ArrayList<>();
        this.amount = new ArrayList<>();
        this.isExpense = new ArrayList<>();
        this.listReport = new ArrayList<>();
    }
    FileReader fileReader = new FileReader();
    public class FileReader {
        ArrayList<String> readFileContents(String fileName) {
            String path = "./resources/" + fileName;
            try {
                return new ArrayList<>(Files.readAllLines(Path.of(path)));
            } catch (IOException e) {
                System.out.println("Невозможно прочитать файл с отчётом. Возможно, файл отсутствует в нужной директории.");
                return new ArrayList<>();
            }
        }

    }
}
