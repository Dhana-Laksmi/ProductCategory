package com.dhana.productcategory.Controller;

import com.dhana.productcategory.Service.CategoryService;
import com.dhana.productcategory.model.CategoryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping
    public List<CategoryModel> getAllCategories(){
        return categoryService.getAllCategory();
    }


//    @RequestMapping(value = "/persons", method = RequestMethod.GET)
//    HttpEntity<PagedResources<Person>> persons(Pageable pageable,
//                                               PagedResourcesAssembler assembler) {
//
//        Page<Person> persons = repository.findAll(pageable);
//        return new ResponseEntity<>(assembler.toResources(persons), HttpStatus.OK);
//    }
}
