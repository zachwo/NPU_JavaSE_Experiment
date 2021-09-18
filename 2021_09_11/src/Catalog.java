import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;


public class Catalog implements Iterable<CatalogItem>{  //实现迭代器接口便于在主控程序中使用foreach进行循环
    private String addr = "/Users/wangze/IdeaProjects/NPU_JavaSE_Experiment/2021_09_11/material/catalog.dat";

    @Override
    public Iterator<CatalogItem> iterator() {
        return null;
    }

    /**
     * 添加记录
     * @param item
     */
    public void addItem(CatalogItem item) throws IOException {
        String str = item.toString();
        BufferedWriter bw = new BufferedWriter(new FileWriter(addr,true));
        bw.newLine();
        bw.write(str);
        bw.newLine();
        bw.flush();
        bw.close();
    }

    /**
     * 移除记录
     * @param item
     */
    public void removeItem(CatalogItem item) throws IOException {
        //从文件读出全部数据
        ArrayList<String> items = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(addr));
        String str = br.readLine();
        while (str != null) {
            items.add(str);
            str = br.readLine();
        }
        br.close();
        //删除特定数据
        for (int i = 0 ;i<items.size();i++){
            if (items.get(i).split("_")[1].equals(item.getCode())){
                items.remove(i);
                break;
            }
        }
        //将删除后的数据重新写回文件
        BufferedWriter bw = new BufferedWriter(new FileWriter(addr));
        for (String str1 : items){
            bw.write(str1);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    /**
     * 通过code获取记录
     * @param code
     * @return
     */
    public CatalogItem GetItem(String code) throws IOException, ParseException {
        //从文件读出全部数据
        ArrayList<String> items = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(addr));
        String str = br.readLine();
        while (str != null) {
            items.add(str);
            str = br.readLine();
        }
        br.close();

        CatalogItem catalogItem = null;
        for (int i = 0 ;i<items.size();i++){
            String[] strings = items.get(i).split("_");
            if (strings[1].equals(code)){
                if (strings[0].equals("Book")){
                    catalogItem = new Book(strings[1],strings[2], new SimpleDateFormat("yyyy-MM-dd").parse(strings[3]),strings[4],Integer.parseInt(strings[5]));
                }else {
                    catalogItem = new Recording(strings[1],strings[2], new SimpleDateFormat("yyyy-MM-dd").parse(strings[3]),strings[4],strings[5]);
                }
                break;
            }
        }
        return catalogItem;
    }

    /**
     * 通过index索引获取记录
     * @param index
     * @return
     */
    public CatalogItem getItem(int index) throws IOException, ParseException {
        //从文件读出全部数据
        ArrayList<String> items = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(addr));
        String str = br.readLine();
        while (str != null) {
            items.add(str);
            str = br.readLine();
        }
        br.close();

        CatalogItem catalogItem;
        if ((items.size()-1) < index){
            catalogItem = null;
        }else {
            String[] strings = items.get(index).split("_");
            if (strings[0].equals("Book")){
                 catalogItem = new Book(strings[1],strings[2], new SimpleDateFormat("yyyy-MM-dd").parse(strings[3]),strings[4],Integer.parseInt(strings[5]));
            }else {
                 catalogItem = new Recording(strings[1],strings[2], new SimpleDateFormat("yyyy-MM-dd").parse(strings[3]),strings[4],strings[5]);
            }
        }

        return catalogItem;
    }

    /**
     * 获取记录总数目
     * @return
     */
    public int getNumberOfItems() throws IOException {
        //从文件读出全部数据
        ArrayList<String> items = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(addr));
        String str = br.readLine();
        while (str != null) {
            items.add(str);
            str = br.readLine();
        }
        br.close();

        return items.size();
    }
}
