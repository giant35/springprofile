/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springprofile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sihai
 */
@RestController
public class HelloController {
    @Value("${hello.msg}")
    String msg;
    
    @GetMapping("/hello")
    public String sayHello(){
        return msg;
    }
    
}
