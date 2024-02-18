package com.example.test;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api", produces = "application/json; charset=utf8")

public class TestController {
    @GetMapping("/get")
    public String handleGetRequest() {
        return "GET 요청 처리";
    }

    @PostMapping("/post")
    public String handlePostRequest(@RequestBody String requestBody) {
        return "Post 요청 처리 : " + requestBody;
    }

    @PutMapping("/put")
    public String handlePutRequest(@RequestBody String requestBody) {
        return "Put 요청 처리 : " + requestBody;
    }

    @PatchMapping("/patch")
    public String handlePatchRequest(@RequestBody String requestBody) {
        return "Patch 요청 처리 : " + requestBody;
    }

    @DeleteMapping("/delete")
    public String handleDeleteRequest(@RequestBody String requestBody){
        return "Delete 요청 처리 : " + requestBody;
    }
}
