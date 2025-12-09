//package com.demo.springdemo;
//import org.springframework.web.bind.annotation.*;
//
//public class SpringController {
//    @GetMapping("/")
//    public String hello() {
//        return "Hello Spring Boot!";
//    }
//
//    @GetMapping("/hello")
//    public String basicHello() {
//        return "Hello again!";
//    }
//
//    @GetMapping("/hello/{name}")
//    public String helloName(@PathVariable String name) {
//        return "Hi " + name + "!";
//    }
//
//    @GetMapping("/greet")
//    public String greetWithQuery(@RequestParam(defaultValue = "world") String name) {
//        return "Greetings, " + name + "!";
//    }
//
//    @GetMapping("/MyFavoriteArtist")
//    public String myFavArtist() {
//        return "My favorite artist is Coldplay";
//    }
//
//    // DTO inside controller
//    static class Person {
//        public int id;
//        public String name;
//
//        public Person(int id, String name) {
//            this.id = id;
//            this.name = name;
//        }
//    }
//
//    @GetMapping("/person")
//    public Person getPerson() {
//        return new Person(1, "Remsey");
//    }
//
//    @GetMapping("/people")
//    public java.util.List<Person> getPeople() {
//        return java.util.List.of(
//                new Person(1, "Remsey"),
//                new Person(2, "Sarah"),
//                new Person(3, "Bilal")
//        );
//    }
//
//    static class NameRequest {
//        public String name;
//    }
//
//    @PostMapping("/hello-json")
//    public Person createPerson(@RequestBody NameRequest body) {
//        return new Person(99, body.name);
//    }
//
//    @PutMapping("/person/{id}")
//    public Person updatePerson(
//            @PathVariable int id,
//            @RequestBody NameRequest body) {
//        return new Person(id, body.name + " (updated)");
//    }
//
//    @DeleteMapping("/person/{id}")
//    public String deletePerson(@PathVariable int id) {
//        return "Person with ID " + id + " deleted (fake).";
//    }
//}
//
//
