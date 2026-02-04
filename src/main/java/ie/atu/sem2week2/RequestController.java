package ie.atu.sem2week2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class RequestController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name) {
        return "Hello " + name;
    }

    @GetMapping("/details")
    public String details(@RequestParam String name, @RequestParam Integer age)
    {
        return "Hello " + name + " " + age;
    }

    @GetMapping("/person")
    public Person getPerson()
    {
        Person person = new Person("Adam", 20);
        return person;
    }

    @GetMapping("/calculate")
    public Calculation calculate(
            @RequestParam int num1,
            @RequestParam int num2,
            @RequestParam String operation) {

        double result;

        switch(operation.toLowerCase()) {

            case "add":
                result = num1 + num2;
                break;

            case "subtract":
                result = num1 - num2;
                break;

            case "multiply":
                result = num1 * num2;
                break;

            case "divide":

                if(num2 == 0){
                    return new Calculation("Divide by zero ERROR!", 0);
                }

                result = (double) num1 / num2;
                break;

            default:
                throw new IllegalArgumentException("Invalid operation. Use add, subtract, multiply, or divide.");
        }

        return new Calculation(operation, result);
    }

}