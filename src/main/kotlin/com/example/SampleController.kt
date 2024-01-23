package com.example

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class SampleController() {
    @GetMapping("")
    fun doMagic() : String {
        println("doing some magic...")
        return "OK"
    }
}
