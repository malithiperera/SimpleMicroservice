package com.example.movie_Catelog_server.resources;

import com.example.movie_Catelog_server.models.CatelogItem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatelogResources {
    @GetMapping("{userid}")
    public List<CatelogItem> getCatalog(@PathVariable String userid){
        return Collections.singletonList(new CatelogItem("Harry Potter","Adventore magic movie",5));

    }


}
