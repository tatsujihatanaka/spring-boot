package com.tuyano.springboot.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonController {
	String names[] = {
			"tuyano", 
			"hanako",
			"taro",
			"sachiko",
			"ichiro"};
	String mails[] = {
			"syoda@tuyano.com",
			"hanako@flower",
			"taro@yamada",
			"sachiko@happy",
			"ichiro@baseball"
			};
	
	
	@RequestMapping("/json/{id}")
	public DataObject json(@PathVariable int id) {
		return new DataObject(id, names[id], mails[id]);
//		return new DataObject(1, names[1], mails[1]);
	}

}

class DataObject {
	private int id;
	private String name;
	private String value;
	public DataObject(int id, String name, String value) {
		super();
		this.id = id;
		this.name = name;
		this.value = value;
	}
	public int    getId()       {return id;}
	public String getName()  {return name;}
	public String getValue() {return value;}
	public void setId(int id)        {this.id = id;}
	public void setName(String name) {this.name = name;}
	public void setValue(String value) {this.value = value;}
}
