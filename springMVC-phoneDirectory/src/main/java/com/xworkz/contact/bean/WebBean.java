package com.xworkz.contact.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.contact.DTO.ContactDTO;
import com.xworkz.contact.entity.ContactEntity;
import com.xworkz.contact.service.ContactServiceImpl;

@Component
@RequestMapping("/")
public class WebBean {
	@Autowired
	private ContactServiceImpl contactServiceImpl;

	public WebBean(ContactServiceImpl contactServiceImpl) {
		this.contactServiceImpl = contactServiceImpl;
	}

	public WebBean() {
		System.out.println("Invoked WebBean constructor");
	}

	@RequestMapping("click.do")
	public String onClick(ContactDTO contactDto, Model model) {
		System.out.println("Invoked Onclick ");
		System.out.println(contactDto);

		ContactEntity entity = new ContactEntity(contactDto.getName(), contactDto.getMobile(), contactDto.getAddress(),
				contactDto.getLandmark(), contactDto.getLandlineNo(), contactDto.getCity(), contactDto.getPincode());
		boolean checkValidity = contactServiceImpl.validateAndSave(entity);
		if (checkValidity = true) {
			System.out.println("All properties are valid");
			model.addAttribute("message", "Contact saved Successfully : " + contactDto.getName());
		} else {
			System.out.println("invalid properties...!");
			model.addAttribute("message", "Contact not saved...!");
		}
		return "/contact.jsp";
	}
}
