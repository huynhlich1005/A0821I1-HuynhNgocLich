package com.codegym.demo.controller.admin;

import com.codegym.demo.model.entity.Product;
import com.codegym.demo.service.CategoryService;
import com.codegym.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping
        public String getAdminIndex(Model model, @RequestParam(defaultValue = "") String by, @RequestParam(defaultValue = "") String val){
            return viewPage(model,by,val,1,"title","asc");
        }

        @GetMapping("/page/{pageNum}")
        public String viewPage(Model model, String by,String val,@PathVariable int pageNum,String sortField, String sortDir){
            Pageable pageable = PageRequest.of(pageNum-1, 3,sortDir.equals("asc")?Sort.by(sortField).ascending():Sort.by(sortField).descending());
            Page<Product> res= productService.search(by,val,pageable);
            model.addAttribute("cate",categoryService.findAll());
            model.addAttribute("res",res);
            model.addAttribute("by",by);
            model.addAttribute("val",val);
            model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");
            return "";
        }

        @PostMapping("delete")
        public String deleteProduct(@RequestParam int[] id){
            productService.deleteById(id);
            return "/";
        }

        @PostMapping("create")
        public String addEditBlog(Product product){
            productService.save(product);
            return "/";
        }

}
