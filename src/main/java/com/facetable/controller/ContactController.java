package com.facetable.controller;

import com.facetable.model.Contact;
import com.facetable.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class ContactController {

  @Autowired
ContactService contactService;

  //get all records from database
  @GetMapping("/")
  public String viewHomePage(Model model) {
    List<Contact> listContacts = contactService.getAll();
    model.addAttribute("listContacts", listContacts);
    return "index";
  }

  //get data of contact by face ID
  @GetMapping("/face/{id}")
  public ModelAndView viewFullFace(@PathVariable(name = "id")int id) {
    ModelAndView mav = new ModelAndView("view_face");
    Contact contact = contactService.get(id).orElse(null);
    mav.addObject("contact", contact);
    return mav;
  }

}
