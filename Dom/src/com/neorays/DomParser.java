package com.neorays;

import java.io.IOException;
import java.util.Iterator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomParser {

	private String name;
	public DomParser() {
	
	}
	public static void main(String[] args) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse("src/employee.xml");

			Element element = document.getDocumentElement();
			 System.out.println(element.getNodeName());

			NodeList list = element.getChildNodes();
			// EmployeeTo to=new EmployeeTo();
			 
			Node list1=	element.getFirstChild();
			if(!list1.hasChildNodes())
			{
				System.out.println("asd");
				System.out.println(list1.getTextContent());
			}
			
			/*
			 * for(int i=0;i<list.getLength();i++) {
			 * 
			 * Node node=list.item(i); if(node.getNodeType()==Node.ELEMENT_NODE)
			 * { if(node.hasChildNodes()) { System.out.println("inside"); //
			 * Node node2=node.getFirstChild(); Node
			 * node3=node.getNextSibling(); // System.out.println(node3.); } } }
			 */

			//

		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
