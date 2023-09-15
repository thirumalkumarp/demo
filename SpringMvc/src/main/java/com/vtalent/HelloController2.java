package com.vtalent;

import org.springframework.stereotype.Controller;

@Controller  
public class HelloController2 {  
@RequestMapping("/hello2")  
    public String display()  
    {  
        return "viewpage2";  
    }     
}  
}
