package com.vtalent;

import org.springframework.stereotype.Controller;

@Controller  
public class HelloController1 {  
@RequestMapping("/hello1")  
    public String display()  
    {  
        return "viewpage1";  
    }     
}
