package com.neorays;

import java.io.File;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Marshaling 
{
	public static void main(String[] args) throws JAXBException {
		Employee employee=new Employee();
		employee.setEmpno(101);
		employee.setEname("sanju");
		employee.setSal(20.00);
		
		JAXBContext context=JAXBContext.newInstance(Employee.class);
		
	Marshaller marshaller	=context.createMarshaller();
	/*File file =new File("emp.xml");
	marshaller.marshal(employee,file);
	System.out.println("done");*/
	
	StringWriter writer =new StringWriter();
			marshaller.marshal(employee, writer);
String str=			writer.toString();
System.out.println(str);
	}

}
