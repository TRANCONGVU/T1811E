package com.example.demo001.controller;

import com.example.demo001.entity.product;
import com.example.demo001.model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductController {
    //step 2:goi model
    @Autowired//dependence injection(DI)
    ProductModel productModel;
    @RequestMapping(path = "/product",method = RequestMethod.GET)
    public String createProduct(@ModelAttribute product product){
        return "product-form";
    }
    @RequestMapping(path = "/product",method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute product product, Model model){
        model.addAttribute("product",product);
        productModel.save(product);
        //step 3 tra ve view
        return "save-success";
    }
}
