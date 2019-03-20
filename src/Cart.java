
import com.qlbhcafe.model.CTHoaDon;
import com.qlbhcafe.model.SanPham;
import com.qlbhcafe.test.testSQL;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author baotri1998
 */
public class Cart {

    public static void main(String[] args) {

        // Constructing An ArrayList
        List<SanPham> listWithDuplicateElements = new ArrayList<SanPham>();

        for (SanPham sp : testSQL.select()) {
            listWithDuplicateElements.add(sp);
        }

        System.out.println(listWithDuplicateElements);
        
        List<SanPham> listWithoutDuplicateElements = new ArrayList<SanPham>();
        for (SanPham element : listWithDuplicateElements) {
            // Check if element not exist in list, perform add element to list

            if (!listWithoutDuplicateElements.contains(element)) {
                listWithoutDuplicateElements.add(element);

            }
        }
        System.out.println(listWithoutDuplicateElements);
        // Printing listWithoutDuplicateElements
        List<String> listWithDuplicateElements1 = new ArrayList<String>();
        listWithDuplicateElements1.add("JAVA");
        listWithDuplicateElements1.add("J2EE");
        listWithDuplicateElements1.add("JSP");
        listWithDuplicateElements1.add("SERVLETS");
        listWithDuplicateElements1.add("JAVA");
        listWithDuplicateElements1.add("STRUTS");
        listWithDuplicateElements1.add("JSP");

        // Printing listWithDuplicateElements
        System.out.println("ArrayList With Duplicate Elements :");
        System.out.println(listWithDuplicateElements1);

        // Constructing Another ArrayList
        List<String> listWithoutDuplicateElements1 = new ArrayList<String>();
        for (String element1 : listWithDuplicateElements1) {
            // Check if element not exist in list, perform add element to list
            if (!listWithoutDuplicateElements1.contains(element1)) {
                listWithoutDuplicateElements1.add(element1);
            }
        }

        // Printing listWithoutDuplicateElements
        System.out.println("\nArrayList After Removing Duplicate Elements :");
        System.out.println(listWithoutDuplicateElements1);
    }

}
