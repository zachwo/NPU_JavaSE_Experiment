import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * 图书借阅系统的主控类
 */
public class LibrarySystem {
    protected ArrayList<String> items;

    public void loadCatalogFromFile(String fileName) throws IOException {
        items = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String str = br.readLine();
        while (str != null) {
            items.add(str);
            str = br.readLine();
        }
        br.close();
    }

    public void saveCatalogToFile(String fileName) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        for (String item :items){
            bw.write(item);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    public void displayCatalogItems(String fileName) throws IOException {
        loadCatalogFromFile(fileName);
        for (String item : items){
            System.out.println(item);
        }

    }


    public static void main(String[] args) throws IOException, ParseException {
        String fileName = "/Users/wangze/IdeaProjects/NPU_JavaSE_Experiment/2021_09_11/material/catalog.dat";

        LibrarySystem librarySystem = new LibrarySystem();
        librarySystem.displayCatalogItems(fileName);

        Catalog catalog = new Catalog();
//        Book book = new Book("B100","Java从入门到放弃",new Date(System.currentTimeMillis()),"张三",1500);
//        catalog.addItem(book);
//        catalog.removeItem(book);

        System.out.println();
//        CatalogItem catalogItem1 = catalog.GetItem("B001");
//        System.out.println(catalogItem1);
        CatalogItem catalogItem2 = catalog.getItem(3);
        System.out.println(catalogItem2);

        System.out.println("记录总数量："+catalog.getNumberOfItems());





    }
}
