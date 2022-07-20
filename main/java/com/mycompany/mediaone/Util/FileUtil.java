package com.mycompany.mediaone.Util;

import com.mycompany.mediaone.Model.Product;
import com.mycompany.SharedType.EProductType;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FileUtil<T> {

    private static final String productFilePath = "C:\\Users\\MY LAPTOP\\OneDrive\\Documents\\NetBeansProjects\\MediaOne\\src\\main\\java\\com\\mycompany\\DataFile\\Product.txt";
    private static final String orderFilePath = "Product.txt";

    public FileUtil() {
    }

//    public static void main(String args[]) throws IOException, ClassNotFoundException {
//        List<Object> productListItems = new ArrayList();
//        productListItems.add(new Product("002", "Chipmunk", EProductType.FILMCD, 20, 40000, 50000));
//        productListItems.add(new Product("003", "Titan", EProductType.FILMCD, 20, 40000, 50000));
//        writeListToFile("product", productListItems);
//        var productList = readFile("product");
//        for (var object : productList) {
//            System.out.println(object);
//        }
//
//    }
    public void writeListToFile(String objectName, List<T> listObject) throws IOException {
        try {
            File file = new File(("product".equals(objectName) ? productFilePath : orderFilePath));
            ObjectOutputStream objectFile = new ObjectOutputStream(new FileOutputStream(file));

            // Write objects to file
            for (Object object : listObject) {
                objectFile.writeObject(object);
            }

            objectFile.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        }
    }

    public List<T> readFile(String objectName) throws IOException, ClassNotFoundException {
        ArrayList<T> objectsList = new ArrayList<>();
        File file = new File(("product".equals(objectName) ? productFilePath : orderFilePath));
        ObjectInputStream objectFile = new ObjectInputStream(new FileInputStream(file));

        while (true) {
            try {
                T obj = (T) objectFile.readObject();
                System.out.println(obj.toString());
                objectsList.add(obj);

            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println("Error initializing stream");
                break;
            }

        }
        return objectsList;
    }
}
