package org.sazonov.trips.controller;

import lombok.AllArgsConstructor;
import org.sazonov.trips.entity.Form.ItemForm;
import org.sazonov.trips.service.ChangeLogService;
import org.sazonov.trips.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class WebController {
    @Autowired
    private ItemService itemService;
    @Autowired
    private ChangeLogService changeLogService;

    /**
    *Home Page(/)
    */
    @GetMapping("/")
    public String index(Model model){
        changeLogService.save("Access to home(/) page");
        return "index";
    }
    /**
     * * Table(/table)
     * @param model
     * @return "table"
     */
    @GetMapping("table")
    public String table(Model model){
        model.addAttribute("items",itemService.findAll());
        changeLogService.save("Access to table(/table) page");
        return "table";
    }
    /**
     *  Test(/test)
     * @param model
     * @return "test"
     */
    @GetMapping("/test")
    public String test(Model model){
        ItemForm itemForm = new ItemForm();
        model.addAttribute("itemForm",itemForm);
        changeLogService.save("Access to test(/test) page");
        return "test";
    }
    /**
     * Test(/test)
     * @param model
     * @param itemForm
     * @return "redirect:table"
     */
    @PostMapping("/test")
    public String test1(Model model,
                       @ModelAttribute("itemForm")ItemForm itemForm){
        itemService.save(itemForm);
        changeLogService.save(itemForm.getFName()+" "+itemForm.getSName()+" "+" write the test");
        return "redirect:table";
    }
}
