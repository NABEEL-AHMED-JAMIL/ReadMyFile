package com.read.file;


import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by Nabeel on 3/29/2017.
 */
// stand for Dom(Document Object Model)
public class DomParser {
    //
    public static void main(String[] args){
        //
        try {
            //
            File input = new File("DomParsing.xml");
            //
            SAXBuilder saxBuilder = new SAXBuilder();
            //
            Document document  = saxBuilder.build(input);
            //
            System.out.println("Root Element "+document.getRootElement().getName());
            //
            Element classElement = document.getRootElement();
            //
            List<Element> studentList = classElement.getChildren();
            //
            System.out.print("-------------------------------------");
            //
            for (int i = 0; i < studentList.size(); i++){
                //
                Element student = studentList.get(i);
                //----------------------------------
                System.out.println("\nCurrent Element :" + student.getName());
                Attribute attribute = student.getAttribute("rollno");
                System.out.println("Student roll no : " + attribute.getValue() );
                System.out.println("First Name : " + student.getChild("firstname").getText());
                System.out.println("Last Name : "+ student.getChild("lastname").getText());
                System.out.println("Nick Name : "+ student.getChild("nickname").getText());
                System.out.println("Marks : "+ student.getChild("marks").getText());

            }

        }catch (JDOMException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
