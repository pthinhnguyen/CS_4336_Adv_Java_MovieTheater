/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package env;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Thinh Nguyen
 */
public class Env {
    private final String url = "jdbc:derby://localhost:1527/MovieDB";
    private final String username = "app";
    private final String password = "app";
    
    public Env() {
//        try {
//            InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("src/env/jdbc_conn.xml");
//            File xmlDocument = new File();
//            Files.copy(inputStream, xmlDocument, StandardCopyOption.REPLACE_EXISTING);
//
//            // DOM Factory
//            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//
//            // Parsing the document
//            DocumentBuilder documentBuilder = factory.newDocumentBuilder();
//            Document document = documentBuilder.parse(xmlDocument);
//
//            this.url = document.getElementsByTagName("url").item(0).getTextContent();
//            this.username = document.getElementsByTagName("username").item(0).getTextContent();
//            this.password = document.getElementsByTagName("password").item(0).getTextContent();
//                
//        } catch (SAXException | IOException | ParserConfigurationException e) {
//            e.printStackTrace();
//        }
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
